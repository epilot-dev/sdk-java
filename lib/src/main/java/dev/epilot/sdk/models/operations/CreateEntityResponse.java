package dev.epilot.sdk.models.operations;

import java.time.OffsetDateTime;

public class CreateEntityResponse {
    public String contentType;
    public CreateEntityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public java.util.Map<String, Object> entityItem;
    public CreateEntityResponse withEntityItem(java.util.Map<String, Object> entityItem) {
        this.entityItem = entityItem;
        return this;
    }
    public Long statusCode;
    public CreateEntityResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
