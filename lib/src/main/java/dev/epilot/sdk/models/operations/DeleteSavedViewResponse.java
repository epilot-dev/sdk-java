package dev.epilot.sdk.models.operations;



public class DeleteSavedViewResponse {
    public String contentType;
    public DeleteSavedViewResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public DeleteSavedViewResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
