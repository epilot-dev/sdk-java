package .models.operations;


public class GetFlowRequest {
    public GetFlowPathParams pathParams;
    public GetFlowRequest withPathParams(GetFlowPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}