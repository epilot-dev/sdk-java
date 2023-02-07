package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateActivityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=entities")
    public String[] entities;
    public CreateActivityQueryParams withEntities(String[] entities) {
        this.entities = entities;
        return this;
    }
}