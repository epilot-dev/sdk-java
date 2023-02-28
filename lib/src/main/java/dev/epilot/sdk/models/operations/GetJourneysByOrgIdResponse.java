package dev.epilot.sdk.models.operations;



public class GetJourneysByOrgIdResponse {
    public String contentType;
    public GetJourneysByOrgIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public java.util.Map<String, Object> getJourneysResponse;
    public GetJourneysByOrgIdResponse withGetJourneysResponse(java.util.Map<String, Object> getJourneysResponse) {
        this.getJourneysResponse = getJourneysResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetJourneysByOrgIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
