package hz.lift.service.rail;

import hz.lift.model.rail.StandardCwtGrRequest;
import hz.lift.model.rail.StandardCwtGrResponse;
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
public class StandardCwtGrService {

    private static final Logger logger = LoggerFactory.getLogger(StandardCwtGrService.class);

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
        ClassPathResource resource = new ClassPathResource("rules/rail/standard-cwt-gr-rules.yml");
        try (Reader reader = new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8)) {
            MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
            rules = ruleFactory.createRules(reader);
            logger.info("Loaded {} rules from standard-cwt-gr-rules.yml", rules.size());
            
            for (Rule rule : rules) {
                logger.debug("Rule: {} - Priority: {}", rule.getName(), rule.getPriority());
            }
        }
    }

    public StandardCwtGrResponse getSetting(StandardCwtGrRequest request) {
        if (request == null) {
            return StandardCwtGrResponse.of("NA", "Request is null");
        }

        logger.info("Evaluating rules for: qtyGrCwtVarALength={}, qtyGrCwtVarBLength={}, qtyCwtGrHalf={}, qtyCwtGrStandard={}, typCwtGr={}, dimCwtGrLengthStandard={}", 
            request.getQtyGrCwtVarALength(), request.getQtyGrCwtVarBLength(), 
            request.getQtyCwtGrHalf(), request.getQtyCwtGrStandard(),
            request.getTypCwtGr(), request.getDimCwtGrLengthStandard());

        Facts facts = new Facts();
        facts.put("request", request);
        
        CwtGrResult result = new CwtGrResult();
        facts.put("result", result);

        rulesEngine.fire(rules, facts);

        logger.info("Rule matched: {} -> {}", result.matchedRule, result.result);

        return StandardCwtGrResponse.of(result.result, result.matchedRule);
    }

    public static class CwtGrResult {
        public String result = "NA";
        public String matchedRule = "No rule matched";
    }
}
