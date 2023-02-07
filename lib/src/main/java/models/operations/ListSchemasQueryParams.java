package .models.operations;

import .utils.SpeakeasyMetadata;
public class ListSchemasQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=unpublished")
    public Boolean unpublished;
    public ListSchemasQueryParams withUnpublished(Boolean unpublished) {
        this.unpublished = unpublished;
        return this;
    }
}