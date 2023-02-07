package .models.operations;

import .utils.SpeakeasyMetadata;
public class ImportEntitiesRequest {
    public ImportEntitiesQueryParams queryParams;
    public ImportEntitiesRequest withQueryParams(ImportEntitiesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.EntityImportParams request;
    public ImportEntitiesRequest withRequest(.models.shared.EntityImportParams request) {
        this.request = request;
        return this;
    }
}