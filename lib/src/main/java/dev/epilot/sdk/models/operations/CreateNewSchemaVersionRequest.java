package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
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
    public dev.epilot.sdk.models.shared.EntitySchema request;
    public CreateNewSchemaVersionRequest withRequest(dev.epilot.sdk.models.shared.EntitySchema request) {
        this.request = request;
        return this;
    }
}