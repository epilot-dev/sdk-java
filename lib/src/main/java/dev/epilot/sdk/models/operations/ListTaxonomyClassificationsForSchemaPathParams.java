package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class ListTaxonomyClassificationsForSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public ListTaxonomyClassificationsForSchemaPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taxonomySlug")
    public String taxonomySlug;
    public ListTaxonomyClassificationsForSchemaPathParams withTaxonomySlug(String taxonomySlug) {
        this.taxonomySlug = taxonomySlug;
        return this;
    }
}