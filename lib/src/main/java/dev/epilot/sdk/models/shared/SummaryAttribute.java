package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SummaryAttribute
 * Represents an expanded version of an attribute to be displayed in the list item summary.
 * This configuration can be used in the following way:
 * ```js
 * {
 *   "label": "Price components"
 *   "value": "{{item.prices.length}} price components"
 *   "show_as_tag": true
 *   "render_condition": "is_composite_price = "true""
 * }
 * ```
 * The value field supports handlebar expressions from which you can pick any field from the entity state.
 * 
**/public class SummaryAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public SummaryAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonProperty("label")
    public String label;
    public SummaryAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public SummaryAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public SummaryAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_as_tag")
    public Boolean showAsTag;
    public SummaryAttribute withShowAsTag(Boolean showAsTag) {
        this.showAsTag = showAsTag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag_color")
    public String tagColor;
    public SummaryAttribute withTagColor(String tagColor) {
        this.tagColor = tagColor;
        return this;
    }
    @JsonProperty("value")
    public String value;
    public SummaryAttribute withValue(String value) {
        this.value = value;
        return this;
    }
}