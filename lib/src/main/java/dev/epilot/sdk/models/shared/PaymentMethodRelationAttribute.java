package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaymentMethodRelationAttribute
 * Reference to a payment method attribute of another entity
**/
public class PaymentMethodRelationAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public PaymentMethodRelationAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public PaymentMethodRelationAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public PaymentMethodRelationAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public PaymentMethodRelationAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public PaymentMethodRelationAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public PaymentMethodRelationAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public PaymentMethodRelationAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_primary")
    public Boolean hasPrimary;
    public PaymentMethodRelationAttribute withHasPrimary(Boolean hasPrimary) {
        this.hasPrimary = hasPrimary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public PaymentMethodRelationAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public PaymentMethodRelationAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public PaymentMethodRelationAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonProperty("label")
    public String label;
    public PaymentMethodRelationAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public PaymentMethodRelationAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public PaymentMethodRelationAttribute withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public PaymentMethodRelationAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public PaymentMethodRelationAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public PaymentMethodRelationAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public PaymentMethodRelationAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public PaymentMethodRelationAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public PaymentMethodRelationAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public PaymentMethodRelationAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public PaymentMethodRelationAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public PaymentMethodRelationAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PaymentMethodRelationAttributeTypeEnum type;
    public PaymentMethodRelationAttribute withType(PaymentMethodRelationAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public PaymentMethodRelationAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
    
}
