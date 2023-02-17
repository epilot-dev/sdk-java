package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class PutFlowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flow_id")
    public String flowId;
    public PutFlowPathParams withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    
}
