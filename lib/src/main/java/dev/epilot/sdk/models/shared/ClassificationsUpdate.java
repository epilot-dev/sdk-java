package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ClassificationsUpdate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create")
    public TaxonomyClassification[] create;
    public ClassificationsUpdate withCreate(TaxonomyClassification[] create) {
        this.create = create;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delete")
    public String[] delete;
    public ClassificationsUpdate withDelete(String[] delete) {
        this.delete = delete;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update")
    public TaxonomyClassification[] update;
    public ClassificationsUpdate withUpdate(TaxonomyClassification[] update) {
        this.update = update;
        return this;
    }
}