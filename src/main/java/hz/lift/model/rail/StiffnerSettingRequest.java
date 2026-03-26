package hz.lift.model.rail;

public class StiffnerSettingRequest {
    private String typProductModel;
    private Integer wgtRatedLoadQ;
    private String typMacHoisting;
    private String typCarGr;

    public StiffnerSettingRequest() {
    }

    public StiffnerSettingRequest(String typProductModel, Integer wgtRatedLoadQ, 
                                   String typMacHoisting, String typCarGr) {
        this.typProductModel = typProductModel;
        this.wgtRatedLoadQ = wgtRatedLoadQ;
        this.typMacHoisting = typMacHoisting;
        this.typCarGr = typCarGr;
    }

    public String getTypProductModel() {
        return typProductModel;
    }

    public void setTypProductModel(String typProductModel) {
        this.typProductModel = typProductModel;
    }

    public Integer getWgtRatedLoadQ() {
        return wgtRatedLoadQ;
    }

    public void setWgtRatedLoadQ(Integer wgtRatedLoadQ) {
        this.wgtRatedLoadQ = wgtRatedLoadQ;
    }

    public String getTypMacHoisting() {
        return typMacHoisting;
    }

    public void setTypMacHoisting(String typMacHoisting) {
        this.typMacHoisting = typMacHoisting;
    }

    public String getTypCarGr() {
        return typCarGr;
    }

    public void setTypCarGr(String typCarGr) {
        this.typCarGr = typCarGr;
    }
}