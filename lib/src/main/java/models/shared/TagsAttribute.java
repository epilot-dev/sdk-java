package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TagsAttribute
 * Tags
**/public class TagsAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public TagsAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public TagsAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public TagsAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public TagsAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public TagsAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public TagsAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public TagsAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public TagsAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public TagsAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public TagsAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    @JsonProperty("label")
    public String label;
    public TagsAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public TagsAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public TagsAttribute withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public String[] options;
    public TagsAttribute withOptions(String[] options) {
        this.options = options;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public TagsAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public TagsAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public TagsAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public TagsAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public TagsAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public TagsAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public TagsAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public TagsAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public TagsAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suggestions")
    public String[] suggestions;
    public TagsAttribute withSuggestions(String[] suggestions) {
        this.suggestions = suggestions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TagsAttributeTypeEnum type;
    public TagsAttribute withType(TagsAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public TagsAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
}