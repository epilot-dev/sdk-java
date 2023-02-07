package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EntitySchemaItem
 * The "type" of an Entity. Describes the shape. Includes Entity Attributes, Relations and Capabilities.
**/public class EntitySchemaItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes")
    public Object[] attributes;
    public EntitySchemaItem withAttributes(Object[] attributes) {
        this.attributes = attributes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("blueprint")
    public String blueprint;
    public EntitySchemaItem withBlueprint(String blueprint) {
        this.blueprint = blueprint;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("capabilities")
    public EntityCapability[] capabilities;
    public EntitySchemaItem withCapabilities(EntityCapability[] capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("comment")
    public String comment;
    public EntitySchemaItem withComment(String comment) {
        this.comment = comment;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    public String createdAt;
    public EntitySchemaItem withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dialog_config")
    public java.util.Map<String, Object> dialogConfig;
    public EntitySchemaItem withDialogConfig(java.util.Map<String, Object> dialogConfig) {
        this.dialogConfig = dialogConfig;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("draft")
    public Boolean draft;
    public EntitySchemaItem withDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_setting")
    public String[] enableSetting;
    public EntitySchemaItem withEnableSetting(String[] enableSetting) {
        this.enableSetting = enableSetting;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("explicit_search_mappings")
    public java.util.Map<String, SearchMappings> explicitSearchMappings;
    public EntitySchemaItem withExplicitSearchMappings(java.util.Map<String, SearchMappings> explicitSearchMappings) {
        this.explicitSearchMappings = explicitSearchMappings;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public EntitySchemaItem withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group_settings")
    public EntitySchemaItemGroupSettings[] groupSettings;
    public EntitySchemaItem withGroupSettings(EntitySchemaItemGroupSettings[] groupSettings) {
        this.groupSettings = groupSettings;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public EntitySchemaItem withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public EntitySchemaItem withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout_settings")
    public java.util.Map<String, Object> layoutSettings;
    public EntitySchemaItem withLayoutSettings(java.util.Map<String, Object> layoutSettings) {
        this.layoutSettings = layoutSettings;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public EntitySchemaItem withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("plural")
    public String plural;
    public EntitySchemaItem withPlural(String plural) {
        this.plural = plural;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published")
    public Boolean published;
    public EntitySchemaItem withPublished(Boolean published) {
        this.published = published;
        return this;
    }
    @JsonProperty("slug")
    public String slug;
    public EntitySchemaItem withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    public EntitySchemaItemSource source;
    public EntitySchemaItem withSource(EntitySchemaItemSource source) {
        this.source = source;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title_template")
    public String titleTemplate;
    public EntitySchemaItem withTitleTemplate(String titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ui_config")
    public EntitySchemaItemUiConfig uiConfig;
    public EntitySchemaItem withUiConfig(EntitySchemaItemUiConfig uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;
    public EntitySchemaItem withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public Long version;
    public EntitySchemaItem withVersion(Long version) {
        this.version = version;
        return this;
    }
}