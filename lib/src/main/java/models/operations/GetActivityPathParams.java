package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetActivityPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public GetActivityPathParams withId(String id) {
        this.id = id;
        return this;
    }
}