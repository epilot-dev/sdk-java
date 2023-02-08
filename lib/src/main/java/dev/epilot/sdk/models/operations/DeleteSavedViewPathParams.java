package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class DeleteSavedViewPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public DeleteSavedViewPathParams withId(String id) {
        this.id = id;
        return this;
    }
}
