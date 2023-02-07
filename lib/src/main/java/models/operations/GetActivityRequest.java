package .models.operations;


public class GetActivityRequest {
    public GetActivityPathParams pathParams;
    public GetActivityRequest withPathParams(GetActivityPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public GetActivityQueryParams queryParams;
    public GetActivityRequest withQueryParams(GetActivityQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}