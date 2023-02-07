package .models.operations;

import .utils.SpeakeasyMetadata;
public class ExportEntitiesRequest {
    public ExportEntitiesQueryParams queryParams;
    public ExportEntitiesRequest withQueryParams(ExportEntitiesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.EntitySearchParams request;
    public ExportEntitiesRequest withRequest(.models.shared.EntitySearchParams request) {
        this.request = request;
        return this;
    }
}