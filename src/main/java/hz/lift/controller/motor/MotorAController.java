package hz.lift.controller.motor;

import hz.lift.model.motor.MotorARequest;
import hz.lift.model.motor.MotorAResponse;
import hz.lift.service.motor.MotorAService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/motor-a")
public class MotorAController {

    private final MotorAService motorAService;

    public MotorAController(MotorAService motorAService) {
        this.motorAService = motorAService;
    }

    @GetMapping("/qryMotor")
    public MotorAResponse getMotor(
        @RequestParam(required = false) Double speed,
        @RequestParam(required = false) Double q,
        @RequestParam(required = false) Double tl,
        @RequestParam(required = false) Double wgtCarDecorationTotal,
        @RequestParam(required = false) Double wgtActualExtraDecoTotal,
        @RequestParam(required = false) String carType,
        @RequestParam(required = false) String xType,
        @RequestParam(required = false) Boolean t7007_2022,
        @RequestParam(required = false) String typElevTsgT7001_2023Regist,
        @RequestParam(required = false) String kdm40,
        @RequestParam(required = false) Boolean imported,
        @RequestParam(required = false) Boolean en81_77_c1,
        @RequestParam(required = false) Double wgtCarEstimatedExtra,
        @RequestParam(required = false) String openType
    ) {
        MotorARequest request = new MotorARequest(speed, q, tl, wgtCarDecorationTotal,
            wgtActualExtraDecoTotal, carType, xType, t7007_2022,
            typElevTsgT7001_2023Regist, kdm40, imported, en81_77_c1,
            wgtCarEstimatedExtra, openType);
        return motorAService.getMotor(request);
    }

    @PostMapping("/qryMotor")
    public MotorAResponse getMotorPost(@RequestBody MotorARequest request) {
        return motorAService.getMotor(request);
    }
}