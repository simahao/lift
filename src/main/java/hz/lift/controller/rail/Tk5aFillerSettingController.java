package hz.lift.controller.rail;

import hz.lift.model.rail.Tk5aFillerSettingRequest;
import hz.lift.model.rail.Tk5aFillerSettingResponse;
import hz.lift.service.rail.Tk5aFillerSettingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/tk5a-filler")
public class Tk5aFillerSettingController {

    private final Tk5aFillerSettingService tk5aFillerSettingService;

    public Tk5aFillerSettingController(Tk5aFillerSettingService tk5aFillerSettingService) {
        this.tk5aFillerSettingService = tk5aFillerSettingService;
    }

    @GetMapping("/setting")
    public Tk5aFillerSettingResponse getSetting(
        @RequestParam(required = false) String typCwtGr,
        @RequestParam(required = false) Double valRatedSpeed
    ) {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest(typCwtGr, valRatedSpeed);
        return tk5aFillerSettingService.getSetting(request);
    }

    @PostMapping("/setting")
    public Tk5aFillerSettingResponse getSettingPost(@RequestBody Tk5aFillerSettingRequest request) {
        return tk5aFillerSettingService.getSetting(request);
    }
}
