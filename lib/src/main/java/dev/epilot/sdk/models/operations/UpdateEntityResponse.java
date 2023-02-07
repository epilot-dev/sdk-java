package dev.epilot.sdk.models.operations;


public class UpdateEntityResponse {
    public String contentType;
    public UpdateEntityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, Object> entityItem;
    public UpdateEntityResponse withEntityItem(java.util.Map<String, Object> entityItem) {
        this.entityItem = entityItem;
        return this;
    }
    public Long statusCode;
    public UpdateEntityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}