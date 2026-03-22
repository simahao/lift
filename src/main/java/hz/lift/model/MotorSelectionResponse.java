package hz.lift.model;

import java.util.List;

public class MotorSelectionResponse {
    private String motor;
    private String matchedRule;
    private List<String> appliedConditions;

    public MotorSelectionResponse() {
    }

    public MotorSelectionResponse(String motor, String matchedRule, List<String> appliedConditions) {
        this.motor = motor;
        this.matchedRule = matchedRule;
        this.appliedConditions = appliedConditions;
    }

    public static MotorSelectionResponse of(String motor) {
        return new MotorSelectionResponse(motor, null, null);
    }

    public static MotorSelectionResponse of(String motor, String matchedRule, List<String> appliedConditions) {
        return new MotorSelectionResponse(motor, matchedRule, appliedConditions);
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMatchedRule() {
        return matchedRule;
    }

    public void setMatchedRule(String matchedRule) {
        this.matchedRule = matchedRule;
    }

    public List<String> getAppliedConditions() {
        return appliedConditions;
    }

    public void setAppliedConditions(List<String> appliedConditions) {
        this.appliedConditions = appliedConditions;
    }
}
