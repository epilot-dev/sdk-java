package dev.epilot.sdk.models.operations;


public class ListSchemasRequest {
    public ListSchemasQueryParams queryParams;
    public ListSchemasRequest withQueryParams(ListSchemasQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}