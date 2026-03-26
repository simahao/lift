package hz.lift.controller.rail;

import hz.lift.model.rail.StandardCwtGrRequest;
import hz.lift.model.rail.StandardCwtGrResponse;
import hz.lift.service.rail.StandardCwtGrService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/standard-cwt-gr")
public class StandardCwtGrController {

    private final StandardCwtGrService standardCwtGrService;

    public StandardCwtGrController(StandardCwtGrService standardCwtGrService) {
        this.standardCwtGrService = standardCwtGrService;
    }

    @GetMapping("/setting")
    public StandardCwtGrResponse getSetting(
        @RequestParam(required = false) Integer qtyGrCwtVarALength,
        @RequestParam(required = false) Integer qtyGrCwtVarBLength,
        @RequestParam(required = false) Integer qtyCwtGrHalf,
        @RequestParam(required = false) Integer qtyCwtGrStandard,
        @RequestParam(required = false) String typCwtGr,
        @RequestParam(required = false) Integer dimCwtGrLengthStandard
    ) {
        StandardCwtGrRequest request = new StandardCwtGrRequest(
            qtyGrCwtVarALength, qtyGrCwtVarBLength, qtyCwtGrHalf, qtyCwtGrStandard,
            typCwtGr, dimCwtGrLengthStandard
        );
        return standardCwtGrService.getSetting(request);
    }

    @PostMapping("/setting")
    public StandardCwtGrResponse getSettingPost(@RequestBody StandardCwtGrRequest request) {
        return standardCwtGrService.getSetting(request);
    }
}
