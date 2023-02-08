package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchJourneysResponseResultsCreatedBy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SearchJourneysResponseResultsCreatedBy withId(String id) {
        this.id = id;
        return this;
    }
}
