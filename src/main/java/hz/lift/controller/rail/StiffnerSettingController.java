package hz.lift.controller.rail;

import hz.lift.model.rail.StiffnerSettingRequest;
import hz.lift.model.rail.StiffnerSettingResponse;
import hz.lift.service.rail.StiffnerSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/stiffner")
public class StiffnerSettingController {

    private final StiffnerSettingService stiffnerSettingService;

    public StiffnerSettingController(StiffnerSettingService stiffnerSettingService) {
        this.stiffnerSettingService = stiffnerSettingService;
    }

    @GetMapping("/setting")
    public StiffnerSettingResponse getSetting(
        @RequestParam("typProductModel") String typProductModel,
        @RequestParam("wgtRatedLoadQ") Integer wgtRatedLoadQ,
        @RequestParam("typMacHoisting") String typMacHoisting,
        @RequestParam("typCarGr") String typCarGr
    ) {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            typProductModel, wgtRatedLoadQ, typMacHoisting, typCarGr
        );
        return stiffnerSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public StiffnerSettingResponse getSettingPost(@RequestBody StiffnerSettingRequest request) {
        return stiffnerSettingService.getSetting(request);
    }
}