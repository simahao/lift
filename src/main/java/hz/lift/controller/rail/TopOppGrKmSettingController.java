package hz.lift.controller.rail;

import hz.lift.model.rail.TopOppGrKmSettingRequest;
import hz.lift.model.rail.TopOppGrKmSettingResponse;
import hz.lift.service.rail.TopOppGrKmSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/top-oppo-gr-km")
public class TopOppGrKmSettingController {

    private final TopOppGrKmSettingService topOppGrKmSettingService;

    public TopOppGrKmSettingController(TopOppGrKmSettingService topOppGrKmSettingService) {
        this.topOppGrKmSettingService = topOppGrKmSettingService;
    }

    @GetMapping("/setting")
    public TopOppGrKmSettingResponse getSetting(
        @RequestParam(required = false) String typCwtGr,
        @RequestParam(required = false) String typMacHoisting,
        @RequestParam(required = false) Integer dimTravelHeightH,
        @RequestParam(required = false) String typEaqPackage,
        @RequestParam(required = false) String typProductModel
    ) {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest(
            typCwtGr, typMacHoisting, dimTravelHeightH, typEaqPackage, typProductModel
        );
        return topOppGrKmSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public TopOppGrKmSettingResponse getSettingPost(@RequestBody TopOppGrKmSettingRequest request) {
        return topOppGrKmSettingService.getSetting(request);
    }
}
