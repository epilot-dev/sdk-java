package .models.operations;

import .utils.SpeakeasyMetadata;
public class StartExecutionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.StartExecutionRequest request;
    public StartExecutionRequest withRequest(.models.shared.StartExecutionRequest request) {
        this.request = request;
        return this;
    }
}