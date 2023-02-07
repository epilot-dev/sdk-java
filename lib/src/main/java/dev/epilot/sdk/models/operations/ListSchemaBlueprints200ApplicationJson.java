package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ListSchemaBlueprints200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public dev.epilot.sdk.models.shared.EntitySchemaItem[] results;
    public ListSchemaBlueprints200ApplicationJson withResults(dev.epilot.sdk.models.shared.EntitySchemaItem[] results) {
        this.results = results;
        return this;
    }
}