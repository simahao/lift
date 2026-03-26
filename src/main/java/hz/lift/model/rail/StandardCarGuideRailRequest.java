package hz.lift.model.rail;

public class StandardCarGuideRailRequest {
    private Integer qtyCarGrVariable;
    private Integer qtyCarGrHalf;
    private Integer qtyCarGrStandard;
    private String typCarGr;

    public StandardCarGuideRailRequest() {
    }

    public StandardCarGuideRailRequest(Integer qtyCarGrVariable, Integer qtyCarGrHalf,
                                       Integer qtyCarGrStandard, String typCarGr) {
        this.qtyCarGrVariable = qtyCarGrVariable;
        this.qtyCarGrHalf = qtyCarGrHalf;
        this.qtyCarGrStandard = qtyCarGrStandard;
        this.typCarGr = typCarGr;
    }

    public Integer getQtyCarGrVariable() {
        return qtyCarGrVariable;
    }

    public void setQtyCarGrVariable(Integer qtyCarGrVariable) {
        this.qtyCarGrVariable = qtyCarGrVariable;
    }

    public Integer getQtyCarGrHalf() {
        return qtyCarGrHalf;
    }

    public void setQtyCarGrHalf(Integer qtyCarGrHalf) {
        this.qtyCarGrHalf = qtyCarGrHalf;
    }

    public Integer getQtyCarGrStandard() {
        return qtyCarGrStandard;
    }

    public void setQtyCarGrStandard(Integer qtyCarGrStandard) {
        this.qtyCarGrStandard = qtyCarGrStandard;
    }

    public String getTypCarGr() {
        return typCarGr;
    }

    public void setTypCarGr(String typCarGr) {
        this.typCarGr = typCarGr;
    }
}
