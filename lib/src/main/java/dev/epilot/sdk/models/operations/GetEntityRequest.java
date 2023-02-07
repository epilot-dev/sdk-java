package dev.epilot.sdk.models.operations;


public class GetEntityRequest {
    public GetEntityPathParams pathParams;
    public GetEntityRequest withPathParams(GetEntityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetEntityQueryParams queryParams;
    public GetEntityRequest withQueryParams(GetEntityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}