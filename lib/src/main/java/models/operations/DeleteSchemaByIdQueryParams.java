package .models.operations;

import .utils.SpeakeasyMetadata;
public class DeleteSchemaByIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    public String id;
    public DeleteSchemaByIdQueryParams withId(String id) {
        this.id = id;
        return this;
    }
}