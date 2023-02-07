package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class ActivityTrigger {
    @JsonProperty("configuration")
    public ActivityTriggerConfiguration configuration;
    public ActivityTrigger withConfiguration(ActivityTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    @JsonProperty("type")
    public ActivityTriggerTypeEnum type;
    public ActivityTrigger withType(ActivityTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}