package dev.epilot.sdk.models.operations;



public class PatchUpdateJourneyResponse {
    public String contentType;
    public PatchUpdateJourneyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public java.util.Map<String, Object> journeyResponse;
    public PatchUpdateJourneyResponse withJourneyResponse(java.util.Map<String, Object> journeyResponse) {
        this.journeyResponse = journeyResponse;
        return this;
    }
    
    public Integer statusCode;
    public PatchUpdateJourneyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
