package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class GetJourneyQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    public String orgId;
    public GetJourneyQueryParams withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    public String source;
    public GetJourneyQueryParams withSource(String source) {
        this.source = source;
        return this;
    }
    
}
