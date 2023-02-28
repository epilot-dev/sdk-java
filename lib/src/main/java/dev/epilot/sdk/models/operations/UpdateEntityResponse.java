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
    
    public Integer statusCode;
    public UpdateEntityResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
