package dev.epilot.sdk.models.operations;



public class ImportEntitiesResponse {
    public String contentType;
    public ImportEntitiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ImportEntitiesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
