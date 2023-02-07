package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ActivityTriggerConfiguration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public ActivityTriggerConfiguration withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("types")
    public ActivityTriggerConfigurationTypesEnum[] types;
    public ActivityTriggerConfiguration withTypes(ActivityTriggerConfigurationTypesEnum[] types) {
        this.types = types;
        return this;
    }
}