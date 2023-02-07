package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityDefaultTableNavbarActionsOptions {
    @JsonProperty("label")
    public String label;
    public EntityDefaultTableNavbarActionsOptions withLabel(String label) {
        this.label = label;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("params")
    public java.util.Map<String, Object> params;
    public EntityDefaultTableNavbarActionsOptions withParams(java.util.Map<String, Object> params) {
        this.params = params;
        return this;
    }
}