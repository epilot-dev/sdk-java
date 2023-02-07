package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class TaxonomiesClassificationsSearch200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public Object results;
    public TaxonomiesClassificationsSearch200ApplicationJson withResults(Object results) {
        this.results = results;
        return this;
    }
}