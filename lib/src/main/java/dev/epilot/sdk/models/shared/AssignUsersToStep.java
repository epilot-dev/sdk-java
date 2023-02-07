package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class AssignUsersToStep {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("step_id")
    public String stepId;
    public AssignUsersToStep withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("step_name")
    public String stepName;
    public AssignUsersToStep withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_ids")
    public Double[] userIds;
    public AssignUsersToStep withUserIds(Double[] userIds) {
        this.userIds = userIds;
        return this;
    }
}