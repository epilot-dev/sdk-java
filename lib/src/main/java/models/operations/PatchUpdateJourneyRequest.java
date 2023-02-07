package .models.operations;

import .utils.SpeakeasyMetadata;
public class PatchUpdateJourneyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public PatchUpdateJourneyRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
}