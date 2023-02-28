package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetValueMapper {
    @JsonProperty("mode")
    public MappingAttributeModeEnum mode;
    public SetValueMapper withMode(MappingAttributeModeEnum mode) {
        this.mode = mode;
        return this;
    }
    
    @JsonProperty("target")
    public String target;
    public SetValueMapper withTarget(String target) {
        this.target = target;
        return this;
    }
    
    @JsonProperty("value")
    public Object value;
    public SetValueMapper withValue(Object value) {
        this.value = value;
        return this;
    }
    
}
