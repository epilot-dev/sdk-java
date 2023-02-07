package dev.epilot.sdk.models.operations;


public class AutocompleteRequest {
    public AutocompleteQueryParams queryParams;
    public AutocompleteRequest withQueryParams(AutocompleteQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}