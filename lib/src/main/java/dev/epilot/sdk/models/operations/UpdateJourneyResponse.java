package dev.epilot.sdk.models.operations;



public class UpdateJourneyResponse {
    public String contentType;
    public UpdateJourneyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public java.util.Map<String, Object> journeyResponse;
    public UpdateJourneyResponse withJourneyResponse(java.util.Map<String, Object> journeyResponse) {
        this.journeyResponse = journeyResponse;
        return this;
    }
    
    public Integer statusCode;
    public UpdateJourneyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
