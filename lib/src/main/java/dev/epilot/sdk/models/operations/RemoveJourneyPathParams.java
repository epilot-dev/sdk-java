package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class RemoveJourneyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public RemoveJourneyPathParams withId(String id) {
        this.id = id;
        return this;
    }
    
}
