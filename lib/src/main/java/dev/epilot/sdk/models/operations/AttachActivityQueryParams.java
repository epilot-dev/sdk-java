package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class AttachActivityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=entities")
    public String[] entities;
    public AttachActivityQueryParams withEntities(String[] entities) {
        this.entities = entities;
        return this;
    }
}
