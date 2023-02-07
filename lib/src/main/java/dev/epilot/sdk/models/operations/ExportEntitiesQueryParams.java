package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class ExportEntitiesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=is_template")
    public Boolean isTemplate;
    public ExportEntitiesQueryParams withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=job_id")
    public String jobId;
    public ExportEntitiesQueryParams withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=language")
    public String language;
    public ExportEntitiesQueryParams withLanguage(String language) {
        this.language = language;
        return this;
    }
}