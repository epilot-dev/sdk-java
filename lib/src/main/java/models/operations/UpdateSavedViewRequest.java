package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpdateSavedViewRequest {
    public UpdateSavedViewPathParams pathParams;
    public UpdateSavedViewRequest withPathParams(UpdateSavedViewPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.SavedView request;
    public UpdateSavedViewRequest withRequest(.models.shared.SavedView request) {
        this.request = request;
        return this;
    }
}