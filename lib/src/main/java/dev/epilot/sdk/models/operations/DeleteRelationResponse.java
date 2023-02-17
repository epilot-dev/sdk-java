package dev.epilot.sdk.models.operations;



public class DeleteRelationResponse {
    public String contentType;
    public DeleteRelationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public DeleteRelationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
