package dev.epilot.sdk.models.operations;


public class DeleteRelationResponse {
    public String contentType;
    public DeleteRelationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public DeleteRelationResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}