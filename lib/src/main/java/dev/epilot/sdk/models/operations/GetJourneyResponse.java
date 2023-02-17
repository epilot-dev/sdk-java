package dev.epilot.sdk.models.operations;



public class GetJourneyResponse {
    public String contentType;
    public GetJourneyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public java.util.Map<String, Object> journeyResponse;
    public GetJourneyResponse withJourneyResponse(java.util.Map<String, Object> journeyResponse) {
        this.journeyResponse = journeyResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetJourneyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
