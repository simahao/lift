package hz.lift.service.motor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import hz.lift.model.motor.MotorARequest;
import hz.lift.model.motor.MotorAResponse;

@SpringBootTest
class MotorAServiceTest {

    @Autowired
    private MotorAService service;

    // ========== Col2: 400<Q<=450, Speed=1.0 ==========

    @Test
    void testCol2_Q425_Speed1_TL15_Deco40_NMX05() {
        MotorARequest request = new MotorARequest(
            1.0, 425.0, 15.0, null, 40.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testCol2_Q425_Speed1_TL20_Deco40_NMX05() {
        // tl<=20 AND deco<=50 → NMX05
        MotorARequest request = new MotorARequest(
            1.0, 425.0, 20.0, null, 40.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testCol2_Q425_Speed1_TL15_Deco60_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 425.0, 15.0, null, 60.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol2_Q425_Speed1_TL21_Deco50_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 425.0, 21.0, null, 50.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    // ========== Col3: 450<Q<=500, Speed=1.0 ==========

    @Test
    void testCol3_Q470_Speed1_TL15_Deco40_NMX05() {
        MotorARequest request = new MotorARequest(
            1.0, 470.0, 15.0, null, 40.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testCol3_Q470_Speed1_TL25_Deco40_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 470.0, 25.0, null, 40.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol3_Q480_Speed1_TL20_Deco50_NMX05() {
        MotorARequest request = new MotorARequest(
            1.0, 480.0, 20.0, null, 50.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX05", response.getResult());
    }

    @Test
    void testCol3_Q480_Speed1_TL21_Deco50_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 480.0, 21.0, null, 50.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol3_Q485_Speed1_TL20_Deco50_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 485.0, 20.0, null, 50.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol3_Q490_Speed1_TL15_Deco40_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 490.0, 15.0, null, 40.0, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    // ========== Col4: 500<Q<=630, Speed=1.75 ==========

    @Test
    void testCol4_Q550_Speed175_TL20_Deco100_CarHMC_NMX07() {
        MotorARequest request = new MotorARequest(
            1.75, 550.0, 20.0, null, 100.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol4_Q550_Speed175_TL20_Deco160_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.75, 550.0, 20.0, null, 160.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol4_Q550_Speed175_TL30_Deco100_CarHMC_NMX07() {
        MotorARequest request = new MotorARequest(
            1.75, 550.0, 30.0, null, 100.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol4_Q550_Speed175_TL30_Deco150_CarHMC_NMX08() {
        // tl=30 (>25) AND HMC/deco=150 (>100) → NMX08
        MotorARequest request = new MotorARequest(
            1.75, 550.0, 30.0, null, 150.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol4_Q550_Speed175_TL30_Deco200_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.75, 550.0, 30.0, null, 200.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol4_Q550_Speed175_TL56_Deco50_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.75, 550.0, 56.0, null, 50.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    // ========== Col4: 500<Q<=630, Speed=1.6 ==========

    @Test
    void testCol4_Q600_Speed16_TL20_Deco100_CarHMC_NMX07() {
        MotorARequest request = new MotorARequest(
            1.6, 600.0, 20.0, null, 100.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol4_Q600_Speed16_TL20_Deco160_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.6, 600.0, 20.0, null, 160.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol4_Q600_Speed16_TL30_Deco100_CarHMC_NMX07() {
        MotorARequest request = new MotorARequest(
            1.6, 600.0, 30.0, null, 100.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol4_Q600_Speed16_TL56_Deco50_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.6, 600.0, 56.0, null, 50.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    // ========== Col4: 500<Q<=630, Speed=1.0 ==========

    @Test
    void testCol4_Q600_Speed10_TL20_Deco100_CarHMC_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 600.0, 20.0, null, 100.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol4_Q600_Speed10_TL20_Deco160_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.0, 600.0, 20.0, null, 160.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol4_Q600_Speed10_TL30_Deco100_CarHMC_NMX07() {
        MotorARequest request = new MotorARequest(
            1.0, 600.0, 30.0, null, 100.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX07", response.getResult());
    }

    @Test
    void testCol4_Q600_Speed10_TL56_Deco50_CarHMC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.0, 600.0, 56.0, null, 50.0, "HMC", null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    // ========== Col5: 630<Q<=800, Speed=1.75 ==========

    @Test
    void testCol5_Q700_Speed175_TL50_Deco150_OpenSEC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.75, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 150.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed175_TL50_Deco200_OpenSEC_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.75, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 200.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed175_TL70_Deco100_OpenSEC_NMX08() {
        // tl=70 (>60,<=75) AND wgtCarEstimatedExtra=100 (<=100) → NMX08
        MotorARequest request = new MotorARequest(
            1.75, 700.0, 70.0, null, null, null, null, null, null, null, null, null, 100.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed175_TL70_Deco150_OpenSEC_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.75, 700.0, 70.0, null, null, null, null, null, null, null, null, null, 150.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed175_TL50_Deco150_OpenTTC_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.75, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 150.0, "TTC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    // ========== Col5: 630<Q<=800, Speed=1.6 ==========

    @Test
    void testCol5_Q750_Speed16_TL50_Deco150_OpenSEC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.6, 750.0, 50.0, null, null, null, null, null, null, null, null, null, 150.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol5_Q750_Speed16_TL50_Deco200_OpenSEC_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.6, 750.0, 50.0, null, null, null, null, null, null, null, null, null, 200.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol5_Q750_Speed16_TL70_Deco100_OpenSEC_NMX08() {
        // tl=70 (>60,<=75) AND wgtCarEstimatedExtra=100 (<=100) → NMX08
        MotorARequest request = new MotorARequest(
            1.6, 750.0, 70.0, null, null, null, null, null, null, null, null, null, 100.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol5_Q750_Speed16_TL50_Deco150_OpenTTC_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.6, 750.0, 50.0, null, null, null, null, null, null, null, null, null, 150.0, "TTC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    // ========== Col5: 630<Q<=800, Speed=1.0 ==========

    @Test
    void testCol5_Q700_Speed10_TL50_Deco300_OpenSEC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.0, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 300.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed10_TL50_Deco350_OpenSEC_NMX11() {
        MotorARequest request = new MotorARequest(
            1.0, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 350.0, "SEC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed10_TL50_Deco200_OpenTTC_NMX08() {
        MotorARequest request = new MotorARequest(
            1.0, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 200.0, "TTC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX08", response.getResult());
    }

    @Test
    void testCol5_Q700_Speed10_TL50_Deco250_OpenTTC_NMX11() {
        MotorARequest request = new MotorARequest(
            1.0, 700.0, 50.0, null, null, null, null, null, null, null, null, null, 250.0, "TTC"
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11", response.getResult());
    }

    // ========== Col7: 800<Q<=900, Speed=2.5 ==========

    @Test
    void testCol7_Q850_Speed25_TL90_Deco340_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.5, 850.0, 90.0, 340.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed25_TL90_Deco360_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 850.0, 90.0, 360.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed25_TL50_Deco500_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 850.0, 50.0, 500.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col7: 800<Q<=900, Speed=2.0 ==========

    @Test
    void testCol7_Q850_Speed20_TL90_Deco340_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.0, 850.0, 90.0, 340.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed20_TL90_Deco360_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 850.0, 90.0, 360.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col7: 800<Q<=900, Speed=1.75 ==========

    @Test
    void testCol7_Q850_Speed175_TL75_Deco350_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.75, 850.0, 75.0, 350.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed175_TL75_Deco380_NMX111000() {
        // 0.35*850=297.5, deco=380 > 297.5 → NMX11-1000
        MotorARequest request = new MotorARequest(
            1.75, 850.0, 75.0, 380.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed175_TL75_Deco590_NMX14S() {
        // Col7 Speed1.75: NMX14S requires deco>585, 590>585 ✓
        MotorARequest request = new MotorARequest(
            1.75, 850.0, 75.0, 590.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed175_TL76_Deco590_NA() {
        // tl=76 (>75) → no rule matches for NMX
        MotorARequest request = new MotorARequest(
            1.75, 850.0, 76.0, 590.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NA", response.getResult());
    }

    // ========== Col7: 800<Q<=900, Speed=1.6 ==========

    @Test
    void testCol7_Q850_Speed16_TL75_Deco350_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.6, 850.0, 75.0, 350.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed16_TL75_Deco590_NMX14S() {
        // Col7 Speed1.6: NMX14S requires deco>585, 590>585 ✓
        MotorARequest request = new MotorARequest(
            1.6, 850.0, 75.0, 590.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col7: 800<Q<=900, Speed=1.0 ==========

    @Test
    void testCol7_Q850_Speed10_Deco350_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.0, 850.0, 50.0, 350.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed10_Deco400_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.0, 850.0, 50.0, 400.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol7_Q850_Speed10_Deco630_NMX14S() {
        // deco=630 (>620 && <=740) → NMX14S
        MotorARequest request = new MotorARequest(
            1.0, 850.0, 50.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col8: 900<Q<=1000, Speed=3.0 ==========

    @Test
    void testCol8_Q950_Speed30_Deco780_NMX20() {
        MotorARequest request = new MotorARequest(
            3.0, 950.0, 50.0, 780.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col8: 900<Q<=1000, Speed=2.5 ==========

    @Test
    void testCol8_Q950_Speed25_TL90_Deco600_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.5, 950.0, 90.0, 600.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed25_TL90_Deco650_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 950.0, 90.0, 650.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col8: 900<Q<=1000, Speed=2.0 ==========

    @Test
    void testCol8_Q950_Speed20_TL90_Deco600_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.0, 950.0, 90.0, 600.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed20_TL90_Deco650_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 950.0, 90.0, 650.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col8: 900<Q<=1000, Speed=1.75 ==========

    @Test
    void testCol8_Q950_Speed175_TL75_Deco420_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.75, 950.0, 75.0, 420.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed175_TL75_Deco450_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.75, 950.0, 75.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed175_TL75_Deco630_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.75, 950.0, 75.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed175_TL76_Deco630_NA() {
        // tl=76 (>75) → no rule matches
        MotorARequest request = new MotorARequest(
            1.75, 950.0, 76.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NA", response.getResult());
    }

    // ========== Col8: 900<Q<=1000, Speed=1.6 ==========

    @Test
    void testCol8_Q950_Speed16_TL75_Deco420_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.6, 950.0, 75.0, 420.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed16_TL75_Deco630_NMX14S() {
        // Col8 Speed1.6/1.75 NMX14S: deco>620 && <=780, 630>620 ✓
        MotorARequest request = new MotorARequest(
            1.6, 950.0, 75.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col8: 900<Q<=1000, Speed=1.0 ==========

    @Test
    void testCol8_Q950_Speed10_Deco420_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.0, 950.0, 50.0, 420.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed10_Deco450_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.0, 950.0, 50.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol8_Q950_Speed10_Deco630_NMX14S() {
        // Col8 Speed1.0 NMX14S: deco>620 && <=780, 630>620 ✓
        MotorARequest request = new MotorARequest(
            1.0, 950.0, 50.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col9: 1000<Q<=1025, Speed=3.0 ==========

    @Test
    void testCol9_Q1010_Speed30_Deco780_NMX20() {
        MotorARequest request = new MotorARequest(
            3.0, 1010.0, 50.0, 780.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col9: 1000<Q<=1025, Speed=2.5 ==========

    @Test
    void testCol9_Q1010_Speed25_TL90_Deco620_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.5, 1010.0, 90.0, 620.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol9_Q1010_Speed25_TL90_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 1010.0, 90.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col9: 1000<Q<=1025, Speed=2.0 ==========

    @Test
    void testCol9_Q1010_Speed20_TL90_Deco620_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.0, 1010.0, 90.0, 620.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol9_Q1010_Speed20_TL90_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 1010.0, 90.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col9: 1000<Q<=1025, Speed=1.75 ==========

    @Test
    void testCol9_Q1010_Speed175_TL75_Deco450_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.75, 1010.0, 75.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol9_Q1010_Speed175_TL75_Deco500_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.75, 1010.0, 75.0, 500.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol9_Q1010_Speed175_TL75_Deco630_NMX14S() {
        // deco=630 (>620 && <=780) → NMX14S
        MotorARequest request = new MotorARequest(
            1.75, 1010.0, 75.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col9: 1000<Q<=1025, Speed=1.6 ==========

    @Test
    void testCol9_Q1010_Speed16_TL75_Deco450_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.6, 1010.0, 75.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol9_Q1010_Speed16_TL75_Deco630_NMX14S() {
        // deco=630 (>620 && <=780) → NMX14S
        MotorARequest request = new MotorARequest(
            1.6, 1010.0, 75.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col9: 1000<Q<=1025, Speed=1.0 ==========

    @Test
    void testCol9_Q1010_Speed10_Deco450_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.0, 1010.0, 50.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol9_Q1010_Speed10_Deco630_NMX14S() {
        // NMX14S: deco>620 && <=780, 630>620 ✓
        MotorARequest request = new MotorARequest(
            1.0, 1010.0, 50.0, 630.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col10: 1025<Q<=1050, Speed=3.0 ==========

    @Test
    void testCol10_Q1035_Speed30_Deco780_NMX20() {
        MotorARequest request = new MotorARequest(
            3.0, 1035.0, 50.0, 780.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col10: 1025<Q<=1050, Speed=2.5 ==========

    @Test
    void testCol10_Q1035_Speed25_TL90_Deco620_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.5, 1035.0, 90.0, 620.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol10_Q1035_Speed25_TL90_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 1035.0, 90.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col10: 1025<Q<=1050, Speed=2.0 ==========

    @Test
    void testCol10_Q1035_Speed20_TL90_Deco620_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.0, 1035.0, 90.0, 620.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol10_Q1035_Speed20_TL90_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 1035.0, 90.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col10: 1025<Q<=1050, Speed=1.75 ==========

    @Test
    void testCol10_Q1035_Speed175_TL75_Deco620_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.75, 1035.0, 75.0, 620.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol10_Q1035_Speed175_TL75_Deco650_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.75, 1035.0, 75.0, 650.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col10: 1025<Q<=1050, Speed=1.6 ==========

    @Test
    void testCol10_Q1035_Speed16_TL75_Deco620_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.6, 1035.0, 75.0, 620.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol10_Q1035_Speed16_TL75_Deco650_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.6, 1035.0, 75.0, 650.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col10: 1025<Q<=1050, Speed=1.0 ==========

    @Test
    void testCol10_Q1035_Speed10_Deco410_NMX111000() {
        MotorARequest request = new MotorARequest(
            1.0, 1035.0, 50.0, 410.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1000", response.getResult());
    }

    @Test
    void testCol10_Q1035_Speed10_Deco450_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.0, 1035.0, 50.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol10_Q1035_Speed10_Deco650_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.0, 1035.0, 50.0, 650.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col11: 1050<Q<=1155, Speed=3.0 ==========

    @Test
    void testCol11_Q1080_Speed30_Deco860_NMX20() {
        MotorARequest request = new MotorARequest(
            3.0, 1080.0, 50.0, 860.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col11: 1050<Q<=1155, Speed=2.5 ==========

    @Test
    void testCol11_Q1080_Speed25_Deco860_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 1080.0, 50.0, 860.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col11: 1050<Q<=1155, Speed=2.0 ==========

    @Test
    void testCol11_Q1080_Speed20_TL90_Deco430_NMX111150() {
        MotorARequest request = new MotorARequest(
            2.0, 1080.0, 90.0, 430.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol11_Q1080_Speed20_TL90_Deco500_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 1080.0, 90.0, 500.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col11: 1050<Q<=1155, Speed=1.75 ==========

    @Test
    void testCol11_Q1080_Speed175_TL75_Deco430_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.75, 1080.0, 75.0, 430.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol11_Q1080_Speed175_TL75_Deco450_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.75, 1080.0, 75.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col11: 1050<Q<=1155, Speed=1.6 ==========

    @Test
    void testCol11_Q1080_Speed16_TL75_Deco430_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.6, 1080.0, 75.0, 430.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol11_Q1080_Speed16_TL75_Deco450_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.6, 1080.0, 75.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col11: 1050<Q<=1155, Speed=1.0 ==========

    @Test
    void testCol11_Q1080_Speed10_Deco430_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.0, 1080.0, 50.0, 430.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol11_Q1080_Speed10_Deco450_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.0, 1080.0, 50.0, 450.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col12: 1155<Q<=1200, Speed=1.75 ==========

    @Test
    void testCol12_Q1175_Speed175_Deco350_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.75, 1175.0, 50.0, 350.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol12_Q1175_Speed175_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.75, 1175.0, 50.0, 400.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col12: 1155<Q<=1200, Speed=1.6 ==========

    @Test
    void testCol12_Q1175_Speed16_Deco350_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.6, 1175.0, 50.0, 350.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol12_Q1175_Speed16_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.6, 1175.0, 50.0, 400.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col12: 1155<Q<=1200, Speed=1.0 ==========

    @Test
    void testCol12_Q1175_Speed10_Deco350_NMX111150() {
        MotorARequest request = new MotorARequest(
            1.0, 1175.0, 50.0, 350.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX11-1150", response.getResult());
    }

    @Test
    void testCol12_Q1175_Speed10_Deco400_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.0, 1175.0, 50.0, 400.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    // ========== Col13: 1200<Q<=1275, Speed=3.0 ==========

    @Test
    void testCol13_Q1225_Speed30_Deco960_NMX20() {
        MotorARequest request = new MotorARequest(
            3.0, 1225.0, 50.0, 960.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col13: 1200<Q<=1275, Speed=2.5 ==========

    @Test
    void testCol13_Q1225_Speed25_Deco960_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 1225.0, 50.0, 960.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col13: 1200<Q<=1275, Speed=2.0 ==========

    @Test
    void testCol13_Q1225_Speed20_Deco490_NMX14() {
        MotorARequest request = new MotorARequest(
            2.0, 1225.0, 50.0, 490.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testCol13_Q1225_Speed20_Deco600_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 1225.0, 50.0, 600.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col13: 1200<Q<=1275, Speed=1.75 ==========

    @Test
    void testCol13_Q1225_Speed175_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.75, 1225.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol13_Q1225_Speed175_Deco850_NMX20() {
        MotorARequest request = new MotorARequest(
            1.75, 1225.0, 50.0, 850.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col13: 1200<Q<=1275, Speed=1.6 ==========

    @Test
    void testCol13_Q1225_Speed16_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.6, 1225.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol13_Q1225_Speed16_Deco850_NMX20() {
        MotorARequest request = new MotorARequest(
            1.6, 1225.0, 50.0, 850.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col13: 1200<Q<=1275, Speed=1.0 ==========

    @Test
    void testCol13_Q1225_Speed10_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.0, 1225.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol13_Q1225_Speed10_Deco850_NMX20() {
        MotorARequest request = new MotorARequest(
            1.0, 1225.0, 50.0, 850.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col14: 1275<Q<=1365, Speed=3.0 ==========

    @Test
    void testCol14_Q1325_Speed30_Deco1000_NMX20() {
        MotorARequest request = new MotorARequest(
            3.0, 1325.0, 50.0, 1000.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col14: 1275<Q<=1365, Speed=2.5 ==========

    @Test
    void testCol14_Q1325_Speed25_Deco1000_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 1325.0, 50.0, 1000.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col14: 1275<Q<=1365, Speed=2.0 ==========

    @Test
    void testCol14_Q1325_Speed20_Deco530_NMX14() {
        MotorARequest request = new MotorARequest(
            2.0, 1325.0, 50.0, 530.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testCol14_Q1325_Speed20_Deco600_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 1325.0, 50.0, 600.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col14: 1275<Q<=1365, Speed=1.75 ==========

    @Test
    void testCol14_Q1325_Speed175_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.75, 1325.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol14_Q1325_Speed175_Deco850_NMX20() {
        MotorARequest request = new MotorARequest(
            1.75, 1325.0, 50.0, 850.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col14: 1275<Q<=1365, Speed=1.6 ==========

    @Test
    void testCol14_Q1325_Speed16_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.6, 1325.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol14_Q1325_Speed16_Deco850_NMX20() {
        MotorARequest request = new MotorARequest(
            1.6, 1325.0, 50.0, 850.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col14: 1275<Q<=1365, Speed=1.0 ==========

    @Test
    void testCol14_Q1325_Speed10_Deco700_NMX14S() {
        MotorARequest request = new MotorARequest(
            1.0, 1325.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14S", response.getResult());
    }

    @Test
    void testCol14_Q1325_Speed10_Deco850_NMX20() {
        MotorARequest request = new MotorARequest(
            1.0, 1325.0, 50.0, 850.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col15: 1365<Q<=1600, Speed=2.5 ==========

    @Test
    void testCol15_Q1450_Speed25_Deco1000_NMX20() {
        MotorARequest request = new MotorARequest(
            2.5, 1450.0, 50.0, 1000.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col15: 1365<Q<=1600, Speed=2.0 ==========

    @Test
    void testCol15_Q1450_Speed20_Deco1000_NMX20() {
        MotorARequest request = new MotorARequest(
            2.0, 1450.0, 50.0, 1000.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col15: 1365<Q<=1600, Speed=1.75 ==========

    @Test
    void testCol15_Q1450_Speed175_Deco580_NMX14() {
        MotorARequest request = new MotorARequest(
            1.75, 1450.0, 50.0, 580.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testCol15_Q1450_Speed175_Deco700_NMX20() {
        // 0.4*1450=580, 580<700<1190 → NMX20
        MotorARequest request = new MotorARequest(
            1.75, 1450.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col15: 1365<Q<=1600, Speed=1.6 ==========

    @Test
    void testCol15_Q1450_Speed16_Deco580_NMX14() {
        MotorARequest request = new MotorARequest(
            1.6, 1450.0, 50.0, 580.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testCol15_Q1450_Speed16_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(
            1.6, 1450.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col15: 1365<Q<=1600, Speed=1.0 ==========

    @Test
    void testCol15_Q1450_Speed10_Deco580_NMX14() {
        MotorARequest request = new MotorARequest(
            1.0, 1450.0, 50.0, 580.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX14", response.getResult());
    }

    @Test
    void testCol15_Q1450_Speed10_Deco700_NMX20() {
        MotorARequest request = new MotorARequest(
            1.0, 1450.0, 50.0, 700.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col16: 1600<Q<=1800, Speed=1.75 ==========

    @Test
    void testCol16_Q1700_Speed175_Deco1200_NMX20() {
        MotorARequest request = new MotorARequest(
            1.75, 1700.0, 50.0, 1200.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col16: 1600<Q<=1800, Speed=1.6 ==========

    @Test
    void testCol16_Q1700_Speed16_Deco1200_NMX20() {
        MotorARequest request = new MotorARequest(
            1.6, 1700.0, 50.0, 1200.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }

    // ========== Col16: 1600<Q<=1800, Speed=1.0 ==========

    @Test
    void testCol16_Q1700_Speed10_Deco1200_NMX20() {
        MotorARequest request = new MotorARequest(
            1.0, 1700.0, 50.0, 1200.0, null, null, null, null, null, null, null, null, null, null
        );
        MotorAResponse response = service.getMotor(request);
        assertEquals("NMX20", response.getResult());
    }
}
