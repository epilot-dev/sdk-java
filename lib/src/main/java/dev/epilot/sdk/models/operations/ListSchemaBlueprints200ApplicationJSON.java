package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListSchemaBlueprints200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public dev.epilot.sdk.models.shared.EntitySchemaItem[] results;
    public ListSchemaBlueprints200ApplicationJSON withResults(dev.epilot.sdk.models.shared.EntitySchemaItem[] results) {
        this.results = results;
        return this;
    }
    
}
