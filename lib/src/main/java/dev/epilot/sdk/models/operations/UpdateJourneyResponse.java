package dev.epilot.sdk.models.operations;

import java.time.OffsetDateTime;

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
    public Long statusCode;
    public UpdateJourneyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
