package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.OppoGrSettingRequest;
import hz.lift.model.rail.OppoGrSettingResponse;


@SpringBootTest
class OppoGrSettingServiceTest {

    @Autowired
    private OppoGrSettingService service;

    @Test
    void testRule1_KMC51380587V001() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWH", "T70-1/B", "NMX07", null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51380587V001", response.getResult());
    }

    @Test
    void testRule2_KMC51434821V001() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWH", "T82-1/B", "NMX07", null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51434821V001", response.getResult());
    }

    @Test
    void testRule3_KMC51732250V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T70-1/B", null, null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51732250V000", response.getResult());
    }

    @Test
    void testRule4_KMC51732251V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T82/B", null, null, "RS", null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51732251V000", response.getResult());
    }

    @Test
    void testRule4b_KMC51732251V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T89/B", null, null, "RS", null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51732251V000", response.getResult());
    }

    @Test
    void testRule5_KMC51670433V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T89/B", null, null, "I", null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51670433V000", response.getResult());
    }

    @Test
    void testRule6_KMC51265001V002() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T89/B", "NMX11", "KLS", null, 80.0, 2.5
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V002", response.getResult());
    }

    @Test
    void testRule6_heightGreaterThan75() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T89/B", "NMX11", "KLS", null, 100.0, 1.0
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V002", response.getResult());
    }

    @Test
    void testRule6_speedGreaterThanEqual2() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T89/B", "NMX11", "KLS", null, 50.0, 2.0
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V002", response.getResult());
    }

    @Test
    void testRule7_KMC51265001V004() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T90/B", "NMX11", "KLS", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V004", response.getResult());
    }

    @Test
    void testRule7b_T114() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T114/B", "NMX11", "KLS", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V004", response.getResult());
    }

    @Test
    void testRule8_KMC51265001V006() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T125/B", "NMX11", "KLS", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V006", response.getResult());
    }

    @Test
    void testRule9_KMC746058H02() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T114/B", "NMX14", "ISCS16", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC746058H02", response.getResult());
    }

    @Test
    void testRule10_KMC744022H01() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS4", "T89/B", "NMX11", "CF10-SCE", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC744022H01", response.getResult());
    }

    @Test
    void testRule11_KMC51282093V002() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T114/B", "NMX14", "KLS", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V002", response.getResult());
    }

    @Test
    void testRule11b_ISCS13() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T89/B", "NMX14", "ISCS13", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V002", response.getResult());
    }

    @Test
    void testRule12_KMC51282093V002() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWE", "T90/B", "NMX14", null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51282093V002", response.getResult());
    }

    @Test
    void testRule13_KMC51670433V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS3", "T89/B", "NMX11", null, null, null, 1.5
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51670433V000", response.getResult());
    }

    @Test
    void testRule14_KMC51265001V002() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS3", "T89/B", "NMX11", null, null, null, 2.0
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51265001V002", response.getResult());
    }

    @Test
    void testRule15_KMC51670433V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T89/B", "NMX11", null, null, 75.0, 1.75
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51670433V000", response.getResult());
    }

    @Test
    void testRule16_KMC51027852V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T82/B", null, null, "I", null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51027852V000", response.getResult());
    }

    @Test
    void testRule17_KMC51027855V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T75-3/B", null, null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51027855V000", response.getResult());
    }

    @Test
    void testRule17b_T75_4_B() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T75-4/B", null, null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51027855V000", response.getResult());
    }

    @Test
    void testRule17c_T75_B() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T75/B", null, null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51027855V000", response.getResult());
    }

    @Test
    void testRule18_KMC51027858V000() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T70-1/B", null, null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KMC51027858V000", response.getResult());
    }

    @Test
    void testRule19_KM763049H02_CHN1() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T114/B", "NMX20", null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KM763049H02_CHN1", response.getResult());
    }

    @Test
    void testRule19b_T125() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T125/B", "MX20", null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KM763049H02_CHN1", response.getResult());
    }

    @Test
    void testRule20_KM769655H04_CHN3() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "PWS1", "T114/B", "NMX11", "CF10-SCE", null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("KM769655H04_CHN3", response.getResult());
    }

    @Test
    void testNA_noMatch() {
        OppoGrSettingRequest request = new OppoGrSettingRequest(
            "UNKNOWN", "T70/B", "NMX99", null, null, null, null
        );
        OppoGrSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNullRequest() {
        OppoGrSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}
