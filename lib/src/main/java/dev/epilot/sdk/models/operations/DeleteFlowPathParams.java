package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class DeleteFlowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flow_id")
    public String flowId;
    public DeleteFlowPathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
}
