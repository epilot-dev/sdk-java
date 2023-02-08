package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateDocumentActionConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_failure")
    public Boolean allowFailure;
    public CreateDocumentActionConfig withAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("config")
    public CreateDocumentConfig config;
    public CreateDocumentActionConfig withConfig(CreateDocumentConfig config) {
        this.config = config;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_automatically")
    public Boolean createdAutomatically;
    public CreateDocumentActionConfig withCreatedAutomatically(Boolean createdAutomatically) {
        this.createdAutomatically = createdAutomatically;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_action_id")
    public String flowActionId;
    public CreateDocumentActionConfig withFlowActionId(String flowActionId) {
        this.flowActionId = flowActionId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public CreateDocumentActionConfig withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public CreateDocumentActionConfig withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Object type;
    public CreateDocumentActionConfig withType(Object type) {
        this.type = type;
        return this;
    }
}
