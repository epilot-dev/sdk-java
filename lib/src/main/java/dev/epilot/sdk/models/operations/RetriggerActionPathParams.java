package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class RetriggerActionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=action_id")
    public String actionId;
    public RetriggerActionPathParams withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=execution_id")
    public String executionId;
    public RetriggerActionPathParams withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    
}
