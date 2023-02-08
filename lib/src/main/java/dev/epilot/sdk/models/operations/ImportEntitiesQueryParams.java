package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class ImportEntitiesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=job_id")
    public String jobId;
    public ImportEntitiesQueryParams withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
}
