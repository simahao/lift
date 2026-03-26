package hz.lift.model.rail;

public class TopMacGrKmSettingRequest {
    private String cwtGr;
    private Integer qtyGrCwtTopALength;
    private Integer qtyGrCwtTopBLength;
    private String typCwtGr;

    public TopMacGrKmSettingRequest() {
    }

    public TopMacGrKmSettingRequest(String cwtGr, Integer qtyGrCwtTopALength, 
                                     Integer qtyGrCwtTopBLength, String typCwtGr) {
        this.cwtGr = cwtGr;
        this.qtyGrCwtTopALength = qtyGrCwtTopALength;
        this.qtyGrCwtTopBLength = qtyGrCwtTopBLength;
        this.typCwtGr = typCwtGr;
    }

    public String getCwtGr() {
        return cwtGr;
    }

    public void setCwtGr(String cwtGr) {
        this.cwtGr = cwtGr;
    }

    public Integer getQtyGrCwtTopALength() {
        return qtyGrCwtTopALength;
    }

    public void setQtyGrCwtTopALength(Integer qtyGrCwtTopALength) {
        this.qtyGrCwtTopALength = qtyGrCwtTopALength;
    }

    public Integer getQtyGrCwtTopBLength() {
        return qtyGrCwtTopBLength;
    }

    public void setQtyGrCwtTopBLength(Integer qtyGrCwtTopBLength) {
        this.qtyGrCwtTopBLength = qtyGrCwtTopBLength;
    }

    public String getTypCwtGr() {
        return typCwtGr;
    }

    public void setTypCwtGr(String typCwtGr) {
        this.typCwtGr = typCwtGr;
    }
}