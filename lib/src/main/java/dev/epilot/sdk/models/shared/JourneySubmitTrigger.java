package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneySubmitTrigger {
    @JsonProperty("configuration")
    public JourneySubmitTriggerConfiguration configuration;
    public JourneySubmitTrigger withConfiguration(JourneySubmitTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    @JsonProperty("type")
    public JourneySubmitTriggerTypeEnum type;
    public JourneySubmitTrigger withType(JourneySubmitTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}
