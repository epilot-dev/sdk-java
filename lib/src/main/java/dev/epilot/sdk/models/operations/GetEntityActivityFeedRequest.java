package dev.epilot.sdk.models.operations;


public class GetEntityActivityFeedRequest {
    public GetEntityActivityFeedPathParams pathParams;
    public GetEntityActivityFeedRequest withPathParams(GetEntityActivityFeedPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetEntityActivityFeedQueryParams queryParams;
    public GetEntityActivityFeedRequest withQueryParams(GetEntityActivityFeedQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}