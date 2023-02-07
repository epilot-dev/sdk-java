package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class TriggerWebhookActionConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_failure")
    public Boolean allowFailure;
    public TriggerWebhookActionConfig withAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("config")
    public TriggerWebhookConfig config;
    public TriggerWebhookActionConfig withConfig(TriggerWebhookConfig config) {
        this.config = config;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_automatically")
    public Boolean createdAutomatically;
    public TriggerWebhookActionConfig withCreatedAutomatically(Boolean createdAutomatically) {
        this.createdAutomatically = createdAutomatically;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flow_action_id")
    public String flowActionId;
    public TriggerWebhookActionConfig withFlowActionId(String flowActionId) {
        this.flowActionId = flowActionId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TriggerWebhookActionConfig withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TriggerWebhookActionConfig withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public Object type;
    public TriggerWebhookActionConfig withType(Object type) {
        this.type = type;
        return this;
    }
}