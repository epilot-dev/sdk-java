package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class StartExecutionRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.StartExecutionRequest request;
    public StartExecutionRequest withRequest(dev.epilot.sdk.models.shared.StartExecutionRequest request) {
        this.request = request;
        return this;
    }
}