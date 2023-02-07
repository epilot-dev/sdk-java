package .models.operations;

import .utils.SpeakeasyMetadata;
public class TaxonomyAutocompleteQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;
    public TaxonomyAutocompleteQueryParams withQuery(String query) {
        this.query = query;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public Double size;
    public TaxonomyAutocompleteQueryParams withSize(Double size) {
        this.size = size;
        return this;
    }
}