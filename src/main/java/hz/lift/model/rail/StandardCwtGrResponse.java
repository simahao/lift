package hz.lift.model.rail;

public class StandardCwtGrResponse {
    private String result;
    private String matchedRule;

    public StandardCwtGrResponse() {
    }

    public StandardCwtGrResponse(String result, String matchedRule) {
        this.result = result;
        this.matchedRule = matchedRule;
    }

    public static StandardCwtGrResponse of(String result) {
        return new StandardCwtGrResponse(result, null);
    }

    public static StandardCwtGrResponse of(String result, String matchedRule) {
        return new StandardCwtGrResponse(result, matchedRule);
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
