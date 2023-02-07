package .models.operations;

import .utils.SpeakeasyMetadata;
public class SearchJourneysRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.SearchJourneysQueryRequest request;
    public SearchJourneysRequest withRequest(.models.shared.SearchJourneysQueryRequest request) {
        this.request = request;
        return this;
    }
}