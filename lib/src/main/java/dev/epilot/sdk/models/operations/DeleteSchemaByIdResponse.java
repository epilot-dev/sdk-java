package dev.epilot.sdk.models.operations;



public class DeleteSchemaByIdResponse {
    public String contentType;
    public DeleteSchemaByIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteSchemaByIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
