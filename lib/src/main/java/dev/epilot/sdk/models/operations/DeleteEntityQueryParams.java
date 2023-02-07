package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class DeleteEntityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=activity_id")
    public String activityId;
    public DeleteEntityQueryParams withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
}