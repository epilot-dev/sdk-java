package dev.epilot.sdk.models.operations;

import java.time.OffsetDateTime;

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
    public Long statusCode;
    public PatchUpdateJourneyResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
