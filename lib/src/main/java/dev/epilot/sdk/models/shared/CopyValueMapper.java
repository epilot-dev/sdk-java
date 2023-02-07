package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class CopyValueMapper {
    @JsonProperty("mode")
    public MappingAttributeModeEnum mode;
    public CopyValueMapper withMode(MappingAttributeModeEnum mode) {
        this.mode = mode;
        return this;
    }
    @JsonProperty("source")
    public String source;
    public CopyValueMapper withSource(String source) {
        this.source = source;
        return this;
    }
    @JsonProperty("target")
    public String target;
    public CopyValueMapper withTarget(String target) {
        this.target = target;
        return this;
    }
}