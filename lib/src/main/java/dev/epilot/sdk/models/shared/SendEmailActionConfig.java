package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SendEmailActionConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_failure")
    public Boolean allowFailure;
    public SendEmailActionConfig withAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("config")
    public SendEmailConfig config;
    public SendEmailActionConfig withConfig(SendEmailConfig config) {
        this.config = config;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_automatically")
    public Boolean createdAutomatically;
    public SendEmailActionConfig withCreatedAutomatically(Boolean createdAutomatically) {
        this.createdAutomatically = createdAutomatically;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_action_id")
    public String flowActionId;
    public SendEmailActionConfig withFlowActionId(String flowActionId) {
        this.flowActionId = flowActionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SendEmailActionConfig withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public SendEmailActionConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Object type;
    public SendEmailActionConfig withType(Object type) {
        this.type = type;
        return this;
    }
    
}
