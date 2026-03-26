package hz.lift.model.rail;

public class XSettingRequest {
    private Integer qtyGrCwtTopBLength;
    private String typCwtGr;

    public XSettingRequest() {
    }

    public XSettingRequest(Integer qtyGrCwtTopBLength, String typCwtGr) {
        this.qtyGrCwtTopBLength = qtyGrCwtTopBLength;
        this.typCwtGr = typCwtGr;
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
