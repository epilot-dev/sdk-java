package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class UpdateJourneyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public UpdateJourneyRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
}
