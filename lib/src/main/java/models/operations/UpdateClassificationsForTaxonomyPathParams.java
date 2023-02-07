package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpdateClassificationsForTaxonomyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taxonomySlug")
    public String taxonomySlug;
    public UpdateClassificationsForTaxonomyPathParams withTaxonomySlug(String taxonomySlug) {
        this.taxonomySlug = taxonomySlug;
        return this;
    }
}