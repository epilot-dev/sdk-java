package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneySubmitTriggerConfiguration {
    @JsonProperty("source_id")
    public String sourceId;
    public JourneySubmitTriggerConfiguration withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
}
