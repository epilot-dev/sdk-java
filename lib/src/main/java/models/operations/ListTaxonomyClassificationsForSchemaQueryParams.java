package .models.operations;

import .utils.SpeakeasyMetadata;
public class ListTaxonomyClassificationsForSchemaQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;
    public ListTaxonomyClassificationsForSchemaQueryParams withQuery(String query) {
        this.query = query;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public Double size;
    public ListTaxonomyClassificationsForSchemaQueryParams withSize(Double size) {
        this.size = size;
        return this;
    }
}