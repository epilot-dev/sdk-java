package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EntityCapability
 * Capabilities the Entity has. Turn features on/off for entities.
**/public class EntityCapability {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public EntityCapability withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes")
    public Object[] attributes;
    public EntityCapability withAttributes(Object[] attributes) {
        this.attributes = attributes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public EntityCapability withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legacy")
    public Boolean legacy;
    public EntityCapability withLegacy(Boolean legacy) {
        this.legacy = legacy;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public EntityCapability withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public EntityCapability withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;
    public EntityCapability withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ui_hooks")
    public java.util.Map<String, Object>[] uiHooks;
    public EntityCapability withUiHooks(java.util.Map<String, Object>[] uiHooks) {
        this.uiHooks = uiHooks;
        return this;
    }
}