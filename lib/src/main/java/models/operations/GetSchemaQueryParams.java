package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetSchemaQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    public String id;
    public GetSchemaQueryParams withId(String id) {
        this.id = id;
        return this;
    }
}