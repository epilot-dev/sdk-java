package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateFlowRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.AutomationFlow request;
    public CreateFlowRequest withRequest(.models.shared.AutomationFlow request) {
        this.request = request;
        return this;
    }
}