package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class GetSchemaVersions200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("drafts")
    public dev.epilot.sdk.models.shared.EntitySchemaItem[] drafts;
    public GetSchemaVersions200ApplicationJson withDrafts(dev.epilot.sdk.models.shared.EntitySchemaItem[] drafts) {
        this.drafts = drafts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("versions")
    public dev.epilot.sdk.models.shared.EntitySchemaItem[] versions;
    public GetSchemaVersions200ApplicationJson withVersions(dev.epilot.sdk.models.shared.EntitySchemaItem[] versions) {
        this.versions = versions;
        return this;
    }
}