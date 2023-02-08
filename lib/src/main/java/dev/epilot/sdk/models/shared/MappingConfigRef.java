package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MappingConfigRef {
    @JsonProperty("config_id")
    public String configId;
    public MappingConfigRef withConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    @JsonProperty("target_id")
    public String targetId;
    public MappingConfigRef withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public Double version;
    public MappingConfigRef withVersion(Double version) {
        this.version = version;
        return this;
    }
}
