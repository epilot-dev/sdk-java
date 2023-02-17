package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class UpsertEntityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=activity_id")
    public String activityId;
    public UpsertEntityQueryParams withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=async")
    public Boolean async;
    public UpsertEntityQueryParams withAsync(Boolean async) {
        this.async = async;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dry_run")
    public Boolean dryRun;
    public UpsertEntityQueryParams withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    
}
