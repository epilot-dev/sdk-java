package dev.epilot.sdk.models.operations;



public class GetExecutionsRequest {
    public GetExecutionsQueryParams queryParams;
    public GetExecutionsRequest withQueryParams(GetExecutionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
