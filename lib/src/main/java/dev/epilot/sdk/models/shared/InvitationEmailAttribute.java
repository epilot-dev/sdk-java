package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvitationEmailAttribute
 * Email address for send invitation
**/
public class InvitationEmailAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public InvitationEmailAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public InvitationEmailAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public InvitationEmailAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public InvitationEmailAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public InvitationEmailAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public InvitationEmailAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public InvitationEmailAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public InvitationEmailAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public InvitationEmailAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public InvitationEmailAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonProperty("label")
    public String label;
    public InvitationEmailAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public InvitationEmailAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public InvitationEmailAttribute withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public InvitationEmailAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public InvitationEmailAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public InvitationEmailAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public InvitationEmailAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public InvitationEmailAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public InvitationEmailAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public InvitationEmailAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public InvitationEmailAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public InvitationEmailAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public InvitationEmailAttributeTypeEnum type;
    public InvitationEmailAttribute withType(InvitationEmailAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public InvitationEmailAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
    
}
