package dev.epilot.sdk.models.operations;


public class ExportEntitiesResponse {
    public String contentType;
    public ExportEntitiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ExportEntitiesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}