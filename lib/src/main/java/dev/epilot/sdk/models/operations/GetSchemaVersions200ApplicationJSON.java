package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class GetSchemaVersions200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("drafts")
    public dev.epilot.sdk.models.shared.EntitySchemaItem[] drafts;
    public GetSchemaVersions200ApplicationJSON withDrafts(dev.epilot.sdk.models.shared.EntitySchemaItem[] drafts) {
        this.drafts = drafts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("versions")
    public dev.epilot.sdk.models.shared.EntitySchemaItem[] versions;
    public GetSchemaVersions200ApplicationJSON withVersions(dev.epilot.sdk.models.shared.EntitySchemaItem[] versions) {
        this.versions = versions;
        return this;
    }
}
