package hz.lift.controller.rail;

import hz.lift.model.rail.RailSettingRequest;
import hz.lift.model.rail.RailSettingResponse;
import hz.lift.service.rail.RailSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail")
public class RailSettingController {

    private final RailSettingService railSettingService;

    public RailSettingController(RailSettingService railSettingService) {
        this.railSettingService = railSettingService;
    }

    @GetMapping("/setting")
    public RailSettingResponse getSetting(
        @RequestParam("typProductModel") String typProductModel,
        @RequestParam("typCarGr") String typCarGr,
        @RequestParam("typMacHoisting") String typMacHoisting,
        @RequestParam(required = false) String typCarSling,
        @RequestParam(required = false) Double valRatedSpeed
    ) {
        RailSettingRequest request = new RailSettingRequest(
            typProductModel, typCarGr, typMacHoisting, typCarSling, valRatedSpeed
        );
        return railSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public RailSettingResponse getSettingPost(@RequestBody RailSettingRequest request) {
        return railSettingService.getSetting(request);
    }
}