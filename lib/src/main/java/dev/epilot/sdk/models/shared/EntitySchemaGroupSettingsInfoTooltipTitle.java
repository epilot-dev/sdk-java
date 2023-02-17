package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySchemaGroupSettingsInfoTooltipTitle {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    public String default_;
    public EntitySchemaGroupSettingsInfoTooltipTitle withDefault(String default_) {
        this.default_ = default_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public EntitySchemaGroupSettingsInfoTooltipTitle withKey(String key) {
        this.key = key;
        return this;
    }
    
}
