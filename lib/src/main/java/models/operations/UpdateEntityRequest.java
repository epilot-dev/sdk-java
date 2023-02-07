package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpdateEntityRequest {
    public UpdateEntityPathParams pathParams;
    public UpdateEntityRequest withPathParams(UpdateEntityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public UpdateEntityQueryParams queryParams;
    public UpdateEntityRequest withQueryParams(UpdateEntityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> request;
    public UpdateEntityRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
}