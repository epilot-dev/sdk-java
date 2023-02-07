package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetTaxonomyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taxonomySlug")
    public String taxonomySlug;
    public GetTaxonomyPathParams withTaxonomySlug(String taxonomySlug) {
        this.taxonomySlug = taxonomySlug;
        return this;
    }
}