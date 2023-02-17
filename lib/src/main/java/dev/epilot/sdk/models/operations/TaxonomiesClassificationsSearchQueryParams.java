package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class TaxonomiesClassificationsSearchQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=taxonomySlug")
    public String taxonomySlug;
    public TaxonomiesClassificationsSearchQueryParams withTaxonomySlug(String taxonomySlug) {
        this.taxonomySlug = taxonomySlug;
        return this;
    }
    
}
