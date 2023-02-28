package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Autocomplete200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    public Double hits;
    public Autocomplete200ApplicationJSON withHits(Double hits) {
        this.hits = hits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public Object[] results;
    public Autocomplete200ApplicationJSON withResults(Object[] results) {
        this.results = results;
        return this;
    }
    
}
