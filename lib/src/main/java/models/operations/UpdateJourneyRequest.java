package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpdateJourneyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public UpdateJourneyRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
}