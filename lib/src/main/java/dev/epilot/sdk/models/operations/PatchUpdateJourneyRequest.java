package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class PatchUpdateJourneyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public PatchUpdateJourneyRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
}
