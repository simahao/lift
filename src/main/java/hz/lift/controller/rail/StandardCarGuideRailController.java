package hz.lift.controller.rail;

import hz.lift.model.rail.StandardCarGuideRailRequest;
import hz.lift.model.rail.StandardCarGuideRailResponse;
import hz.lift.service.rail.StandardCarGuideRailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rail/standard-car-guide-rail")
public class StandardCarGuideRailController {

    private final StandardCarGuideRailService standardCarGuideRailService;

    public StandardCarGuideRailController(StandardCarGuideRailService standardCarGuideRailService) {
        this.standardCarGuideRailService = standardCarGuideRailService;
    }

    @GetMapping("/setting")
    public StandardCarGuideRailResponse getSetting(
        @RequestParam(required = false) Integer qtyCarGrVariable,
        @RequestParam(required = false) Integer qtyCarGrHalf,
        @RequestParam(required = false) Integer qtyCarGrStandard,
        @RequestParam(required = false) String typCarGr
    ) {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(
            qtyCarGrVariable, qtyCarGrHalf, qtyCarGrStandard, typCarGr
        );
        return standardCarGuideRailService.getSetting(request);
    }

    @PostMapping("/setting")
    public StandardCarGuideRailResponse getSettingPost(@RequestBody StandardCarGuideRailRequest request) {
        return standardCarGuideRailService.getSetting(request);
    }
}
