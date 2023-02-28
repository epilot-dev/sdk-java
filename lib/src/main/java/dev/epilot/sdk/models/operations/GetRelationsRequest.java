package dev.epilot.sdk.models.operations;



public class GetRelationsRequest {
    public GetRelationsPathParams pathParams;
    public GetRelationsRequest withPathParams(GetRelationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetRelationsQueryParams queryParams;
    public GetRelationsRequest withQueryParams(GetRelationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
