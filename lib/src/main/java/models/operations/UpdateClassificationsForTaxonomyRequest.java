package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpdateClassificationsForTaxonomyRequest {
    public UpdateClassificationsForTaxonomyPathParams pathParams;
    public UpdateClassificationsForTaxonomyRequest withPathParams(UpdateClassificationsForTaxonomyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.ClassificationsUpdate request;
    public UpdateClassificationsForTaxonomyRequest withRequest(.models.shared.ClassificationsUpdate request) {
        this.request = request;
        return this;
    }
}