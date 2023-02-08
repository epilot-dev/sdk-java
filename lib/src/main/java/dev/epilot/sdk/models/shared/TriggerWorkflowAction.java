package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class TriggerWorkflowAction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_failure")
    public Boolean allowFailure;
    public TriggerWorkflowAction withAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("config")
    public TriggerWorkflowConfig config;
    public TriggerWorkflowAction withConfig(TriggerWorkflowConfig config) {
        this.config = config;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_automatically")
    public Boolean createdAutomatically;
    public TriggerWorkflowAction withCreatedAutomatically(Boolean createdAutomatically) {
        this.createdAutomatically = createdAutomatically;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error_output")
    public ErrorOutput errorOutput;
    public TriggerWorkflowAction withErrorOutput(ErrorOutput errorOutput) {
        this.errorOutput = errorOutput;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("execution_status")
    public ExecutionStatusEnum executionStatus;
    public TriggerWorkflowAction withExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_action_id")
    public String flowActionId;
    public TriggerWorkflowAction withFlowActionId(String flowActionId) {
        this.flowActionId = flowActionId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TriggerWorkflowAction withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TriggerWorkflowAction withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outputs")
    public java.util.Map<String, Object> outputs;
    public TriggerWorkflowAction withOutputs(java.util.Map<String, Object> outputs) {
        this.outputs = outputs;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retry_strategy")
    public RetryStrategyEnum retryStrategy;
    public TriggerWorkflowAction withRetryStrategy(RetryStrategyEnum retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("started_at")
    public String startedAt;
    public TriggerWorkflowAction withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Object type;
    public TriggerWorkflowAction withType(Object type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;
    public TriggerWorkflowAction withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
