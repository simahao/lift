package hz.lift.model.motor;

public class MotorARequest {
    private Double speed;
    private Double q;
    private Double tl;
    private Double wgtCarDecorationTotal;
    private Double wgtActualExtraDecoTotal;
    private String carType;
    private String xType;
    private Boolean t7007_2022;
    private String typElevTsgT7001_2023Regist;
    private String kdm40;
    private Boolean imported;
    private Boolean en81_77_c1;
    private Double wgtCarEstimatedExtra;
    private String openType;

    public MotorARequest() {
    }

    public MotorARequest(Double speed, Double q, Double tl, Double wgtCarDecorationTotal,
                         Double wgtActualExtraDecoTotal, String carType, String xType,
                         Boolean t7007_2022, String typElevTsgT7001_2023Regist,
                         String kdm40, Boolean imported, Boolean en81_77_c1,
                         Double wgtCarEstimatedExtra, String openType) {
        this.speed = speed;
        this.q = q;
        this.tl = tl;
        this.wgtCarDecorationTotal = wgtCarDecorationTotal;
        this.wgtActualExtraDecoTotal = wgtActualExtraDecoTotal;
        this.carType = carType;
        this.xType = xType;
        this.t7007_2022 = t7007_2022;
        this.typElevTsgT7001_2023Regist = typElevTsgT7001_2023Regist;
        this.kdm40 = kdm40;
        this.imported = imported;
        this.en81_77_c1 = en81_77_c1;
        this.wgtCarEstimatedExtra = wgtCarEstimatedExtra;
        this.openType = openType;
    }

    public Double getSpeed() { return speed; }
    public void setSpeed(Double speed) { this.speed = speed; }
    public Double getQ() { return q; }
    public void setQ(Double q) { this.q = q; }
    public Double getTl() { return tl; }
    public void setTl(Double tl) { this.tl = tl; }
    public Double getWgtCarDecorationTotal() { return wgtCarDecorationTotal; }
    public void setWgtCarDecorationTotal(Double wgtCarDecorationTotal) { this.wgtCarDecorationTotal = wgtCarDecorationTotal; }
    public Double getWgtActualExtraDecoTotal() { return wgtActualExtraDecoTotal; }
    public void setWgtActualExtraDecoTotal(Double wgtActualExtraDecoTotal) { this.wgtActualExtraDecoTotal = wgtActualExtraDecoTotal; }
    public String getCarType() { return carType; }
    public void setCarType(String carType) { this.carType = carType; }
    public String getXType() { return xType; }
    public void setXType(String xType) { this.xType = xType; }
    public Boolean getT7007_2022() { return t7007_2022; }
    public void setT7007_2022(Boolean t7007_2022) { this.t7007_2022 = t7007_2022; }
    public String getTypElevTsgT7001_2023Regist() { return typElevTsgT7001_2023Regist; }
    public void setTypElevTsgT7001_2023Regist(String typElevTsgT7001_2023Regist) { this.typElevTsgT7001_2023Regist = typElevTsgT7001_2023Regist; }
    public String getKdm40() { return kdm40; }
    public void setKdm40(String kdm40) { this.kdm40 = kdm40; }
    public Boolean getImported() { return imported; }
    public void setImported(Boolean imported) { this.imported = imported; }
    public Boolean getEn81_77_c1() { return en81_77_c1; }
    public void setEn81_77_c1(Boolean en81_77_c1) { this.en81_77_c1 = en81_77_c1; }
    public Double getWgtCarEstimatedExtra() { return wgtCarEstimatedExtra; }
    public void setWgtCarEstimatedExtra(Double wgtCarEstimatedExtra) { this.wgtCarEstimatedExtra = wgtCarEstimatedExtra; }
    public String getOpenType() { return openType; }
    public void setOpenType(String openType) { this.openType = openType; }
}