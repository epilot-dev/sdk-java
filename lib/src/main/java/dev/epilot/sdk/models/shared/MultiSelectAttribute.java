package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultiSelectAttribute
 * Multi Choice Selection
**/
public class MultiSelectAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public MultiSelectAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_any")
    public Boolean allowAny;
    public MultiSelectAttribute withAllowAny(Boolean allowAny) {
        this.allowAny = allowAny;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_extra_options")
    public Boolean allowExtraOptions;
    public MultiSelectAttribute withAllowExtraOptions(Boolean allowExtraOptions) {
        this.allowExtraOptions = allowExtraOptions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public MultiSelectAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public MultiSelectAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public MultiSelectAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disable_case_sensitive")
    public Boolean disableCaseSensitive;
    public MultiSelectAttribute withDisableCaseSensitive(Boolean disableCaseSensitive) {
        this.disableCaseSensitive = disableCaseSensitive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public MultiSelectAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public MultiSelectAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public MultiSelectAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public MultiSelectAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public MultiSelectAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public MultiSelectAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonProperty("label")
    public String label;
    public MultiSelectAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public MultiSelectAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public MultiSelectAttribute withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public Object[] options;
    public MultiSelectAttribute withOptions(Object[] options) {
        this.options = options;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public MultiSelectAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public MultiSelectAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public MultiSelectAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public MultiSelectAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public MultiSelectAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public MultiSelectAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public MultiSelectAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public MultiSelectAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public MultiSelectAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public MultiSelectAttributeTypeEnum type;
    public MultiSelectAttribute withType(MultiSelectAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public MultiSelectAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
    
}
