package hz.lift.model.rail;

public class Tk5aFillerSettingRequest {
    private String typCwtGr;
    private Double valRatedSpeed;

    public Tk5aFillerSettingRequest() {
    }

    public Tk5aFillerSettingRequest(String typCwtGr, Double valRatedSpeed) {
        this.typCwtGr = typCwtGr;
        this.valRatedSpeed = valRatedSpeed;
    }

    public String getTypCwtGr() {
        return typCwtGr;
    }

    public void setTypCwtGr(String typCwtGr) {
        this.typCwtGr = typCwtGr;
    }

    public Double getValRatedSpeed() {
        return valRatedSpeed;
    }

    public void setValRatedSpeed(Double valRatedSpeed) {
        this.valRatedSpeed = valRatedSpeed;
    }
}
