package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class ExportEntitiesRequest {
    public ExportEntitiesQueryParams queryParams;
    public ExportEntitiesRequest withQueryParams(ExportEntitiesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.EntitySearchParams request;
    public ExportEntitiesRequest withRequest(dev.epilot.sdk.models.shared.EntitySearchParams request) {
        this.request = request;
        return this;
    }
}