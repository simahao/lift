package hz.lift.service.motor;

import hz.lift.model.motor.MotorARequest;
import hz.lift.model.motor.MotorAResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MotorAServiceTest {

    @Autowired
    private MotorAService service;

    @Test
    void testSpeed3_Q800_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 850.0, null, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q900_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 900.0, null, 620.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q500_NMX11() {
        MotorARequest request = new MotorARequest(2.5, 550.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_Q450_NMX11() {
        MotorARequest request = new MotorARequest(2.0, 460.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testSpeed1_75_Q400_NMX07() {
        MotorARequest request = new MotorARequest(1.75, 400.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_75_Q450_NMX07() {
        MotorARequest request = new MotorARequest(1.75, 450.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_75_Q500_NMX07_TL20() {
        MotorARequest request = new MotorARequest(1.75, 500.0, 20.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_75_Q500_NMX07_TL30() {
        MotorARequest request = new MotorARequest(1.75, 500.0, 30.0, null, 60.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_75_Q500_NMX08() {
        MotorARequest request = new MotorARequest(1.75, 500.0, 30.0, null, 200.0, "HMC car", null, null, null, null, null, null, 180.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_75_Q500_NMX11_1000_TL80() {
        MotorARequest request = new MotorARequest(1.75, 500.0, 80.0, null, null, null, null, null, null, null, null, null, null, "TTC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q400_NMX07() {
        MotorARequest request = new MotorARequest(1.6, 400.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q400_NMX05() {
        MotorARequest request = new MotorARequest(1.0, 400.0, 15.0, 40.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testSpeed1_Q400_T7007_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 400.0, 15.0, 40.0, null, null, null, true, "NO", null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q420_NMX05_TL20() {
        MotorARequest request = new MotorARequest(1.0, 420.0, 20.0, 50.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testSpeed1_Q420_NMX07_TL25() {
        MotorARequest request = new MotorARequest(1.0, 420.0, 25.0, 60.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q500_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 500.0, 30.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q550_NMX08_SEC() {
        MotorARequest request = new MotorARequest(1.0, 550.0, null, null, null, null, null, null, null, null, null, null, 250.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_Q550_NMX11_SEC() {
        MotorARequest request = new MotorARequest(1.0, 550.0, null, null, null, null, null, null, null, null, null, null, 350.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testSpeed1_Q700_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 700.0, 50.0, 280.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q850_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 850.0, 60.0, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q1000_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 1000.0, 70.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1300_NMX20() {
        MotorARequest request = new MotorARequest(1.0, 1300.0, null, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_75_Q600_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 600.0, 50.0, 250.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed2_5_Q850_TL80_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 850.0, 80.0, 300.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q850_TL80_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 850.0, 80.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1100_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1100.0, null, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1050_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.0, 1050.0, 80.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q950_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 950.0, 85.0, 280.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q950_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 950.0, 85.0, 650.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testImported_NMX08_to_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 30.0, null, null, null, null, null, null, null, true, null, 100.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_77_C1_NMX07_to_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 30.0, null, 80.0, "HMC car", null, null, null, null, null, true, null, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testKDM40_NMX08_to_NMX11() {
        MotorARequest request = new MotorARequest(1.0, 420.0, 20.0, 50.0, null, null, null, null, null, "true", null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testNA_NullSpeed() {
        MotorARequest request = new MotorARequest(null, 500.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_NullQ() {
        MotorARequest request = new MotorARequest(1.0, null, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testNA_NullRequest() {
        MotorAResponse response = service.getMotor(null);
        assertEquals("NA", response.getResult());
    }

    @Test
    void testSpeed1_75_Q460_NMX07() {
        MotorARequest request = new MotorARequest(1.75, 460.0, 20.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed2_Q800_SS550_Q885() {
        MotorARequest request = new MotorARequest(2.0, 885.0, 80.0, 500.0, null, null, "SS550*", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_Q800_NotSS550() {
        MotorARequest request = new MotorARequest(2.0, 850.0, 80.0, 500.0, null, null, "OTHER", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_6_Q500_NMX07_TL40() {
        MotorARequest request = new MotorARequest(1.6, 500.0, 40.0, null, 120.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_6_Q500_NMX07() {
        MotorARequest request = new MotorARequest(1.6, 500.0, 40.0, null, 200.0, "HMC car", null, null, null, null, null, null, 180.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1150_NMX14S() {
        MotorARequest request = new MotorARequest(1.6, 1150.0, null, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1300_NMX20() {
        MotorARequest request = new MotorARequest(1.6, 1300.0, null, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_Q1100_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 1100.0, null, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q1500_NMX20() {
        MotorARequest request = new MotorARequest(1.0, 1500.0, null, 800.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_75_Q900_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 900.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1000_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 1000.0, 70.0, 380.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed2_Q1275_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1275.0, null, 800.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1050_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1050.0, null, 800.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1100_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 1100.0, null, 850.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== New tests for speed=null with special conditions ==========

    // T7007_2022 + speed=null -> NMX07
    @Test
    void testT7007_NullSpeed_Q400_NMX07() {
        MotorARequest request = new MotorARequest(null, 400.0, 15.0, 40.0, null, null, null, true, "NO", null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testT7007_NullSpeed_Q420_NMX07() {
        MotorARequest request = new MotorARequest(null, 420.0, 25.0, 60.0, null, null, null, true, "NO", null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    // Imported + speed=null -> NMX11
    @Test
    void testImported_NullSpeed_Q450_NMX11() {
        MotorARequest request = new MotorARequest(null, 450.0, null, null, null, null, null, null, null, null, true, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testImported_NullSpeed_Q550_NMX11() {
        MotorARequest request = new MotorARequest(null, 550.0, null, null, null, null, null, null, null, null, true, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    // EN81-77_C1 + speed=null -> NMX11
    @Test
    void testEN81_NullSpeed_Q400_NMX11() {
        MotorARequest request = new MotorARequest(null, 400.0, null, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_NullSpeed_Q450_NMX11() {
        MotorARequest request = new MotorARequest(null, 450.0, null, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_NullSpeed_Q550_NMX11() {
        MotorARequest request = new MotorARequest(null, 550.0, null, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    // KDM40 + speed=null -> NMX11
    @Test
    void testKDM40_NullSpeed_Q450_NMX11() {
        MotorARequest request = new MotorARequest(null, 450.0, null, null, null, null, null, null, null, "true", null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testKDM40_NullSpeed_Q550_NMX11() {
        MotorARequest request = new MotorARequest(null, 550.0, null, null, null, null, null, null, null, "true", null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    // SS550* Q=885 with different speeds
    @Test
    void testSpeed3_Q885_SS550_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 885.0, null, 700.0, null, null, "SS550*", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q885_SS550_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 885.0, null, 500.0, null, null, "SS550*", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q885_SS550_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 885.0, 60.0, 400.0, null, null, "SS550*", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_6_Q885_SS550_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 885.0, 60.0, 400.0, null, null, "SS550*", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q885_SS550_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 885.0, 60.0, 400.0, null, null, "SS550*", null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    // ========== Additional coverage tests ==========

    // T7007_2022 rules coverage
    @Test
    void testT7007_Q450_TL15_Deco60_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 450.0, 15.0, null, 60.0, null, null, true, "NO", null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testT7007_Q480_TL15_Deco60_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 480.0, 15.0, null, 60.0, null, null, true, "NO", null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testT7007_Q480_TL30_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 480.0, 30.0, null, null, null, null, true, "NO", null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    // Speed 3.0 coverage
    @Test
    void testSpeed3_Q800_Deco780_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 850.0, null, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1000_Deco780_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 900.0, null, 620.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q900_Deco620_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 900.0, null, 620.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1025_Deco780_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1025.0, null, 780.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1155_Deco860_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1155.0, null, 860.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1275_Deco960_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1275.0, null, 960.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1365_Deco1030_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1365.0, null, 1030.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1500_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1500.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed3_Q1700_NMX20() {
        MotorARequest request = new MotorARequest(3.0, 1700.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // Speed 2.5 coverage
    @Test
    void testSpeed2_5_Q630_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 630.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q800_TL85_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 800.0, 85.0, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q800_TL85_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 800.0, 85.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q800_TL100_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 800.0, 100.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q800_TL100_Deco250_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 800.0, 100.0, 250.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q800_TL100_Deco420_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 800.0, 100.0, 420.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1000_TL85_Deco300_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.5, 1000.0, 85.0, 300.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1000_TL85_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 1000.0, 85.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1155_Deco860_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 1155.0, null, 860.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1400_Deco1190_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 1400.0, null, 1190.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1700_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 1700.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_5_Q1900_NMX20() {
        MotorARequest request = new MotorARequest(2.5, 1900.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // Speed 2.0 coverage
    @Test
    void testSpeed2_Q500_NMX11() {
        MotorARequest request = new MotorARequest(2.0, 500.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testSpeed2_Q630_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.0, 630.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_Q800_TL85_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.0, 800.0, 85.0, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_Q800_TL85_Deco500_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.0, 800.0, 85.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_Q900_TL85_Deco600_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 900.0, 85.0, 600.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q900_TL85_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 900.0, 85.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1050_TL85_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(2.0, 1050.0, 85.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed2_Q1050_TL85_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1050.0, 85.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1250_TL80_Deco500_NMX14() {
        MotorARequest request = new MotorARequest(2.0, 1250.0, 80.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testSpeed2_Q1250_TL80_Deco800_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1250.0, 80.0, 800.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1350_TL80_Deco500_NMX14() {
        MotorARequest request = new MotorARequest(2.0, 1350.0, 80.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testSpeed2_Q1350_TL80_Deco900_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1350.0, 80.0, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1500_Deco1190_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1500.0, null, 1190.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1700_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1700.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed2_Q1900_NMX20() {
        MotorARequest request = new MotorARequest(2.0, 1900.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // Speed 1.75 coverage
    @Test
    void testSpeed1_75_Q550_TL20_Deco80_HMC_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 20.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q550_TL20_Deco180_HMC_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 20.0, null, 180.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q550_TL40_Deco80_HMC_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 40.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q550_TL40_Deco200_HMC_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 40.0, null, 200.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q550_TL60_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 550.0, 60.0, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q700_SEC_TL50_Deco100_NMX08() {
        MotorARequest request = new MotorARequest(1.75, 700.0, 50.0, null, 100.0, null, null, null, null, null, null, null, 100.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_75_Q700_SEC_TL50_Deco200_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 700.0, 50.0, null, 200.0, null, null, null, null, null, null, null, 200.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q700_SEC_TL70_Deco80_NMX08() {
        MotorARequest request = new MotorARequest(1.75, 700.0, 70.0, null, 80.0, null, null, null, null, null, null, null, 80.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_75_Q700_SEC_TL70_Deco150_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 700.0, 70.0, null, 150.0, null, null, null, null, null, null, null, 150.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q700_TL80_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 700.0, 80.0, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q700_TTC_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 700.0, null, null, null, null, null, null, null, null, null, null, null, "TTC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q850_TL60_Deco350_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 850.0, 60.0, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q850_TL60_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.75, 850.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q850_TL60_Deco600_NMX14S() {
        MotorARequest request = new MotorARequest(1.75, 850.0, 60.0, 600.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_75_Q850_TL80_Deco500_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.75, 850.0, 80.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q950_TL60_Deco400_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.75, 950.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_75_Q950_TL60_Deco500_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.75, 950.0, 60.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q950_TL60_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.75, 950.0, 60.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1015_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.75, 1015.0, null, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1100_TL60_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.75, 1100.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1100_TL60_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.75, 1100.0, 60.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1180_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.75, 1180.0, null, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1250_TL60_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(1.75, 1250.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1250_TL60_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(1.75, 1250.0, 60.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1350_TL60_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(1.75, 1350.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1350_TL60_Deco800_NMX20() {
        MotorARequest request = new MotorARequest(1.75, 1350.0, 60.0, 800.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1500_NMX20() {
        MotorARequest request = new MotorARequest(1.75, 1500.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_75_Q1700_NMX20() {
        MotorARequest request = new MotorARequest(1.75, 1700.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // Speed 1.6 coverage
    @Test
    void testSpeed1_6_Q550_TL20_Deco80_HMC_NMX07() {
        MotorARequest request = new MotorARequest(1.6, 550.0, 20.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_6_Q550_TL20_Deco180_HMC_NMX08() {
        MotorARequest request = new MotorARequest(1.6, 550.0, 20.0, null, 180.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_6_Q550_TL40_Deco80_HMC_NMX07() {
        MotorARequest request = new MotorARequest(1.6, 550.0, 40.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_6_Q550_TL40_Deco200_HMC_NMX08() {
        MotorARequest request = new MotorARequest(1.6, 550.0, 40.0, null, 200.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_6_Q550_TL60_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 550.0, 60.0, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q700_SEC_TL50_Deco100_NMX08() {
        MotorARequest request = new MotorARequest(1.6, 700.0, 50.0, null, 100.0, null, null, null, null, null, null, null, 100.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_6_Q700_SEC_TL50_Deco200_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 700.0, 50.0, null, 200.0, null, null, null, null, null, null, null, 200.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q700_SEC_TL70_Deco80_NMX08() {
        MotorARequest request = new MotorARequest(1.6, 700.0, 70.0, null, 80.0, null, null, null, null, null, null, null, 80.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_6_Q700_SEC_TL70_Deco150_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 700.0, 70.0, null, 150.0, null, null, null, null, null, null, null, 150.0, "SEC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q700_TL80_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 700.0, 80.0, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q700_TTC_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 700.0, null, null, null, null, null, null, null, null, null, null, null, "TTC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q850_TL60_Deco350_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 850.0, 60.0, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q850_TL60_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.6, 850.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_6_Q850_TL60_Deco600_NMX14S() {
        MotorARequest request = new MotorARequest(1.6, 850.0, 60.0, 600.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_6_Q950_TL60_Deco400_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.6, 950.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_6_Q950_TL60_Deco500_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.6, 950.0, 60.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_6_Q950_TL60_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.6, 950.0, 60.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1015_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.6, 1015.0, null, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1100_TL60_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.6, 1100.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1100_TL60_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.6, 1100.0, 60.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1180_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.6, 1180.0, null, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1250_TL60_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(1.6, 1250.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1250_TL60_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(1.6, 1250.0, 60.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1350_TL60_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(1.6, 1350.0, 60.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1350_TL60_Deco900_NMX20() {
        MotorARequest request = new MotorARequest(1.6, 1350.0, 60.0, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1500_NMX20() {
        MotorARequest request = new MotorARequest(1.6, 1500.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_6_Q1700_NMX20() {
        MotorARequest request = new MotorARequest(1.6, 1700.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // Speed 1.0 coverage
    @Test
    void testSpeed1_Q460_TL15_Deco40_NMX05() {
        MotorARequest request = new MotorARequest(1.0, 460.0, 15.0, 40.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testSpeed1_Q460_TL15_Deco60_NMX05() {
        MotorARequest request = new MotorARequest(1.0, 460.0, 15.0, 60.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testSpeed1_Q420_TL25_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 420.0, 25.0, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q490_TL20_Deco40_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 490.0, 20.0, null, 40.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q490_TL20_Deco120_HMC_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 490.0, 20.0, null, 120.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q490_TL40_Deco80_HMC_NMX07() {
        MotorARequest request = new MotorARequest(1.0, 490.0, 40.0, null, 80.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testSpeed1_Q490_TL40_Deco200_HMC_NMX08() {
        MotorARequest request = new MotorARequest(1.0, 490.0, 40.0, null, 200.0, "HMC car", null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_Q490_TL60_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 490.0, 60.0, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q600_TTC_Deco150_NMX08() {
        MotorARequest request = new MotorARequest(1.0, 600.0, null, null, null, null, null, null, null, null, null, null, 150.0, "TTC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testSpeed1_Q600_TTC_Deco250_NMX11() {
        MotorARequest request = new MotorARequest(1.0, 600.0, null, null, null, null, null, null, null, null, null, null, 250.0, "TTC");
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testSpeed1_Q750_TL60_Deco300_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 750.0, 60.0, 300.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q750_TL60_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 750.0, 60.0, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q750_TL60_Deco650_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 750.0, 60.0, 650.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q850_TL70_Deco380_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 850.0, 70.0, 380.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q850_TL70_Deco450_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 850.0, 70.0, 450.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q850_TL70_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 850.0, 70.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q950_TL70_Deco400_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 950.0, 70.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q950_TL70_Deco500_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 950.0, 70.0, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q950_TL70_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 950.0, 70.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1015_TL70_Deco450_NMX11_1000() {
        MotorARequest request = new MotorARequest(1.0, 1015.0, 70.0, 450.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testSpeed1_Q1015_TL70_Deco550_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 1015.0, 70.0, 550.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q1015_TL70_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 1015.0, 70.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1100_TL70_Deco400_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 1100.0, 70.0, 400.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q1100_TL70_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 1100.0, 70.0, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1180_Deco350_NMX11_1150() {
        MotorARequest request = new MotorARequest(1.0, 1180.0, null, 350.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testSpeed1_Q1180_Deco500_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 1180.0, null, 500.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1250_TL70_Deco600_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 1250.0, 70.0, 600.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1250_TL70_Deco900_NMX20() {
        MotorARequest request = new MotorARequest(1.0, 1250.0, 70.0, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_Q1350_TL70_Deco600_NMX14S() {
        MotorARequest request = new MotorARequest(1.0, 1350.0, 70.0, 600.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testSpeed1_Q1350_TL70_Deco900_NMX20() {
        MotorARequest request = new MotorARequest(1.0, 1350.0, 70.0, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_Q1500_Deco700_NMX14() {
        MotorARequest request = new MotorARequest(1.0, 1500.0, null, 700.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testSpeed1_Q1500_Deco900_NMX20() {
        MotorARequest request = new MotorARequest(1.0, 1500.0, null, 900.0, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testSpeed1_Q1700_NMX14() {
        MotorARequest request = new MotorARequest(1.0, 1700.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testSpeed1_Q1900_NMX20() {
        MotorARequest request = new MotorARequest(1.0, 1900.0, null, null, null, null, null, null, null, null, null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // Additional EN81-77_C1 coverage (speed not null)
    @Test
    void testEN81_77_C1_Speed1_75_Q480_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 480.0, null, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_77_C1_Speed1_75_Q490_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 490.0, null, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_77_C1_Speed1_75_Q580_TL60_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 580.0, 60.0, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_77_C1_Speed1_75_Q580_TL70_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 580.0, 70.0, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testEN81_77_C1_Speed1_6_Q580_TL60_NMX11() {
        MotorARequest request = new MotorARequest(1.6, 580.0, 60.0, null, null, null, null, null, null, null, null, true, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    // KDM40 with speed coverage
    @Test
    void testKDM40_Speed1_75_Q550_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 550.0, null, null, null, null, null, null, null, "true", null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testKDM40_Speed1_6_Q550_NMX11() {
        MotorARequest request = new MotorARequest(1.6, 550.0, null, null, null, null, null, null, null, "true", null, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    // Imported with speed coverage
    @Test
    void testImported_Speed1_75_Q550_NMX11() {
        MotorARequest request = new MotorARequest(1.75, 550.0, null, null, null, null, null, null, null, null, true, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testImported_Speed1_6_Q550_NMX11() {
        MotorARequest request = new MotorARequest(1.6, 550.0, null, null, null, null, null, null, null, null, true, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testImported_Speed1_Q420_NMX11() {
        MotorARequest request = new MotorARequest(1.0, 420.0, null, null, null, null, null, null, null, null, true, null, null, null);
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }
}