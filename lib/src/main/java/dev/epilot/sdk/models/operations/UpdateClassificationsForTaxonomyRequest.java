package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class UpdateClassificationsForTaxonomyRequest {
    public UpdateClassificationsForTaxonomyPathParams pathParams;
    public UpdateClassificationsForTaxonomyRequest withPathParams(UpdateClassificationsForTaxonomyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.ClassificationsUpdate request;
    public UpdateClassificationsForTaxonomyRequest withRequest(dev.epilot.sdk.models.shared.ClassificationsUpdate request) {
        this.request = request;
        return this;
    }
    
}
