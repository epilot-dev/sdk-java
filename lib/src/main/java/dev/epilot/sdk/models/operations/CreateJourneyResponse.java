package dev.epilot.sdk.models.operations;



public class CreateJourneyResponse {
    public String contentType;
    public CreateJourneyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public java.util.Map<String, Object> journeyResponse;
    public CreateJourneyResponse withJourneyResponse(java.util.Map<String, Object> journeyResponse) {
        this.journeyResponse = journeyResponse;
        return this;
    }
    
    public Integer statusCode;
    public CreateJourneyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
