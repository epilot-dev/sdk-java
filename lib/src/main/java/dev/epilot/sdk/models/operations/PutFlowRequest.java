package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class PutFlowRequest {
    public PutFlowPathParams pathParams;
    public PutFlowRequest withPathParams(PutFlowPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.AutomationFlow request;
    public PutFlowRequest withRequest(dev.epilot.sdk.models.shared.AutomationFlow request) {
        this.request = request;
        return this;
    }
    
}
