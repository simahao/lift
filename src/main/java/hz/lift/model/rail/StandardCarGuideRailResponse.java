package hz.lift.model.rail;

public class StandardCarGuideRailResponse {
    private String result1;
    private String result2;
    private String matchedRule;

    public StandardCarGuideRailResponse() {
    }

    public StandardCarGuideRailResponse(String result1, String result2, String matchedRule) {
        this.result1 = result1;
        this.result2 = result2;
        this.matchedRule = matchedRule;
    }

    public static StandardCarGuideRailResponse of(String result1, String result2) {
        return new StandardCarGuideRailResponse(result1, result2, null);
    }

    public static StandardCarGuideRailResponse of(String result1, String result2, String matchedRule) {
        return new StandardCarGuideRailResponse(result1, result2, matchedRule);
    }

    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getMatchedRule() {
        return matchedRule;
    }

    public void setMatchedRule(String matchedRule) {
        this.matchedRule = matchedRule;
    }
}
