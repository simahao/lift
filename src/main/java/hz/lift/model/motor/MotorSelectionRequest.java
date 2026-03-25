package hz.lift.model.motor;

import java.math.BigDecimal;

public class MotorSelectionRequest {
    private BigDecimal speed;
    private BigDecimal q;
    private BigDecimal tl;
    private BigDecimal wgtActualExtraDecoTotal;
    private BigDecimal wgtCarDecorationTotal;
    private BigDecimal wgtCarEstimatedExtra;
    private BigDecimal load;
    private Boolean hmc;
    private String carType;
    private String region;

    public MotorSelectionRequest() {
    }

    public MotorSelectionRequest(
        BigDecimal speed,
        BigDecimal q,
        BigDecimal tl,
        BigDecimal wgtActualExtraDecoTotal
    ) {
        this.speed = speed;
        this.q = q;
        this.tl = tl;
        this.wgtActualExtraDecoTotal = wgtActualExtraDecoTotal;
    }

    public MotorSelectionRequest(
        BigDecimal speed,
        BigDecimal q,
        BigDecimal tl,
        BigDecimal wgtActualExtraDecoTotal,
        BigDecimal wgtCarDecorationTotal,
        BigDecimal wgtCarEstimatedExtra,
        BigDecimal load,
        Boolean hmc,
        String carType,
        String region
    ) {
        this.speed = speed;
        this.q = q;
        this.tl = tl;
        this.wgtActualExtraDecoTotal = wgtActualExtraDecoTotal;
        this.wgtCarDecorationTotal = wgtCarDecorationTotal;
        this.wgtCarEstimatedExtra = wgtCarEstimatedExtra;
        this.load = load;
        this.hmc = hmc;
        this.carType = carType;
        this.region = region;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public BigDecimal getQ() {
        return q;
    }

    public void setQ(BigDecimal q) {
        this.q = q;
    }

    public BigDecimal getTl() {
        return tl;
    }

    public void setTl(BigDecimal tl) {
        this.tl = tl;
    }

    public BigDecimal getWgtActualExtraDecoTotal() {
        return wgtActualExtraDecoTotal;
    }

    public void setWgtActualExtraDecoTotal(BigDecimal wgtActualExtraDecoTotal) {
        this.wgtActualExtraDecoTotal = wgtActualExtraDecoTotal;
    }

    public BigDecimal getWgtCarDecorationTotal() {
        return wgtCarDecorationTotal;
    }

    public void setWgtCarDecorationTotal(BigDecimal wgtCarDecorationTotal) {
        this.wgtCarDecorationTotal = wgtCarDecorationTotal;
    }

    public BigDecimal getWgtCarEstimatedExtra() {
        return wgtCarEstimatedExtra;
    }

    public void setWgtCarEstimatedExtra(BigDecimal wgtCarEstimatedExtra) {
        this.wgtCarEstimatedExtra = wgtCarEstimatedExtra;
    }

    public BigDecimal getLoad() {
        return load;
    }

    public void setLoad(BigDecimal load) {
        this.load = load;
    }

    public Boolean getHmc() {
        return hmc;
    }

    public void setHmc(Boolean hmc) {
        this.hmc = hmc;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
