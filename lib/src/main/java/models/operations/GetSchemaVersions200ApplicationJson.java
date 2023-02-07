package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class GetSchemaVersions200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("drafts")
    public .models.shared.EntitySchemaItem[] drafts;
    public GetSchemaVersions200ApplicationJson withDrafts(.models.shared.EntitySchemaItem[] drafts) {
        this.drafts = drafts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("versions")
    public .models.shared.EntitySchemaItem[] versions;
    public GetSchemaVersions200ApplicationJson withVersions(.models.shared.EntitySchemaItem[] versions) {
        this.versions = versions;
        return this;
    }
}