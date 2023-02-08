package dev.epilot.sdk.models.operations;



public class DeleteRelationRequest {
    public DeleteRelationPathParams pathParams;
    public DeleteRelationRequest withPathParams(DeleteRelationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteRelationQueryParams queryParams;
    public DeleteRelationRequest withQueryParams(DeleteRelationQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
