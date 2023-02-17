package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddressRelationAttribute
 * Reference to an address attribute of another entity
**/
public class AddressRelationAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public AddressRelationAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public AddressRelationAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public AddressRelationAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public AddressRelationAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public AddressRelationAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public AddressRelationAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public AddressRelationAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_primary")
    public Boolean hasPrimary;
    public AddressRelationAttribute withHasPrimary(Boolean hasPrimary) {
        this.hasPrimary = hasPrimary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public AddressRelationAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public AddressRelationAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public AddressRelationAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonProperty("label")
    public String label;
    public AddressRelationAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public AddressRelationAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public AddressRelationAttribute withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public AddressRelationAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public AddressRelationAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public AddressRelationAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public AddressRelationAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public AddressRelationAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public AddressRelationAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public AddressRelationAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public AddressRelationAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public AddressRelationAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AddressRelationAttributeTypeEnum type;
    public AddressRelationAttribute withType(AddressRelationAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public AddressRelationAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
    
}
