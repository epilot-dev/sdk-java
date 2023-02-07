package dev.epilot.sdk.models.operations;


public class ImportEntitiesResponse {
    public String contentType;
    public ImportEntitiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ImportEntitiesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}