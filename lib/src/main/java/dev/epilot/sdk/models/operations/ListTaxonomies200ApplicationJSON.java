package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class ListTaxonomies200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public dev.epilot.sdk.models.shared.Taxonomy[] results;
    public ListTaxonomies200ApplicationJSON withResults(dev.epilot.sdk.models.shared.Taxonomy[] results) {
        this.results = results;
        return this;
    }
}
