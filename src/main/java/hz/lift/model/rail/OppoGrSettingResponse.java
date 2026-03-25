package hz.lift.model.rail;

public class OppoGrSettingResponse {
    private String result;
    private String matchedRule;

    public OppoGrSettingResponse() {
    }

    public OppoGrSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static OppoGrSettingResponse of(String result) {
        return new OppoGrSettingResponse(result, null);
    }

    public static OppoGrSettingResponse of(String result, String matchedRule) {
        return new OppoGrSettingResponse(result, matchedRule);
    }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
    public String getMatchedRule() { return matchedRule; }
    public void setMatchedRule(String matchedRule) { this.matchedRule = matchedRule; }
}