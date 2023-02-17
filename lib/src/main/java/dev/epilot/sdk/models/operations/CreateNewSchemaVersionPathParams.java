package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class CreateNewSchemaVersionPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public CreateNewSchemaVersionPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
}
