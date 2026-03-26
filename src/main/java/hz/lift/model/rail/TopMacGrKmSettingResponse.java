package hz.lift.model.rail;

public class TopMacGrKmSettingResponse {
    private String result;
    private String matchedRule;

    public TopMacGrKmSettingResponse() {
    }

    public TopMacGrKmSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static TopMacGrKmSettingResponse of(String result) {
        return new TopMacGrKmSettingResponse(result, null);
    }

    public static TopMacGrKmSettingResponse of(String result, String matchedRule) {
        return new TopMacGrKmSettingResponse(result, matchedRule);
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