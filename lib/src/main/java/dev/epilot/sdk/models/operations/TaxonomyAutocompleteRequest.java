package dev.epilot.sdk.models.operations;


public class TaxonomyAutocompleteRequest {
    public TaxonomyAutocompletePathParams pathParams;
    public TaxonomyAutocompleteRequest withPathParams(TaxonomyAutocompletePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public TaxonomyAutocompleteQueryParams queryParams;
    public TaxonomyAutocompleteRequest withQueryParams(TaxonomyAutocompleteQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}