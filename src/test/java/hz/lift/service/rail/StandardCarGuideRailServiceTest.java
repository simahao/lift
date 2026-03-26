package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.StandardCarGuideRailRequest;
import hz.lift.model.rail.StandardCarGuideRailResponse;

@SpringBootTest
class StandardCarGuideRailServiceTest {

    @Autowired
    private StandardCarGuideRailService service;

    @Test
    void testRule1_Variable_T70_1B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T70-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule1_Variable_T75_3B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T75-3/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule1_Variable_T82B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T82/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule1_Variable_T89B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T89/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule1_Variable_T114B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T114/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule1_Variable_T125B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T125/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule2_Half_T70_1B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, 100, null, "T70-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule2_Half_T75_3B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, 100, null, "T75-3/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule2_Half_T89_1B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, 100, null, "T89-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule3_Standard_T70_1B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, null, 100, "T70-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule3_Standard_T82_1B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, null, 100, "T82-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule3_Standard_T127_1B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, null, 100, "T127-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KMC732630H01/G", response.getResult2());
    }

    @Test
    void testRule4_Variable_T75B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "T75/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KM52242444V000", response.getResult2());
    }

    @Test
    void testRule5_Half_T75B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, 100, null, "T75/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KM52242444V000", response.getResult2());
    }

    @Test
    void testRule6_Standard_T75B() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, null, 100, "T75/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("en:GUIDE RAIL, STD FULL LENGTH", response.getResult1());
        assertEquals("KM52242444V000", response.getResult2());
    }

    @Test
    void testNA_Variable_Zero() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(0, null, null, "T70-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult1());
        assertEquals("NA", response.getResult2());
    }

    @Test
    void testNA_Variable_Null() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, null, null, "T70-1/B");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult1());
        assertEquals("NA", response.getResult2());
    }

    @Test
    void testNA_UnknownTypCarGr() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(100, null, null, "UNKNOWN");
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult1());
        assertEquals("NA", response.getResult2());
    }

    @Test
    void testNA_AllNull() {
        StandardCarGuideRailRequest request = new StandardCarGuideRailRequest(null, null, null, null);
        StandardCarGuideRailResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult1());
        assertEquals("NA", response.getResult2());
    }

    @Test
    void testNullRequest() {
        StandardCarGuideRailResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult1());
        assertEquals("NA", response.getResult2());
    }
}
