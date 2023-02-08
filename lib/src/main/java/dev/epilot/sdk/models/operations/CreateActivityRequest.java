package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class CreateActivityRequest {
    public CreateActivityQueryParams queryParams;
    public CreateActivityRequest withQueryParams(CreateActivityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.Activity request;
    public CreateActivityRequest withRequest(dev.epilot.sdk.models.shared.Activity request) {
        this.request = request;
        return this;
    }
}
