package .models.operations;

import .utils.SpeakeasyMetadata;
public class PutFlowRequest {
    public PutFlowPathParams pathParams;
    public PutFlowRequest withPathParams(PutFlowPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.AutomationFlow request;
    public PutFlowRequest withRequest(.models.shared.AutomationFlow request) {
        this.request = request;
        return this;
    }
}