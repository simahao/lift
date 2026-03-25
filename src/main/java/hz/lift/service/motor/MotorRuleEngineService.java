package hz.lift.service.motor;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import hz.lift.model.motor.MotorSelectionRequest;
import hz.lift.model.motor.MotorSelectionResponse;

@Service
public class MotorRuleEngineService {

    private static final Logger logger = LoggerFactory.getLogger(MotorRuleEngineService.class);

    private Rules rules;
    private DefaultRulesEngine rulesEngine;

    @PostConstruct
    public void init() {
        try {
            loadRulesFromYaml();

            RulesEngineParameters parameters = new RulesEngineParameters()
                .skipOnFirstAppliedRule(true)
                .priorityThreshold(1000);

            rulesEngine = new DefaultRulesEngine(parameters);

            rulesEngine.registerRuleListener(new RuleListener() {
                @Override
                public boolean beforeEvaluate(Rule rule, Facts facts) {
                    logger.debug("Before evaluating rule: {}", rule.getName());
                    return true;
                }

                @Override
                public void afterEvaluate(Rule rule, Facts facts, boolean evaluationResult) {
                    logger.debug("Rule {} evaluated to: {}", rule.getName(), evaluationResult);
                }

                @Override
                public void beforeExecute(Rule rule, Facts facts) {
                    logger.info("Executing rule: {}", rule.getName());
                }

                @Override
                public void onSuccess(Rule rule, Facts facts) {
                    logger.info("Rule executed successfully: {}", rule.getName());
                }

                @Override
                public void onFailure(Rule rule, Facts facts, Exception exception) {
                    logger.error("Rule execution failed: {}", rule.getName(), exception);
                }
            });

            logger.info("Easy Rules engine initialized successfully with {} rules", rules.size());
        } catch (Exception e) {
            logger.error("Failed to initialize rules engine", e);
            throw new RuntimeException("Failed to load rules from YAML", e);
        }
    }

    private void loadRulesFromYaml() throws Exception {
        ClassPathResource resource = new ClassPathResource("rules/motor/mada1-rules.yml");
        try (Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)) {
            MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
            rules = ruleFactory.createRules(reader);
            logger.info("Loaded {} rules from motor/mada1-rules.yml", rules.size());

            for (Rule rule : rules) {
                logger.debug("Rule: {} - Priority: {}", rule.getName(), rule.getPriority());
            }
        }
    }

    public MotorSelectionResponse selectMotor(MotorSelectionRequest request) {
        if (request == null) {
            return MotorSelectionResponse.of("NA", "Request is null", null);
        }

        logger.info("Evaluating rules for: speed={}, q={}, tl={}, wgt={}",
            request.getSpeed(), request.getQ(), request.getTl(), request.getWgtActualExtraDecoTotal());

        Facts facts = new Facts();
        facts.put("request", request);

        MotorResult result = new MotorResult();
        facts.put("result", result);

        rulesEngine.fire(rules, facts);

        logger.info("Rule matched: {} -> {}", result.matchedRule, result.motor);

        return MotorSelectionResponse.of(result.motor, result.matchedRule, null);
    }

    public static class MotorResult {
        public String motor = "NA";
        public String matchedRule = "No rule matched";
    }
}
