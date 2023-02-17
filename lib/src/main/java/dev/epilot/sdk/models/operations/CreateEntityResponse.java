package dev.epilot.sdk.models.operations;



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
    
    public Integer statusCode;
    public CreateEntityResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
