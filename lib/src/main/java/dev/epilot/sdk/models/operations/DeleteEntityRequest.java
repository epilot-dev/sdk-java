package dev.epilot.sdk.models.operations;


public class DeleteEntityRequest {
    public DeleteEntityPathParams pathParams;
    public DeleteEntityRequest withPathParams(DeleteEntityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteEntityQueryParams queryParams;
    public DeleteEntityRequest withQueryParams(DeleteEntityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}