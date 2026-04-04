package hz.lift.model.motor;

public class MotorAResponse {
    private String result;
    private String matchedRule;

    public MotorAResponse() {
    }

    public MotorAResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static MotorAResponse of(String result) {
        return new MotorAResponse(result, null);
    }

    public static MotorAResponse of(String result, String matchedRule) {
        return new MotorAResponse(result, matchedRule);
    }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
    public String getMatchedRule() { return matchedRule; }
    public void setMatchedRule(String matchedRule) { this.matchedRule = matchedRule; }
}