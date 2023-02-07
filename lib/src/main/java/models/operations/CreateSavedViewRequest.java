package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateSavedViewRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.SavedView request;
    public CreateSavedViewRequest withRequest(.models.shared.SavedView request) {
        this.request = request;
        return this;
    }
}