package hz.lift.model.rail;

public class StandardCwtGrRequest {
    private Integer qtyGrCwtVarALength;
    private Integer qtyGrCwtVarBLength;
    private Integer qtyCwtGrHalf;
    private Integer qtyCwtGrStandard;
    private String typCwtGr;
    private Integer dimCwtGrLengthStandard;

    public StandardCwtGrRequest() {
    }

    public StandardCwtGrRequest(Integer qtyGrCwtVarALength, Integer qtyGrCwtVarBLength,
                                 Integer qtyCwtGrHalf, Integer qtyCwtGrStandard,
                                 String typCwtGr, Integer dimCwtGrLengthStandard) {
        this.qtyGrCwtVarALength = qtyGrCwtVarALength;
        this.qtyGrCwtVarBLength = qtyGrCwtVarBLength;
        this.qtyCwtGrHalf = qtyCwtGrHalf;
        this.qtyCwtGrStandard = qtyCwtGrStandard;
        this.typCwtGr = typCwtGr;
        this.dimCwtGrLengthStandard = dimCwtGrLengthStandard;
    }

    public Integer getQtyGrCwtVarALength() {
        return qtyGrCwtVarALength;
    }

    public void setQtyGrCwtVarALength(Integer qtyGrCwtVarALength) {
        this.qtyGrCwtVarALength = qtyGrCwtVarALength;
    }

    public Integer getQtyGrCwtVarBLength() {
        return qtyGrCwtVarBLength;
    }

    public void setQtyGrCwtVarBLength(Integer qtyGrCwtVarBLength) {
        this.qtyGrCwtVarBLength = qtyGrCwtVarBLength;
    }

    public Integer getQtyCwtGrHalf() {
        return qtyCwtGrHalf;
    }

    public void setQtyCwtGrHalf(Integer qtyCwtGrHalf) {
        this.qtyCwtGrHalf = qtyCwtGrHalf;
    }

    public Integer getQtyCwtGrStandard() {
        return qtyCwtGrStandard;
    }

    public void setQtyCwtGrStandard(Integer qtyCwtGrStandard) {
        this.qtyCwtGrStandard = qtyCwtGrStandard;
    }

    public String getTypCwtGr() {
        return typCwtGr;
    }

    public void setTypCwtGr(String typCwtGr) {
        this.typCwtGr = typCwtGr;
    }

    public Integer getDimCwtGrLengthStandard() {
        return dimCwtGrLengthStandard;
    }

    public void setDimCwtGrLengthStandard(Integer dimCwtGrLengthStandard) {
        this.dimCwtGrLengthStandard = dimCwtGrLengthStandard;
    }
}
