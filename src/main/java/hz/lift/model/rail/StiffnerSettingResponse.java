package hz.lift.model.rail;

public class StiffnerSettingResponse {
    private String result;
    private String matchedRule;

    public StiffnerSettingResponse() {
    }

    public StiffnerSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static StiffnerSettingResponse of(String result) {
        return new StiffnerSettingResponse(result, null);
    }

    public static StiffnerSettingResponse of(String result, String matchedRule) {
        return new StiffnerSettingResponse(result, matchedRule);
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