package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class SearchFlowsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    public Long from;
    public SearchFlowsQueryParams withFrom(Long from) {
        this.from = from;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=schema")
    public String schema;
    public SearchFlowsQueryParams withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public Long size;
    public SearchFlowsQueryParams withSize(Long size) {
        this.size = size;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=trigger_source_id")
    public String triggerSourceId;
    public SearchFlowsQueryParams withTriggerSourceId(String triggerSourceId) {
        this.triggerSourceId = triggerSourceId;
        return this;
    }
}
