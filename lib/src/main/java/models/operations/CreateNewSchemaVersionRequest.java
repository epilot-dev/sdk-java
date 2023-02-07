package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateNewSchemaVersionRequest {
    public CreateNewSchemaVersionPathParams pathParams;
    public CreateNewSchemaVersionRequest withPathParams(CreateNewSchemaVersionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public CreateNewSchemaVersionQueryParams queryParams;
    public CreateNewSchemaVersionRequest withQueryParams(CreateNewSchemaVersionQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.EntitySchema request;
    public CreateNewSchemaVersionRequest withRequest(.models.shared.EntitySchema request) {
        this.request = request;
        return this;
    }
}