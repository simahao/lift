package hz.lift.controller.rail;

import hz.lift.model.rail.OppoGrSettingRequest;
import hz.lift.model.rail.OppoGrSettingResponse;
import hz.lift.service.rail.OppoGrSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/oppo-gr")
public class OppoGrSettingController {

    private final OppoGrSettingService oppoGrSettingService;

    public OppoGrSettingController(OppoGrSettingService oppoGrSettingService) {
        this.oppoGrSettingService = oppoGrSettingService;
    }

    @GetMapping("/setting")
    public OppoGrSettingResponse getSetting(
        @RequestParam("typProductModel") String typProductModel,
        @RequestParam("typCarGr") String typCarGr,
        @RequestParam("typMacHoisting") String typMacHoisting,
        @RequestParam(required = false) String typCarSling,
        @RequestParam(required = false) String typElecFeatLwd,
        @RequestParam(required = false) Double dimTravelHeightH,
        @RequestParam(required = false) Double valRatedSpeed
    ) {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            typProductModel, typCarGr, typMacHoisting, typCarSling, 
            typElecFeatLwd, dimTravelHeightH, valRatedSpeed
        );
        return oppoGrSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public OppoGrSettingResponse getSettingPost(@RequestBody OppoGrSettingRequest request) {
        return oppoGrSettingService.getSetting(request);
    }
}
