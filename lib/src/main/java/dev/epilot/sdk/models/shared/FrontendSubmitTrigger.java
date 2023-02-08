package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FrontendSubmitTrigger {
    @JsonProperty("configuration")
    public FrontendSubmitTriggerConfiguration configuration;
    public FrontendSubmitTrigger withConfiguration(FrontendSubmitTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    @JsonProperty("type")
    public FrontendSubmitTriggerTypeEnum type;
    public FrontendSubmitTrigger withType(FrontendSubmitTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}
