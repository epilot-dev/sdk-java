package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class AppendValueMapper {
    @JsonProperty("mode")
    public MappingAttributeModeEnum mode;
    public AppendValueMapper withMode(MappingAttributeModeEnum mode) {
        this.mode = mode;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    public String source;
    public AppendValueMapper withSource(String source) {
        this.source = source;
        return this;
    }
    @JsonProperty("target")
    public String target;
    public AppendValueMapper withTarget(String target) {
        this.target = target;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_unique")
    public String[] targetUnique;
    public AppendValueMapper withTargetUnique(String[] targetUnique) {
        this.targetUnique = targetUnique;
        return this;
    }
    @JsonProperty("value_json")
    public String valueJson;
    public AppendValueMapper withValueJson(String valueJson) {
        this.valueJson = valueJson;
        return this;
    }
}