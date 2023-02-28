package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class UpdateEntityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=activity_id")
    public String activityId;
    public UpdateEntityQueryParams withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=async")
    public Boolean async;
    public UpdateEntityQueryParams withAsync(Boolean async) {
        this.async = async;
        return this;
    }
    
}
