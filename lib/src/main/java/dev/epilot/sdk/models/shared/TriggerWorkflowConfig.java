package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerWorkflowConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assign_steps")
    public AssignUsersToStep[] assignSteps;
    public TriggerWorkflowConfig withAssignSteps(AssignUsersToStep[] assignSteps) {
        this.assignSteps = assignSteps;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assignees")
    public String[] assignees;
    public TriggerWorkflowConfig withAssignees(String[] assignees) {
        this.assignees = assignees;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conditions")
    public TriggerWorkflowCondition[] conditions;
    public TriggerWorkflowConfig withConditions(TriggerWorkflowCondition[] conditions) {
        this.conditions = conditions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_workflow")
    public String targetWorkflow;
    public TriggerWorkflowConfig withTargetWorkflow(String targetWorkflow) {
        this.targetWorkflow = targetWorkflow;
        return this;
    }
    
}
