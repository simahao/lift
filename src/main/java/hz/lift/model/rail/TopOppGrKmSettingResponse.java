package hz.lift.model.rail;

public class TopOppGrKmSettingResponse {
    private String result;
    private String matchedRule;

    public TopOppGrKmSettingResponse() {
    }

    public TopOppGrKmSettingResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static TopOppGrKmSettingResponse of(String result) {
        return new TopOppGrKmSettingResponse(result, null);
    }

    public static TopOppGrKmSettingResponse of(String result, String matchedRule) {
        return new TopOppGrKmSettingResponse(result, matchedRule);
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
