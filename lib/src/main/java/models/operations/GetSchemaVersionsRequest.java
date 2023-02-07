package .models.operations;


public class GetSchemaVersionsRequest {
    public GetSchemaVersionsPathParams pathParams;
    public GetSchemaVersionsRequest withPathParams(GetSchemaVersionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}