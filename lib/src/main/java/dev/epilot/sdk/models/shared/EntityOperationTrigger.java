package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class EntityOperationTrigger {
    @JsonProperty("configuration")
    public EntityOperationTriggerConfiguration configuration;
    public EntityOperationTrigger withConfiguration(EntityOperationTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    @JsonProperty("type")
    public EntityOperationTriggerTypeEnum type;
    public EntityOperationTrigger withType(EntityOperationTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}