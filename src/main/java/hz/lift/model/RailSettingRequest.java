package hz.lift.model;

public class RailSettingRequest {
    private String typProductModel;
    private String typCarGr;
    private String typMacHoisting;
    private String typCarSling;
    private Double valRatedSpeed;

    public RailSettingRequest() {
    }

    public RailSettingRequest(String typProductModel, String typCarGr, 
                               String typMacHoisting, String typCarSling, Double valRatedSpeed) {
        this.typProductModel = typProductModel;
        this.typCarGr = typCarGr;
        this.typMacHoisting = typMacHoisting;
        this.typCarSling = typCarSling;
        this.valRatedSpeed = valRatedSpeed;
    }

    public String getTypProductModel() {
        return typProductModel;
    }

    public void setTypProductModel(String typProductModel) {
        this.typProductModel = typProductModel;
    }

    public String getTypCarGr() {
        return typCarGr;
    }

    public void setTypCarGr(String typCarGr) {
        this.typCarGr = typCarGr;
    }

    public String getTypMacHoisting() {
        return typMacHoisting;
    }

    public void setTypMacHoisting(String typMacHoisting) {
        this.typMacHoisting = typMacHoisting;
    }

    public String getTypCarSling() {
        return typCarSling;
    }

    public void setTypCarSling(String typCarSling) {
        this.typCarSling = typCarSling;
    }

    public Double getValRatedSpeed() {
        return valRatedSpeed;
    }

    public void setValRatedSpeed(Double valRatedSpeed) {
        this.valRatedSpeed = valRatedSpeed;
    }
}