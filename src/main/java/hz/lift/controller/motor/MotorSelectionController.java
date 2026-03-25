package hz.lift.controller.motor;

import hz.lift.model.motor.MotorSelectionRequest;
import hz.lift.model.motor.MotorSelectionResponse;
import hz.lift.service.motor.MotorRuleEngineService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/mada1")
public class MotorSelectionController {

    private final MotorRuleEngineService ruleEngineService;

    public MotorSelectionController(MotorRuleEngineService ruleEngineService) {
        this.ruleEngineService = ruleEngineService;
    }

    @GetMapping("/qryMotor")
    public MotorSelectionResponse qryMotor(
        @RequestParam(required = false) BigDecimal speed,
        @RequestParam(required = false) BigDecimal load,
        @RequestParam("q") BigDecimal q,
        @RequestParam("tl") BigDecimal tl,
        @RequestParam("wgtActualExtraDecoTotal") BigDecimal wgtActualExtraDecoTotal,
        @RequestParam(required = false) BigDecimal wgtCarDecorationTotal,
        @RequestParam(required = false) BigDecimal wgtCarEstimatedExtra,
        @RequestParam(required = false) Boolean hmc,
        @RequestParam(required = false) String carType,
        @RequestParam(required = false) String region
    ) {
        BigDecimal effectiveSpeed = speed != null ? speed : load;
        MotorSelectionRequest request = new MotorSelectionRequest(
            effectiveSpeed, q, tl, wgtActualExtraDecoTotal,
            wgtCarDecorationTotal, wgtCarEstimatedExtra, q,
            hmc, carType, region
        );
        return ruleEngineService.selectMotor(request);
    }

    @PostMapping("/qryMotor")
    public MotorSelectionResponse qryMotorPost(@RequestBody MotorSelectionRequest request) {
        return ruleEngineService.selectMotor(request);
    }
}
