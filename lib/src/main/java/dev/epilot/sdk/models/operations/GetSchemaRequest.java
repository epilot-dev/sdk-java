package dev.epilot.sdk.models.operations;



public class GetSchemaRequest {
    public GetSchemaPathParams pathParams;
    public GetSchemaRequest withPathParams(GetSchemaPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetSchemaQueryParams queryParams;
    public GetSchemaRequest withQueryParams(GetSchemaQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
