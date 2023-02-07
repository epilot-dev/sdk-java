package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateActivityRequest {
    public CreateActivityQueryParams queryParams;
    public CreateActivityRequest withQueryParams(CreateActivityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.Activity request;
    public CreateActivityRequest withRequest(.models.shared.Activity request) {
        this.request = request;
        return this;
    }
}