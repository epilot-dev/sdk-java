package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class ImportEntitiesRequest {
    public ImportEntitiesQueryParams queryParams;
    public ImportEntitiesRequest withQueryParams(ImportEntitiesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.epilot.sdk.models.shared.EntityImportParams request;
    public ImportEntitiesRequest withRequest(dev.epilot.sdk.models.shared.EntityImportParams request) {
        this.request = request;
        return this;
    }
    
}
