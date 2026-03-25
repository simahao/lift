package hz.lift.model.rail;

public class OppoGrSettingRequest {
    private String typProductModel;
    private String typCarGr;
    private String typMacHoisting;
    private String typCarSling;
    private String typElecFeatLwd;
    private Double dimTravelHeightH;
    private Double valRatedSpeed;

    public OppoGrSettingRequest() {
    }

    public OppoGrSettingRequest(String typProductModel, String typCarGr, String typMacHoisting, 
                              String typCarSling, String typElecFeatLwd, Double dimTravelHeightH, Double valRatedSpeed) {
        this.typProductModel = typProductModel;
        this.typCarGr = typCarGr;
        this.typMacHoisting = typMacHoisting;
        this.typCarSling = typCarSling;
        this.typElecFeatLwd = typElecFeatLwd;
        this.dimTravelHeightH = dimTravelHeightH;
        this.valRatedSpeed = valRatedSpeed;
    }

    public String getTypProductModel() { return typProductModel; }
    public void setTypProductModel(String typProductModel) { this.typProductModel = typProductModel; }
    public String getTypCarGr() { return typCarGr; }
    public void setTypCarGr(String typCarGr) { this.typCarGr = typCarGr; }
    public String getTypMacHoisting() { return typMacHoisting; }
    public void setTypMacHoisting(String typMacHoisting) { this.typMacHoisting = typMacHoisting; }
    public String getTypCarSling() { return typCarSling; }
    public void setTypCarSling(String typCarSling) { this.typCarSling = typCarSling; }
    public String getTypElecFeatLwd() { return typElecFeatLwd; }
    public void setTypElecFeatLwd(String typElecFeatLwd) { this.typElecFeatLwd = typElecFeatLwd; }
    public Double getDimTravelHeightH() { return dimTravelHeightH; }
    public void setDimTravelHeightH(Double dimTravelHeightH) { this.dimTravelHeightH = dimTravelHeightH; }
    public Double getValRatedSpeed() { return valRatedSpeed; }
    public void setValRatedSpeed(Double valRatedSpeed) { this.valRatedSpeed = valRatedSpeed; }
}