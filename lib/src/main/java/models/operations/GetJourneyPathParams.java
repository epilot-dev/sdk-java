package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetJourneyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public GetJourneyPathParams withId(String id) {
        this.id = id;
        return this;
    }
}