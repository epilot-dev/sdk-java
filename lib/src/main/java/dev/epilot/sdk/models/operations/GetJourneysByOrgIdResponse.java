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
    public Long statusCode;
    public GetJourneysByOrgIdResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}