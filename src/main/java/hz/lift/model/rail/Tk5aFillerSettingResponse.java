package hz.lift.model.rail;

public class Tk5aFillerSettingResponse {
    private String result;
    private String matchedRule;

    public Tk5aFillerSettingResponse() {
    }

    public Tk5aFillerSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static Tk5aFillerSettingResponse of(String result) {
        return new Tk5aFillerSettingResponse(result, null);
    }

    public static Tk5aFillerSettingResponse of(String result, String matchedRule) {
        return new Tk5aFillerSettingResponse(result, matchedRule);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMatchedRule() {
        return matchedRule;
    }

    public void setMatchedRule(String matchedRule) {
        this.matchedRule = matchedRule;
    }
}
