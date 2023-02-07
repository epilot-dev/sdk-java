package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class UpdateRelationRequest {
    public UpdateRelationPathParams pathParams;
    public UpdateRelationRequest withPathParams(UpdateRelationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public UpdateRelationQueryParams queryParams;
    public UpdateRelationRequest withQueryParams(UpdateRelationQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public UpdateRelationRequestBody request;
    public UpdateRelationRequest withRequest(UpdateRelationRequestBody request) {
        this.request = request;
        return this;
    }
}