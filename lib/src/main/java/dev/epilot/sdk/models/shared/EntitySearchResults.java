package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySearchResults {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    public Double hits;
    public EntitySearchResults withHits(Double hits) {
        this.hits = hits;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public java.util.Map<String, Object>[] results;
    public EntitySearchResults withResults(java.util.Map<String, Object>[] results) {
        this.results = results;
        return this;
    }
    
}
