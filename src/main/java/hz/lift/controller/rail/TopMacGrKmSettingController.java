package hz.lift.controller.rail;

import hz.lift.model.rail.TopMacGrKmSettingRequest;
import hz.lift.model.rail.TopMacGrKmSettingResponse;
import hz.lift.service.rail.TopMacGrKmSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/topmacgrkm")
public class TopMacGrKmSettingController {

    private final TopMacGrKmSettingService topMacGrKmSettingService;

    public TopMacGrKmSettingController(TopMacGrKmSettingService topMacGrKmSettingService) {
        this.topMacGrKmSettingService = topMacGrKmSettingService;
    }

    @GetMapping("/setting")
    public TopMacGrKmSettingResponse getSetting(
        @RequestParam("cwtGr") String cwtGr,
        @RequestParam(required = false) Integer qtyGrCwtTopALength,
        @RequestParam(required = false) Integer qtyGrCwtTopBLength,
        @RequestParam(required = false) String typCwtGr
    ) {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            cwtGr, qtyGrCwtTopALength, qtyGrCwtTopBLength, typCwtGr
        );
        return topMacGrKmSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public TopMacGrKmSettingResponse getSettingPost(@RequestBody TopMacGrKmSettingRequest request) {
        return topMacGrKmSettingService.getSetting(request);
    }
}