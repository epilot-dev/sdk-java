package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityOperation {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("activity_id")
    public String activityId;
    public EntityOperation withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("diff")
    public EntityOperationDiff diff;
    public EntityOperation withDiff(EntityOperationDiff diff) {
        this.diff = diff;
        return this;
    }
    
    @JsonProperty("entity")
    public String entity;
    public EntityOperation withEntity(String entity) {
        this.entity = entity;
        return this;
    }
    
    @JsonProperty("operation")
    public EntityOperationOperationEnum operation;
    public EntityOperation withOperation(EntityOperationOperationEnum operation) {
        this.operation = operation;
        return this;
    }
    
    @JsonProperty("org")
    public String org;
    public EntityOperation withOrg(String org) {
        this.org = org;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("params")
    public EntityOperationParams params;
    public EntityOperation withParams(EntityOperationParams params) {
        this.params = params;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payload")
    public java.util.Map<String, Object> payload;
    public EntityOperation withPayload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }
    
}
