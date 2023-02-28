package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class RetriggerActionRequest {
    public RetriggerActionPathParams pathParams;
    public RetriggerActionRequest withPathParams(RetriggerActionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.RetryReq request;
    public RetriggerActionRequest withRequest(dev.epilot.sdk.models.shared.RetryReq request) {
        this.request = request;
        return this;
    }
    
}
