package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class CreateSavedViewRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.SavedView request;
    public CreateSavedViewRequest withRequest(dev.epilot.sdk.models.shared.SavedView request) {
        this.request = request;
        return this;
    }
    
}
