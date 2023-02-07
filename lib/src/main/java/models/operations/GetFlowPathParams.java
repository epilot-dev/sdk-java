package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetFlowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flow_id")
    public String flowId;
    public GetFlowPathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
}