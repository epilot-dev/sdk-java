package dev.epilot.sdk.models.operations;

import java.time.OffsetDateTime;

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
    public Long statusCode;
    public GetJourneyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
