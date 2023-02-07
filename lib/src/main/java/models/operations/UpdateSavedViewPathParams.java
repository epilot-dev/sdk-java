package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpdateSavedViewPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public UpdateSavedViewPathParams withId(String id) {
        this.id = id;
        return this;
    }
}