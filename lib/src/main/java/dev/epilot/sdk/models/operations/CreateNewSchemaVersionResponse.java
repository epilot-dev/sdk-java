package dev.epilot.sdk.models.operations;


public class CreateNewSchemaVersionResponse {
    public String contentType;
    public CreateNewSchemaVersionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.epilot.sdk.models.shared.EntitySchemaItem entitySchemaItem;
    public CreateNewSchemaVersionResponse withEntitySchemaItem(dev.epilot.sdk.models.shared.EntitySchemaItem entitySchemaItem) {
        this.entitySchemaItem = entitySchemaItem;
        return this;
    }
    public Long statusCode;
    public CreateNewSchemaVersionResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}