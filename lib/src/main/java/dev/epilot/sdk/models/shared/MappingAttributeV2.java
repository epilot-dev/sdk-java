package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class MappingAttributeV2 {
    @JsonProperty("operation")
    public Object operation;
    public MappingAttributeV2 withOperation(Object operation) {
        this.operation = operation;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    public String target;
    public MappingAttributeV2 withTarget(String target) {
        this.target = target;
        return this;
    }
}