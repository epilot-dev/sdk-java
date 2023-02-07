package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class CreateActivityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=entities")
    public String[] entities;
    public CreateActivityQueryParams withEntities(String[] entities) {
        this.entities = entities;
        return this;
    }
}