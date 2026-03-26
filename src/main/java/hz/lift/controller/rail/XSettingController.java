package hz.lift.controller.rail;

import hz.lift.model.rail.XSettingRequest;
import hz.lift.model.rail.XSettingResponse;
import hz.lift.service.rail.XSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/x-setting")
public class XSettingController {

    private final XSettingService xSettingService;

    public XSettingController(XSettingService xSettingService) {
        this.xSettingService = xSettingService;
    }

    @GetMapping("/setting")
    public XSettingResponse getSetting(
        @RequestParam(required = false) Integer qtyGrCwtTopBLength,
        @RequestParam(required = false) String typCwtGr
    ) {
        XSettingRequest request = new XSettingRequest(qtyGrCwtTopBLength, typCwtGr);
        return xSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public XSettingResponse getSettingPost(@RequestBody XSettingRequest request) {
        return xSettingService.getSetting(request);
    }
}
