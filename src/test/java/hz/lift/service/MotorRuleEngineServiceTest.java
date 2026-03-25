package hz.lift.service;

import hz.lift.model.MotorSelectionRequest;
import hz.lift.model.MotorSelectionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MotorRuleEngineServiceTest {

    @Autowired
    private MotorRuleEngineService service;

    @Test
    void testUserExample_NMX05() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.ONE,
            BigDecimal.valueOf(480),
            BigDecimal.valueOf(18),
            BigDecimal.valueOf(30)
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NMX05", response.getMotor());
    }

    @Test
    void testNMX07_WhenWGTExceeds50() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.ONE,
            BigDecimal.valueOf(480),
            BigDecimal.valueOf(18),
            BigDecimal.valueOf(60)
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NMX07", response.getMotor());
    }

    @Test
    void testNMX07_WhenTLExceeds20() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.ONE,
            BigDecimal.valueOf(480),
            BigDecimal.valueOf(25),
            BigDecimal.valueOf(30)
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NMX07", response.getMotor());
    }

    @Test
    void testSpeed3_NMX20() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.valueOf(3),
            BigDecimal.valueOf(850),
            BigDecimal.valueOf(50),
            BigDecimal.valueOf(700),
            BigDecimal.valueOf(700),
            null,
            BigDecimal.valueOf(850),
            null,
            null,
            null
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NMX20", response.getMotor());
    }

    @Test
    void testSpeed2_5_NMX11_1150() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.valueOf(2.5),
            BigDecimal.valueOf(550),
            BigDecimal.valueOf(50),
            BigDecimal.valueOf(300)
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NMX11-1150", response.getMotor());
    }

    @Test
    void testSpeed1_Q1_NMX05() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.ONE,
            BigDecimal.valueOf(350),
            BigDecimal.valueOf(10),
            BigDecimal.valueOf(20)
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NMX05", response.getMotor());
    }

    @Test
    void testNA_Response() {
        MotorSelectionRequest request = new MotorSelectionRequest(
            BigDecimal.valueOf(3),
            BigDecimal.valueOf(350),
            BigDecimal.valueOf(50),
            BigDecimal.valueOf(500)
        );
        MotorSelectionResponse response = service.selectMotor(request);
        assertEquals("NA", response.getMotor());
    }

    
    @Test
    void testSpeed1_Q2_TL_gt20_WGT_gt50() {
        
        MotorSelectionRequest req = new MotorSelectionRequest(
            BigDecimal.valueOf(1),
            BigDecimal.valueOf(450),
            BigDecimal.valueOf(25),
            BigDecimal.valueOf(60)
        );
        MotorSelectionResponse resp = service.selectMotor(req);
        assertEquals("NMX07", resp.getMotor());
    }

    @Test
    void testSpeed1_Q4_hmc_wgt150_tl25() {
        
        MotorSelectionRequest req = new MotorSelectionRequest(
            BigDecimal.ONE,
            BigDecimal.valueOf(550),
            BigDecimal.valueOf(25),
            BigDecimal.valueOf(150),
            null,
            null,
            null,
            true,
            null,
            null
        );
        MotorSelectionResponse resp = service.selectMotor(req);
        assertEquals("NMX07", resp.getMotor());
    }

    @Test
    void testSpeed3_Q7_NMX20() {
        
        MotorSelectionRequest req = new MotorSelectionRequest(
            BigDecimal.valueOf(3),
            BigDecimal.valueOf(950),
            BigDecimal.valueOf(50),
            BigDecimal.valueOf(700),
            BigDecimal.valueOf(700),
            null,
            null,
            null,
            null,
            null
        );
        MotorSelectionResponse resp = service.selectMotor(req);
        assertEquals("NMX20", resp.getMotor());
    }

    @Test
    void testSpeed2_Q4_NMX11_1150() {
        
        MotorSelectionRequest req = new MotorSelectionRequest(
            BigDecimal.valueOf(2),
            BigDecimal.valueOf(550),
            BigDecimal.valueOf(40),
            BigDecimal.valueOf(200)
        );
        MotorSelectionResponse resp = service.selectMotor(req);
        assertEquals("NMX11-1150", resp.getMotor());
    }
}
