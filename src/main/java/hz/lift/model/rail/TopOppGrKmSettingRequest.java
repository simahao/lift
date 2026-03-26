package hz.lift.model.rail;

public class TopOppGrKmSettingRequest {
    private String typCwtGr;
    private String typMacHoisting;
    private Integer dimTravelHeightH;
    private String typEaqPackage;
    private String typProductModel;

    public TopOppGrKmSettingRequest() {
    }

    public TopOppGrKmSettingRequest(String typCwtGr, String typMacHoisting,
                                     Integer dimTravelHeightH, String typEaqPackage,
                                     String typProductModel) {
        this.typCwtGr = typCwtGr;
        this.typMacHoisting = typMacHoisting;
        this.dimTravelHeightH = dimTravelHeightH;
        this.typEaqPackage = typEaqPackage;
        this.typProductModel = typProductModel;
    }

    public String getTypCwtGr() {
        return typCwtGr;
    }

    public void setTypCwtGr(String typCwtGr) {
        this.typCwtGr = typCwtGr;
    }

    public String getTypMacHoisting() {
        return typMacHoisting;
    }

    public void setTypMacHoisting(String typMacHoisting) {
        this.typMacHoisting = typMacHoisting;
    }

    public Integer getDimTravelHeightH() {
        return dimTravelHeightH;
    }

    public void setDimTravelHeightH(Integer dimTravelHeightH) {
        this.dimTravelHeightH = dimTravelHeightH;
    }

    public String getTypEaqPackage() {
        return typEaqPackage;
    }

    public void setTypEaqPackage(String typEaqPackage) {
        this.typEaqPackage = typEaqPackage;
    }

    public String getTypProductModel() {
        return typProductModel;
    }

    public void setTypProductModel(String typProductModel) {
        this.typProductModel = typProductModel;
    }
}
