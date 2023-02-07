package .models.operations;

import .utils.SpeakeasyMetadata;
public class AttachActivityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=entities")
    public String[] entities;
    public AttachActivityQueryParams withEntities(String[] entities) {
        this.entities = entities;
        return this;
    }
}