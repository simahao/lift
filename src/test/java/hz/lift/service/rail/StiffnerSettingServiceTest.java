package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.StiffnerSettingRequest;
import hz.lift.model.rail.StiffnerSettingResponse;

@SpringBootTest
class StiffnerSettingServiceTest {

    @Autowired
    private StiffnerSettingService service;

    // WGT_RATED_LOAD_Q = 630 tests
    @Test
    void testRule1_WGT630_NMX08_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX08", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule2_WGT630_NMX08_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX08", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule3_WGT630_NMX08_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX08", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule1_WGT630_NMX11_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX11", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule2_WGT630_NMX11_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX11", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule3_WGT630_NMX11_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX11", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    // WGT_RATED_LOAD_Q = 800 tests
    @Test
    void testRule4_WGT800_NMX08_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 800, "NMX08", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule5_WGT800_NMX08_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 800, "NMX08", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule6_WGT800_NMX08_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 800, "NMX08", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule4_WGT800_NMX11_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 800, "NMX11", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule5_WGT800_NMX11_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 800, "NMX11", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule6_WGT800_NMX11_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 800, "NMX11", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    // WGT_RATED_LOAD_Q = 900 tests
    @Test
    void testRule7_WGT900_NMX08_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 900, "NMX08", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule8_WGT900_NMX08_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 900, "NMX08", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule9_WGT900_NMX08_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 900, "NMX08", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule7_WGT900_NMX11_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 900, "NMX11", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule8_WGT900_NMX11_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 900, "NMX11", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule9_WGT900_NMX11_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 900, "NMX11", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    // WGT_RATED_LOAD_Q = 1000 tests
    @Test
    void testRule10_WGT1000_NMX08_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 1000, "NMX08", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule11_WGT1000_NMX08_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 1000, "NMX08", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule12_WGT1000_NMX08_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 1000, "NMX08", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule10_WGT1000_NMX11_T82B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 1000, "NMX11", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule11_WGT1000_NMX11_T82_1B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 1000, "NMX11", "T82-1/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    @Test
    void testRule12_WGT1000_NMX11_T75_4B() {
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 1000, "NMX11", "T75-4/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("KM51060009V000", response.getResult());
    }

    // NA tests - no match cases
    @Test
    void testNA_WGT630_NMX07_T82B() {
        // NMX07 is not in the allowed list
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX07", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_WGT630_NMX11_T75_B() {
        // T75/B is not in the allowed list (only T75-4/B)
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX11", "T75/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_WGT500_NMX11_T82B() {
        // 500 is not in the allowed list
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 500, "NMX11", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_PWS_NMX11_T82B() {
        // PWS is not in the allowed list
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWS", 630, "NMX11", "T82/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_WGT630_NMX11_UnknownCarGr() {
        // Unknown TYP_CAR_GR
        StiffnerSettingRequest request = new StiffnerSettingRequest(
            "PWE", 630, "NMX11", "UNKNOWN/B"
        );
        StiffnerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNullRequest() {
        StiffnerSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}