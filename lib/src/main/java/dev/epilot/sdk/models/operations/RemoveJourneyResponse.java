package dev.epilot.sdk.models.operations;



public class RemoveJourneyResponse {
    public String contentType;
    public RemoveJourneyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public RemoveJourneyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
