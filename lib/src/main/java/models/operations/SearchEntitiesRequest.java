package .models.operations;

import .utils.SpeakeasyMetadata;
public class SearchEntitiesRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.EntitySearchParams request;
    public SearchEntitiesRequest withRequest(.models.shared.EntitySearchParams request) {
        this.request = request;
        return this;
    }
}