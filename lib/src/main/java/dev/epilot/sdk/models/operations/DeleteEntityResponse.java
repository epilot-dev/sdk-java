package dev.epilot.sdk.models.operations;



public class DeleteEntityResponse {
    public String contentType;
    public DeleteEntityResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public DeleteEntityResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
