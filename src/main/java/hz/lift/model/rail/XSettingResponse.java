package hz.lift.model.rail;

public class XSettingResponse {
    private String result;
    private String matchedRule;

    public XSettingResponse() {
    }

    public XSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static XSettingResponse of(String result) {
        return new XSettingResponse(result, null);
    }

    public static XSettingResponse of(String result, String matchedRule) {
        return new XSettingResponse(result, matchedRule);
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
