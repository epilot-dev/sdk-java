package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class SendEmailAction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_failure")
    public Boolean allowFailure;
    public SendEmailAction withAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("config")
    public SendEmailConfig config;
    public SendEmailAction withConfig(SendEmailConfig config) {
        this.config = config;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_automatically")
    public Boolean createdAutomatically;
    public SendEmailAction withCreatedAutomatically(Boolean createdAutomatically) {
        this.createdAutomatically = createdAutomatically;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error_output")
    public ErrorOutput errorOutput;
    public SendEmailAction withErrorOutput(ErrorOutput errorOutput) {
        this.errorOutput = errorOutput;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("execution_status")
    public ExecutionStatusEnum executionStatus;
    public SendEmailAction withExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_action_id")
    public String flowActionId;
    public SendEmailAction withFlowActionId(String flowActionId) {
        this.flowActionId = flowActionId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SendEmailAction withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public SendEmailAction withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outputs")
    public java.util.Map<String, Object> outputs;
    public SendEmailAction withOutputs(java.util.Map<String, Object> outputs) {
        this.outputs = outputs;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retry_strategy")
    public RetryStrategyEnum retryStrategy;
    public SendEmailAction withRetryStrategy(RetryStrategyEnum retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("started_at")
    public String startedAt;
    public SendEmailAction withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Object type;
    public SendEmailAction withType(Object type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;
    public SendEmailAction withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
