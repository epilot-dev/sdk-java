package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntitySchemaGroupSettings {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public EntitySchemaGroupSettings withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expanded")
    public Boolean expanded;
    public EntitySchemaGroupSettings withExpanded(Boolean expanded) {
        this.expanded = expanded;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public EntitySchemaGroupSettings withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public EntitySchemaGroupSettings withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("info_tooltip_title")
    public EntitySchemaGroupSettingsInfoTooltipTitle infoTooltipTitle;
    public EntitySchemaGroupSettings withInfoTooltipTitle(EntitySchemaGroupSettingsInfoTooltipTitle infoTooltipTitle) {
        this.infoTooltipTitle = infoTooltipTitle;
        return this;
    }
    @JsonProperty("label")
    public String label;
    public EntitySchemaGroupSettings withLabel(String label) {
        this.label = label;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public EntitySchemaGroupSettings withOrder(Long order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public EntitySchemaGroupSettings withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public EntitySchemaGroupSettings withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
}