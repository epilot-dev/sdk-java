package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class TaxonomiesClassificationsSearchRequest {
    public TaxonomiesClassificationsSearchQueryParams queryParams;
    public TaxonomiesClassificationsSearchRequest withQueryParams(TaxonomiesClassificationsSearchQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public TaxonomiesClassificationsSearchRequestBody request;
    public TaxonomiesClassificationsSearchRequest withRequest(TaxonomiesClassificationsSearchRequestBody request) {
        this.request = request;
        return this;
    }
}