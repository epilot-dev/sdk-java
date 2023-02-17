package dev.epilot.sdk.models.operations;



public class RetriggerActionResponse {
    public String contentType;
    public RetriggerActionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public RetriggerActionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
