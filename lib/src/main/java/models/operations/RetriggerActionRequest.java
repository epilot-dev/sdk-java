package .models.operations;

import .utils.SpeakeasyMetadata;
public class RetriggerActionRequest {
    public RetriggerActionPathParams pathParams;
    public RetriggerActionRequest withPathParams(RetriggerActionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.RetryReq request;
    public RetriggerActionRequest withRequest(.models.shared.RetryReq request) {
        this.request = request;
        return this;
    }
}