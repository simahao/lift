package hz.lift.service.rail;

import hz.lift.model.rail.StandardCarGuideRailRequest;
import hz.lift.model.rail.StandardCarGuideRailResponse;
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

@Service
public class StandardCarGuideRailService {

    private static final Logger logger = LoggerFactory.getLogger(StandardCarGuideRailService.class);

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
        ClassPathResource resource = new ClassPathResource("rules/rail/standard-car-guide-rail-rules.yml");
        try (Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)) {
            MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
            rules = ruleFactory.createRules(reader);
            logger.info("Loaded {} rules from standard-car-guide-rail-rules.yml", rules.size());
            
            for (Rule rule : rules) {
                logger.debug("Rule: {} - Priority: {}", rule.getName(), rule.getPriority());
            }
        }
    }

    public StandardCarGuideRailResponse getSetting(StandardCarGuideRailRequest request) {
        if (request == null) {
            return StandardCarGuideRailResponse.of("NA", "NA", "Request is null");
        }

        logger.info("Evaluating rules for: qtyCarGrVariable={}, qtyCarGrHalf={}, qtyCarGrStandard={}, typCarGr={}", 
            request.getQtyCarGrVariable(), request.getQtyCarGrHalf(), 
            request.getQtyCarGrStandard(), request.getTypCarGr());

        Facts facts = new Facts();
        facts.put("request", request);
        
        GuideRailResult result = new GuideRailResult();
        facts.put("result", result);

        rulesEngine.fire(rules, facts);

        logger.info("Rule matched: {} -> result1={}, result2={}", result.matchedRule, result.result1, result.result2);

        return StandardCarGuideRailResponse.of(result.result1, result.result2, result.matchedRule);
    }

    public static class GuideRailResult {
        public String result1 = "NA";
        public String result2 = "NA";
        public String matchedRule = "No rule matched";
    }
}
