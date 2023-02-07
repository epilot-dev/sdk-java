package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class CreateEntityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=activity_id")
    public String activityId;
    public CreateEntityQueryParams withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=async")
    public Boolean async;
    public CreateEntityQueryParams withAsync(Boolean async) {
        this.async = async;
        return this;
    }
}