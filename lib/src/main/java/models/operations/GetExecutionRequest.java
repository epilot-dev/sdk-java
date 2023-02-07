package .models.operations;


public class GetExecutionRequest {
    public GetExecutionPathParams pathParams;
    public GetExecutionRequest withPathParams(GetExecutionPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}