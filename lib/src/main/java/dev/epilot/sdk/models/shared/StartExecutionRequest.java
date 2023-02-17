package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StartExecutionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_id")
    public String entityId;
    public StartExecutionRequest withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_id")
    public String flowId;
    public StartExecutionRequest withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    
}
