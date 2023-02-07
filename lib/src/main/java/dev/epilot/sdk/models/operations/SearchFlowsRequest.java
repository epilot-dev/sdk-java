package dev.epilot.sdk.models.operations;


public class SearchFlowsRequest {
    public SearchFlowsQueryParams queryParams;
    public SearchFlowsRequest withQueryParams(SearchFlowsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}