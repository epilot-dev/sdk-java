package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxonomiesClassificationsSearch200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public Object results;
    public TaxonomiesClassificationsSearch200ApplicationJSON withResults(Object results) {
        this.results = results;
        return this;
    }
    
}
