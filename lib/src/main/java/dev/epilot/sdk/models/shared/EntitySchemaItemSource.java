package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntitySchemaItemSource {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public EntitySchemaItemSource withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public EntitySchemaItemSource withType(String type) {
        this.type = type;
        return this;
    }
}