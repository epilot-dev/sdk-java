package dev.epilot.sdk.models.operations;



public class GetJourneyRequest {
    public GetJourneyPathParams pathParams;
    public GetJourneyRequest withPathParams(GetJourneyPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetJourneyQueryParams queryParams;
    public GetJourneyRequest withQueryParams(GetJourneyQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}
