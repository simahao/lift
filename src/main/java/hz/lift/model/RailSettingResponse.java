package hz.lift.model;

public class RailSettingResponse {
    private String result;
    private String matchedRule;

    public RailSettingResponse() {
    }

    public RailSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static RailSettingResponse of(String result) {
        return new RailSettingResponse(result, null);
    }

    public static RailSettingResponse of(String result, String matchedRule) {
        return new RailSettingResponse(result, matchedRule);
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