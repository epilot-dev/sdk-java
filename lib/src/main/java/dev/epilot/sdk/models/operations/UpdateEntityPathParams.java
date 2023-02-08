package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class UpdateEntityPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public UpdateEntityPathParams withId(String id) {
        this.id = id;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public UpdateEntityPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}
