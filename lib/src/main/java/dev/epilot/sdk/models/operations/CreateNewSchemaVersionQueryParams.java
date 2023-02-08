package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class CreateNewSchemaVersionQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=draft")
    public Boolean draft;
    public CreateNewSchemaVersionQueryParams withDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }
}
