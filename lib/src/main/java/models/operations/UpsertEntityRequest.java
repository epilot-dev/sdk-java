package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpsertEntityRequest {
    public UpsertEntityPathParams pathParams;
    public UpsertEntityRequest withPathParams(UpsertEntityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public UpsertEntityQueryParams queryParams;
    public UpsertEntityRequest withQueryParams(UpsertEntityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public UpsertEntityRequestBody request;
    public UpsertEntityRequest withRequest(UpsertEntityRequestBody request) {
        this.request = request;
        return this;
    }
}