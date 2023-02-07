package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SavedViewItem
 * A saved entity view
**/public class SavedViewItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    public String createdAt;
    public SavedViewItem withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("created_by")
    public Object createdBy;
    public SavedViewItem withCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SavedViewItem withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public SavedViewItem withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("org")
    public String org;
    public SavedViewItem withOrg(String org) {
        this.org = org;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared")
    public Boolean shared;
    public SavedViewItem withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }
    @JsonProperty("slug")
    public String[] slug;
    public SavedViewItem withSlug(String[] slug) {
        this.slug = slug;
        return this;
    }
    @JsonProperty("ui_config")
    public java.util.Map<String, Object> uiConfig;
    public SavedViewItem withUiConfig(java.util.Map<String, Object> uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;
    public SavedViewItem withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}