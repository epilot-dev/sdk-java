package .models.operations;

import .utils.SpeakeasyMetadata;
public class AddRelationsRequest {
    public AddRelationsPathParams pathParams;
    public AddRelationsRequest withPathParams(AddRelationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public AddRelationsQueryParams queryParams;
    public AddRelationsRequest withQueryParams(AddRelationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public .models.shared.RelationItem[] request;
    public AddRelationsRequest withRequest(.models.shared.RelationItem[] request) {
        this.request = request;
        return this;
    }
}