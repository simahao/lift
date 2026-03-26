package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.StandardCwtGrRequest;
import hz.lift.model.rail.StandardCwtGrResponse;

@SpringBootTest
class StandardCwtGrServiceTest {

    @Autowired
    private StandardCwtGrService service;

    @Test
    void testRule1_VarALength_T70_1B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "T70-1/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule1_VarALength_T75_3B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "T75-3/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule1_VarALength_T75_4B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "T75-4/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule1_VarALength_T114B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "T114/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule2_VarALength_T75B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "T75/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KM52242444V000", response.getResult());
    }

    @Test
    void testRule3_VarALength_TK5A() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "TK5A", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC741050H04/F", response.getResult());
    }

    @Test
    void testRule4_VarALength_HT60_1_5() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "HT60-1.5", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51051908V001/A", response.getResult());
    }

    @Test
    void testRule5_VarALength_HT60() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "HT60", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51054042V001/B", response.getResult());
    }

    @Test
    void testRule6_VarALength_HG65_2_0() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "HG65-2.0", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51606436V001/-", response.getResult());
    }

    @Test
    void testRule7_VarALength_HG65() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "HG65", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    @Test
    void testRule8_VarBLength_T70_1B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "T70-1/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule8_VarBLength_T75_3B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "T75-3/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule9_VarBLength_T75B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "T75/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KM52242444V000", response.getResult());
    }

    @Test
    void testRule10_VarBLength_TK5A() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "TK5A", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC741050H04/F", response.getResult());
    }

    @Test
    void testRule11_VarBLength_HT60_1_5() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "HT60-1.5", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51051908V001/A", response.getResult());
    }

    @Test
    void testRule12_VarBLength_HT60() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "HT60", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51054042V001/B", response.getResult());
    }

    @Test
    void testRule13_VarBLength_HG65_2_0() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "HG65-2.0", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51606436V001/-", response.getResult());
    }

    @Test
    void testRule14_VarBLength_HG65() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, 100, null, null, "HG65", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    @Test
    void testRule15_Half_T70_1B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "T70-1/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule16_Half_T75_3B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "T75-3/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule17_Half_TK5A() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "TK5A", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC741050H04/F", response.getResult());
    }

    @Test
    void testRule18_Half_HT60_1_5() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "HT60-1.5", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51051908V001/A", response.getResult());
    }

    @Test
    void testRule19_Half_HT60() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "HT60", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51054042V001/B", response.getResult());
    }

    @Test
    void testRule20_Half_HG65_2_0() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "HG65-2.0", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51606436V001/-", response.getResult());
    }

    @Test
    void testRule21_Half_HG65() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, 100, null, "HG65", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    @Test
    void testRule22_Standard_T70_1B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "T70-1/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC732630H01/G", response.getResult());
    }

    @Test
    void testRule23_Standard_T75B() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "T75/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KM52242444V000", response.getResult());
    }

    @Test
    void testRule24_Standard_TK5A_DIM5000() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "TK5A", 5000);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC741050H01/F", response.getResult());
    }

    @Test
    void testRule25_Standard_TK5A_DIM2500() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "TK5A", 2500);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC741050H04/F", response.getResult());
    }

    @Test
    void testRule26_Standard_HT60_1_5() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "HT60-1.5", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51051908V001/A", response.getResult());
    }

    @Test
    void testRule27_Standard_HT60() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "HT60", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51054042V001/B", response.getResult());
    }

    @Test
    void testRule28_Standard_HG65_2_0() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "HG65-2.0", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51606436V001/-", response.getResult());
    }

    @Test
    void testRule29_Standard_HG65() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, 100, "HG65", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KMC51419319V000/A", response.getResult());
    }

    @Test
    void testRule30_HG65_2_0_Only() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, null, "HG65-2.0", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KM51686769V000/B", response.getResult());
    }

    @Test
    void testRule30_HG65_Only() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, null, "HG65", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("KM51686769V000/B", response.getResult());
    }

    @Test
    void testNA_VarALength_Zero() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(0, null, null, null, "T70-1/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_VarALength_Null() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(null, null, null, null, "T70-1/B", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_UnknownTypCwtGr() {
        StandardCwtGrRequest request = new StandardCwtGrRequest(100, null, null, null, "UNKNOWN", null);
        StandardCwtGrResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_NullRequest() {
        StandardCwtGrResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}
