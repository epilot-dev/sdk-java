package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class CreateEntityRequest {
    public CreateEntityPathParams pathParams;
    public CreateEntityRequest withPathParams(CreateEntityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CreateEntityQueryParams queryParams;
    public CreateEntityRequest withQueryParams(CreateEntityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public CreateEntityRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
