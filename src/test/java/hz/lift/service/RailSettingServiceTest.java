package hz.lift.service;

import hz.lift.model.RailSettingRequest;
import hz.lift.model.RailSettingResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RailSettingServiceTest {

    @Autowired
    private RailSettingService service;

    @Test
    void testRule1_KMC972573H03() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T75-3/B", "NMX11", "KLS", null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972573H03", response.getResult());
    }

    @Test
    void testRule1b_KMC972573H03() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T75-4/B", "NMX11", "KLS", null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972573H03", response.getResult());
    }

    @Test
    void testRule1c_KMC972573H03() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T75/B", "NMX11", "KLS", null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972573H03", response.getResult());
    }

    @Test
    void testRule2_KMC972573H02() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T82/B", "NMX11", "KLS", null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972573H02", response.getResult());
    }

    @Test
    void testRule3_KMC972574H01() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T75-3/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H01", response.getResult());
    }

    @Test
    void testRule3b_KMC972574H01() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T75-4/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H01", response.getResult());
    }

    @Test
    void testRule3c_KMC972574H01() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T75/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H01", response.getResult());
    }

    @Test
    void testRule4_KMC972574H02() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T70-1/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H02", response.getResult());
    }

    @Test
    void testRule5_KMC972574H03() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T82/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H03", response.getResult());
    }

    @Test
    void testRule6_KMC972574H04() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T82-1/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H04", response.getResult());
    }

    @Test
    void testRule7_KMC972574H05() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T89-1/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H05", response.getResult());
    }

    @Test
    void testRule7b_KMC972574H05() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T89-2/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H05", response.getResult());
    }

    @Test
    void testRule7c_KMC972574H05() {
        RailSettingRequest request = new RailSettingRequest(
            "PWE", "T89/B", "NMX07", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("KMC972574H05", response.getResult());
    }

    @Test
    void testNA_noMatch() {
        RailSettingRequest request = new RailSettingRequest(
            "UNKNOWN", "T70/B", "NMX99", null, null
        );
        RailSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNullRequest() {
        RailSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}