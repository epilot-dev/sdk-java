package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TextAttribute
 * Textarea or text input
**/
public class TextAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public TextAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public TextAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public TextAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public TextAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public TextAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public TextAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public TextAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public TextAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public TextAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public TextAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonProperty("label")
    public String label;
    public TextAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public TextAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("multiline")
    public Boolean multiline;
    public TextAttribute withMultiline(Boolean multiline) {
        this.multiline = multiline;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public TextAttribute withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public TextAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public TextAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public TextAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public TextAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public TextAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public TextAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public TextAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public TextAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public TextAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TextAttributeTypeEnum type;
    public TextAttribute withType(TextAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public TextAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
    
}
