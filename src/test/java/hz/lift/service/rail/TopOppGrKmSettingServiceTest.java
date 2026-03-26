package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.TopOppGrKmSettingRequest;
import hz.lift.model.rail.TopOppGrKmSettingResponse;

@SpringBootTest
class TopOppGrKmSettingServiceTest {

    @Autowired
    private TopOppGrKmSettingService service;

    @Test
    void testRule1_T70_1B() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T70-1/B", null, null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule2_T75_3B_NMX11_Not2_PWS3() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-3/B", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule2_T75_4B_NMX11_Not2_PWS3() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-4/B", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule2_T75B_NMX11_Not2_PWS3() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75/B", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule2_T82B_NMX11_Not2_PWS3() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82/B", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule2_T82_1B_NMX11_Not2_PWS3() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82-1/B", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule2_T89B_NMX11_Not2_PWS3() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule3_T75_3B_NMX11_Not2_PWS4() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-3/B", "NMX11", null, "1", "PWS4");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule3_T82B_NMX11_Not2_PWS4() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82/B", "NMX11", null, "1", "PWS4");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule4_T82_1B_NMX05_HeightOk_Not2_NotPWS() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82-1/B", "NMX05", 50000, "1", "PWE");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule4_T75_3B_NMX07_HeightOk_Not2_NotPWS() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-3/B", "NMX07", 50000, "1", "PWE");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule4_T75B_NMX08_HeightOk_Not2_NotPWS() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75/B", "NMX08", 50000, "1", "PWE");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule4_T89B_NMX11_HeightOk_Not2_NotPWS() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX11", 50000, "1", "PWE");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule5_T82_1B_NMX11_HeightOver_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82-1/B", "NMX11", 100000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434821V004", response.getResult());
    }

    @Test
    void testRule5_T75_3B_NMX11_HeightOver_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-3/B", "NMX11", 100000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434821V004", response.getResult());
    }

    @Test
    void testRule5_T89B_NMX11_HeightOver_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX11", 100000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434821V004", response.getResult());
    }

    @Test
    void testRule6_T89B_NMX11_EAQ2_NotPWS() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX11", null, "2", "PWE");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule7_T75_3B_MX14() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-3/B", "MX14", null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule7_T75_4B_MX14E() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T75-4/B", "MX14E", null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule7_T82_1B_NMX14() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82-1/B", "NMX14", null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule7_T89_1B_NMX14S() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89-1/B", "NMX14S", null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule7_T89_2B_MX14() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89-2/B", "MX14", null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule8_T82B_MX14_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82/B", "MX14", null, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule8_T82_2B_MX20_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T82-2/B", "MX20", null, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule8_T89B_NMX14_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX14", null, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule9_T114B_MX20_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T114/B", "MX20", null, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule9_T114B_MX20E_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T114/B", "MX20E", null, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule9_T114B_NMX20_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T114/B", "NMX20", null, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule10_T125B_MX20_EAQ2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T125/B", "MX20", null, "2", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule10_T125B_NMX20_EAQ2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T125/B", "NMX20", null, "2", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V003", response.getResult());
    }

    @Test
    void testRule11_T89_1B_NMX07_HeightOk_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89-1/B", "NMX07", 50000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule11_T89_2B_NMX05_HeightOk_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89-2/B", "NMX05", 50000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule11_T89B_NMX11_HeightOk_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX11", 50000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51020078V000", response.getResult());
    }

    @Test
    void testRule12_T89_1B_NMX07_HeightOver_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89-1/B", "NMX07", 100000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434811V001", response.getResult());
    }

    @Test
    void testRule12_T89_2B_NMX05_HeightOver_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89-2/B", "NMX05", 100000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434811V001", response.getResult());
    }

    @Test
    void testRule12_T89B_NMX08_HeightOver_Not2() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("T89/B", "NMX08", 100000, "1", null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434811V001", response.getResult());
    }

    @Test
    void testNA_UnknownCwtGr() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest("UNKNOWN", "NMX11", null, "1", "PWS3");
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_AllNull() {
        TopOppGrKmSettingRequest request = new TopOppGrKmSettingRequest(null, null, null, null, null);
        TopOppGrKmSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNullRequest() {
        TopOppGrKmSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}
