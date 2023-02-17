package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class SearchJourneysRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.SearchJourneysQueryRequest request;
    public SearchJourneysRequest withRequest(dev.epilot.sdk.models.shared.SearchJourneysQueryRequest request) {
        this.request = request;
        return this;
    }
    
}
