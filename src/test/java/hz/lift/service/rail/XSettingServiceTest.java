package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.XSettingRequest;
import hz.lift.model.rail.XSettingResponse;

@SpringBootTest
class XSettingServiceTest {

    @Autowired
    private XSettingService service;

    // Rule1: QTY_GR_CWT_TOP_B_LENGTH > 0 and TYP_CWT_GR = TK5A -> KMC741050H02/F
    @Test
    void testRule1_TK5A() {
        XSettingRequest request = new XSettingRequest(100, "TK5A");
        XSettingResponse response = service.getSetting(request);
        assertEquals("KMC741050H02/F", response.getResult());
    }

    // Rule2: QTY_GR_CWT_TOP_B_LENGTH > 0 and TYP_CWT_GR = HT60-1.5 -> KMC51051908V003/A
    @Test
    void testRule2_HT60_1_5() {
        XSettingRequest request = new XSettingRequest(100, "HT60-1.5");
        XSettingResponse response = service.getSetting(request);
        assertEquals("KMC51051908V003/A", response.getResult());
    }

    // Rule3: QTY_GR_CWT_TOP_B_LENGTH > 0 and TYP_CWT_GR = HT60 -> KMC51054042V003/B
    @Test
    void testRule3_HT60() {
        XSettingRequest request = new XSettingRequest(100, "HT60");
        XSettingResponse response = service.getSetting(request);
        assertEquals("KMC51054042V003/B", response.getResult());
    }

    // Rule4: QTY_GR_CWT_TOP_B_LENGTH > 0 and TYP_CWT_GR = HG65-2.0 -> KMC51606436V003/-
    @Test
    void testRule4_HG65_2_0() {
        XSettingRequest request = new XSettingRequest(100, "HG65-2.0");
        XSettingResponse response = service.getSetting(request);
        assertEquals("KMC51606436V003/-", response.getResult());
    }

    // Rule5: QTY_GR_CWT_TOP_B_LENGTH > 0 and TYP_CWT_GR = HG65 -> KMC51419319V000/A
    @Test
    void testRule5_HG65() {
        XSettingRequest request = new XSettingRequest(100, "HG65");
        XSettingResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    // Test with length = 0 (should not match)
    @Test
    void testNA_LengthZero() {
        XSettingRequest request = new XSettingRequest(0, "TK5A");
        XSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    // Test with null length
    @Test
    void testNA_LengthNull() {
        XSettingRequest request = new XSettingRequest(null, "TK5A");
        XSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    // Test with unknown typCwtGr
    @Test
    void testNA_UnknownTypCwtGr() {
        XSettingRequest request = new XSettingRequest(100, "UNKNOWN");
        XSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    // Test with null request
    @Test
    void testNullRequest() {
        XSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }

    // Test with null typCwtGr
    @Test
    void testNA_TypCwtGrNull() {
        XSettingRequest request = new XSettingRequest(100, null);
        XSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    // Test with all null
    @Test
    void testNA_AllNull() {
        XSettingRequest request = new XSettingRequest(null, null);
        XSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }
}
