package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class SearchEntitiesRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.EntitySearchParams request;
    public SearchEntitiesRequest withRequest(dev.epilot.sdk.models.shared.EntitySearchParams request) {
        this.request = request;
        return this;
    }
    
}
