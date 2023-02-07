package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class GetJourneysByOrgIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public GetJourneysByOrgIdPathParams withId(String id) {
        this.id = id;
        return this;
    }
}