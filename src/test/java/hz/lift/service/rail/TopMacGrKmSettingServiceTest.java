package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.TopMacGrKmSettingRequest;
import hz.lift.model.rail.TopMacGrKmSettingResponse;

@SpringBootTest
class TopMacGrKmSettingServiceTest {

    @Autowired
    private TopMacGrKmSettingService service;

    // Rule1: CWT_GR in list -> KMC732630H02
    @Test
    void testRule1_T70_1B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T70-1/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T75_3B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T75-3/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T75_4B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T75-4/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T82B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T82/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T82_2B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T82-2/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T82_1B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T82-1/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T89_1B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T89-1/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T89_2B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T89-2/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T89B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T89/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T114B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T114/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    @Test
    void testRule1_T125B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T125/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC732630H02", response.getResult());
    }

    // Rule2: CWT_GR = T75/B -> KM52242445V000
    @Test
    void testRule2_T75B() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "T75/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KM52242445V000", response.getResult());
    }

    // Rule3-7: TOP_A_LENGTH > 0 with different TYP_CWT_GR
    @Test
    void testRule3_TopA_TK5A() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 100, null, "TK5A"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC741050H02/F", response.getResult());
    }

    @Test
    void testRule4_TopA_HT60_1_5() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 100, null, "HT60-1.5"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51051908V003/A", response.getResult());
    }

    @Test
    void testRule5_TopA_HT60() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 100, null, "HT60"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51054042V003/B", response.getResult());
    }

    @Test
    void testRule6_TopA_HG65_2_0() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 100, null, "HG65-2.0"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51606436V003/-", response.getResult());
    }

    @Test
    void testRule7_TopA_HG65() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 100, null, "HG65"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    // Rule8-12: TOP_B_LENGTH > 0 with different TYP_CWT_GR
    @Test
    void testRule8_TopB_TK5A() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, 100, "TK5A"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC741050H02/F", response.getResult());
    }

    @Test
    void testRule9_TopB_HT60_1_5() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, 100, "HT60-1.5"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51051908V003/A", response.getResult());
    }

    @Test
    void testRule10_TopB_HT60() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, 100, "HT60"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51054042V003/B", response.getResult());
    }

    @Test
    void testRule11_TopB_HG65_2_0() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, 100, "HG65-2.0"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51606436V003/-", response.getResult());
    }

    @Test
    void testRule12_TopB_HG65() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, 100, "HG65"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    // NA test cases
    @Test
    void testNA_UnknownCwtGr() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            "UNKNOWN/B", null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_TopA_ZeroLength() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 0, null, "TK5A"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_TopA_NullLength() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, null, "TK5A"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_TopB_ZeroLength() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, 0, "TK5A"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_TopA_UnknownTypCwtGr() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, 100, null, "UNKNOWN"
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_AllNull() {
        TopMacGrKmSettingRequest request = new TopMacGrKmSettingRequest(
            null, null, null, null
        );
        TopMacGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNullRequest() {
        TopMacGrKmSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}