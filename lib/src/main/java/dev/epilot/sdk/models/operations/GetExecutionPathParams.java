package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class GetExecutionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=execution_id")
    public String executionId;
    public GetExecutionPathParams withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
}
