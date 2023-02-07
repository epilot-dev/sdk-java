package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateJourneyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public CreateJourneyRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
}