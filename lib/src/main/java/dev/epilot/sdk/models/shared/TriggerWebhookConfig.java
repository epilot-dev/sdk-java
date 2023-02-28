package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerWebhookConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_sources")
    public String[] entitySources;
    public TriggerWebhookConfig withEntitySources(String[] entitySources) {
        this.entitySources = entitySources;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_webhook_id")
    public String targetWebhookId;
    public TriggerWebhookConfig withTargetWebhookId(String targetWebhookId) {
        this.targetWebhookId = targetWebhookId;
        return this;
    }
    
}
