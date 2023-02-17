package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.epilot.sdk.utils.DateTimeDeserializer;
import dev.epilot.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class AutomationExecution {
    @JsonProperty("actions")
    public Object[] actions;
    public AutomationExecution withActions(Object[] actions) {
        this.actions = actions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("activity_id")
    public String activityId;
    public AutomationExecution withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public AutomationExecution withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("current_action_id")
    public String currentActionId;
    public AutomationExecution withCurrentActionId(String currentActionId) {
        this.currentActionId = currentActionId;
        return this;
    }
    
    @JsonProperty("entity_id")
    public String entityId;
    public AutomationExecution withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_snapshot")
    public java.util.Map<String, Object> entitySnapshot;
    public AutomationExecution withEntitySnapshot(java.util.Map<String, Object> entitySnapshot) {
        this.entitySnapshot = entitySnapshot;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("execution_status")
    public ExecutionStatusEnum executionStatus;
    public AutomationExecution withExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    
    @JsonProperty("flow_id")
    public String flowId;
    public AutomationExecution withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_name")
    public String flowName;
    public AutomationExecution withFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public AutomationExecution withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("org_id")
    public String orgId;
    public AutomationExecution withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public AutomationExecution withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
}
