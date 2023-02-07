package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EntitySchema
 * The "type" of an Entity. Describes the shape. Includes Entity Attributes, Relations and Capabilities.
**/public class EntitySchema {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes")
    public Object[] attributes;
    public EntitySchema withAttributes(Object[] attributes) {
        this.attributes = attributes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("blueprint")
    public String blueprint;
    public EntitySchema withBlueprint(String blueprint) {
        this.blueprint = blueprint;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("capabilities")
    public EntityCapability[] capabilities;
    public EntitySchema withCapabilities(EntityCapability[] capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dialog_config")
    public java.util.Map<String, Object> dialogConfig;
    public EntitySchema withDialogConfig(java.util.Map<String, Object> dialogConfig) {
        this.dialogConfig = dialogConfig;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("draft")
    public Boolean draft;
    public EntitySchema withDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_setting")
    public String[] enableSetting;
    public EntitySchema withEnableSetting(String[] enableSetting) {
        this.enableSetting = enableSetting;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("explicit_search_mappings")
    public java.util.Map<String, SearchMappings> explicitSearchMappings;
    public EntitySchema withExplicitSearchMappings(java.util.Map<String, SearchMappings> explicitSearchMappings) {
        this.explicitSearchMappings = explicitSearchMappings;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feature_flag")
    public String featureFlag;
    public EntitySchema withFeatureFlag(String featureFlag) {
        this.featureFlag = featureFlag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group_settings")
    public EntitySchemaGroupSettings[] groupSettings;
    public EntitySchema withGroupSettings(EntitySchemaGroupSettings[] groupSettings) {
        this.groupSettings = groupSettings;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;
    public EntitySchema withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layout_settings")
    public java.util.Map<String, Object> layoutSettings;
    public EntitySchema withLayoutSettings(java.util.Map<String, Object> layoutSettings) {
        this.layoutSettings = layoutSettings;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public EntitySchema withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("plural")
    public String plural;
    public EntitySchema withPlural(String plural) {
        this.plural = plural;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published")
    public Boolean published;
    public EntitySchema withPublished(Boolean published) {
        this.published = published;
        return this;
    }
    @JsonProperty("slug")
    public String slug;
    public EntitySchema withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title_template")
    public String titleTemplate;
    public EntitySchema withTitleTemplate(String titleTemplate) {
        this.titleTemplate = titleTemplate;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ui_config")
    public EntitySchemaUiConfig uiConfig;
    public EntitySchema withUiConfig(EntitySchemaUiConfig uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public Long version;
    public EntitySchema withVersion(Long version) {
        this.version = version;
        return this;
    }
}