package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class AddRelationsRequest {
    public AddRelationsPathParams pathParams;
    public AddRelationsRequest withPathParams(AddRelationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public AddRelationsQueryParams queryParams;
    public AddRelationsRequest withQueryParams(AddRelationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.RelationItem[] request;
    public AddRelationsRequest withRequest(dev.epilot.sdk.models.shared.RelationItem[] request) {
        this.request = request;
        return this;
    }
    
}
