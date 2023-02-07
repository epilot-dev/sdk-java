package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class UpdateSavedViewRequest {
    public UpdateSavedViewPathParams pathParams;
    public UpdateSavedViewRequest withPathParams(UpdateSavedViewPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.SavedView request;
    public UpdateSavedViewRequest withRequest(dev.epilot.sdk.models.shared.SavedView request) {
        this.request = request;
        return this;
    }
}