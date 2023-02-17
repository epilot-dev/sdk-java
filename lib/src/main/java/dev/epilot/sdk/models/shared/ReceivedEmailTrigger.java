package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceivedEmailTrigger {
    @JsonProperty("configuration")
    public ReceivedEmailTriggerConfiguration configuration;
    public ReceivedEmailTrigger withConfiguration(ReceivedEmailTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    
    @JsonProperty("type")
    public ReceivedEmailTriggerTypeEnum type;
    public ReceivedEmailTrigger withType(ReceivedEmailTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
