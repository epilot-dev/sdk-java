package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RelationAttribute
 * Entity Relationship
**/public class RelationAttribute {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_purpose")
    public String[] purpose;
    public RelationAttribute withPurpose(String[] purpose) {
        this.purpose = purpose;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actions")
    public RelationAttributeActions[] actions;
    public RelationAttribute withActions(RelationAttributeActions[] actions) {
        this.actions = actions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("add_button_label")
    public String addButtonLabel;
    public RelationAttribute withAddButtonLabel(String addButtonLabel) {
        this.addButtonLabel = addButtonLabel;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowedSchemas")
    public String[] allowedSchemas;
    public RelationAttribute withAllowedSchemas(String[] allowedSchemas) {
        this.allowedSchemas = allowedSchemas;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("constraints")
    public java.util.Map<String, Object> constraints;
    public RelationAttribute withConstraints(java.util.Map<String, Object> constraints) {
        this.constraints = constraints;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    public Object defaultValue;
    public RelationAttribute withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public Boolean deprecated;
    public RelationAttribute withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details_view_mode_enabled")
    public Boolean detailsViewModeEnabled;
    public RelationAttribute withDetailsViewModeEnabled(Boolean detailsViewModeEnabled) {
        this.detailsViewModeEnabled = detailsViewModeEnabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("drawer_size")
    public RelationAttributeDrawerSizeEnum drawerSize;
    public RelationAttribute withDrawerSize(RelationAttributeDrawerSizeEnum drawerSize) {
        this.drawerSize = drawerSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("edit_mode")
    public RelationAttributeEditModeEnum editMode;
    public RelationAttribute withEditMode(RelationAttributeEditModeEnum editMode) {
        this.editMode = editMode;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_relation_picker")
    public Boolean enableRelationPicker;
    public RelationAttribute withEnableRelationPicker(Boolean enableRelationPicker) {
        this.enableRelationPicker = enableRelationPicker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_relation_tags")
    public Boolean enableRelationTags;
    public RelationAttribute withEnableRelationTags(Boolean enableRelationTags) {
        this.enableRelationTags = enableRelationTags;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_builder_disable_edit")
    public Boolean entityBuilderDisableEdit;
    public RelationAttribute withEntityBuilderDisableEdit(Boolean entityBuilderDisableEdit) {
        this.entityBuilderDisableEdit = entityBuilderDisableEdit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public RelationAttribute withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public String group;
    public RelationAttribute withGroup(String group) {
        this.group = group;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_primary")
    public Boolean hasPrimary;
    public RelationAttribute withHasPrimary(Boolean hasPrimary) {
        this.hasPrimary = hasPrimary;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public RelationAttribute withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_label")
    public Boolean hideLabel;
    public RelationAttribute withHideLabel(Boolean hideLabel) {
        this.hideLabel = hideLabel;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public RelationAttribute withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    @JsonProperty("label")
    public String label;
    public RelationAttribute withLabel(String label) {
        this.label = label;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout")
    public String layout;
    public RelationAttribute withLayout(String layout) {
        this.layout = layout;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public RelationAttribute withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;
    public RelationAttribute withOrder(Long order) {
        this.order = order;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    public String placeholder;
    public RelationAttribute withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preview_value_formatter")
    public String previewValueFormatter;
    public RelationAttribute withPreviewValueFormatter(String previewValueFormatter) {
        this.previewValueFormatter = previewValueFormatter;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protected")
    public Boolean protected_;
    public RelationAttribute withProtected(Boolean protected_) {
        this.protected_ = protected_;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("readonly")
    public Boolean readonly;
    public RelationAttribute withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation_affinity_mode")
    public RelationAttributeRelationAffinityModeEnum relationAffinityMode;
    public RelationAttribute withRelationAffinityMode(RelationAttributeRelationAffinityModeEnum relationAffinityMode) {
        this.relationAffinityMode = relationAffinityMode;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation_type")
    public RelationAttributeRelationTypeEnum relationType;
    public RelationAttribute withRelationType(RelationAttributeRelationTypeEnum relationType) {
        this.relationType = relationType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("render_condition")
    public String renderCondition;
    public RelationAttribute withRenderCondition(String renderCondition) {
        this.renderCondition = renderCondition;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    public Boolean required;
    public RelationAttribute withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reverse_attributes")
    public java.util.Map<String, String> reverseAttributes;
    public RelationAttribute withReverseAttributes(java.util.Map<String, String> reverseAttributes) {
        this.reverseAttributes = reverseAttributes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_placeholder")
    public String searchPlaceholder;
    public RelationAttribute withSearchPlaceholder(String searchPlaceholder) {
        this.searchPlaceholder = searchPlaceholder;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("setting_flag")
    public String settingFlag;
    public RelationAttribute withSettingFlag(String settingFlag) {
        this.settingFlag = settingFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("show_in_table")
    public Boolean showInTable;
    public RelationAttribute withShowInTable(Boolean showInTable) {
        this.showInTable = showInTable;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary_fields")
    public Object[] summaryFields;
    public RelationAttribute withSummaryFields(Object[] summaryFields) {
        this.summaryFields = summaryFields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public RelationAttributeTypeEnum type;
    public RelationAttribute withType(RelationAttributeTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_formatter")
    public String valueFormatter;
    public RelationAttribute withValueFormatter(String valueFormatter) {
        this.valueFormatter = valueFormatter;
        return this;
    }
}