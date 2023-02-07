package dev.epilot.sdk.models.operations;


public class DeleteSchemaByIdRequest {
    public DeleteSchemaByIdPathParams pathParams;
    public DeleteSchemaByIdRequest withPathParams(DeleteSchemaByIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public DeleteSchemaByIdQueryParams queryParams;
    public DeleteSchemaByIdRequest withQueryParams(DeleteSchemaByIdQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}