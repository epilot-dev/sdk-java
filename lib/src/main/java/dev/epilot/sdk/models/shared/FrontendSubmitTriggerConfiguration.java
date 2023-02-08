package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FrontendSubmitTriggerConfiguration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_id")
    public String sourceId;
    public FrontendSubmitTriggerConfiguration withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
}
