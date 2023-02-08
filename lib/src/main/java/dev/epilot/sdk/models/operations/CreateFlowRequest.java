package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class CreateFlowRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.AutomationFlow request;
    public CreateFlowRequest withRequest(dev.epilot.sdk.models.shared.AutomationFlow request) {
        this.request = request;
        return this;
    }
}
