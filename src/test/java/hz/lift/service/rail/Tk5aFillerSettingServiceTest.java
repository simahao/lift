package hz.lift.service.rail;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.rail.Tk5aFillerSettingRequest;
import hz.lift.model.rail.Tk5aFillerSettingResponse;

@SpringBootTest
class Tk5aFillerSettingServiceTest {

    @Autowired
    private Tk5aFillerSettingService service;

    @Test
    void testRule1_TK5A_SpeedBelow2() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A", 1.5);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NO", response.getResult());
    }

    @Test
    void testRule1_TK5A_SpeedEqual1_99() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A", 1.99);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NO", response.getResult());
    }

    @Test
    void testRule1_TK5A_1_SpeedBelow2() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A-1", 1.5);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NO", response.getResult());
    }

    @Test
    void testRule2_TK5A_SpeedEqual2() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A", 2.0);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("YES", response.getResult());
    }

    @Test
    void testRule2_TK5A_SpeedAbove2() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A", 2.5);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("YES", response.getResult());
    }

    @Test
    void testRule2_TK5A_1_SpeedEqual2() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A-1", 2.0);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("YES", response.getResult());
    }

    @Test
    void testRule2_TK5A_1_SpeedAbove2() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A-1", 3.0);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("YES", response.getResult());
    }

    @Test
    void testNA_UnknownTypCwtGr() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("UNKNOWN", 1.5);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_TypCwtGrNull() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest(null, 1.5);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_SpeedNull() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest("TK5A", null);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_AllNull() {
        Tk5aFillerSettingRequest request = new Tk5aFillerSettingRequest(null, null);
        Tk5aFillerSettingResponse response = service.getSetting(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNullRequest() {
        Tk5aFillerSettingResponse response = service.getSetting(null);
        assertEquals("NA", response.getResult());
    }
}
