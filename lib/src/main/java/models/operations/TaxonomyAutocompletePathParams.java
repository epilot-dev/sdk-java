package .models.operations;

import .utils.SpeakeasyMetadata;
public class TaxonomyAutocompletePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taxonomySlug")
    public String taxonomySlug;
    public TaxonomyAutocompletePathParams withTaxonomySlug(String taxonomySlug) {
        this.taxonomySlug = taxonomySlug;
        return this;
    }
}