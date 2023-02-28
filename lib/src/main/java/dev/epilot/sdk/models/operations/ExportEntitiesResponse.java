package dev.epilot.sdk.models.operations;



public class ExportEntitiesResponse {
    public String contentType;
    public ExportEntitiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ExportEntitiesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
