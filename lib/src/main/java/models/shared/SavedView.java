package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SavedView
 * A saved entity view
**/public class SavedView {
    @JsonProperty("created_by")
    public Object createdBy;
    public SavedView withCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public SavedView withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("org")
    public String org;
    public SavedView withOrg(String org) {
        this.org = org;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared")
    public Boolean shared;
    public SavedView withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }
    @JsonProperty("slug")
    public String[] slug;
    public SavedView withSlug(String[] slug) {
        this.slug = slug;
        return this;
    }
    @JsonProperty("ui_config")
    public java.util.Map<String, Object> uiConfig;
    public SavedView withUiConfig(java.util.Map<String, Object> uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }
}