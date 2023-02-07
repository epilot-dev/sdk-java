package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class SearchJourneysResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    public Double hits;
    public SearchJourneysResponse withHits(Double hits) {
        this.hits = hits;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public SearchJourneysResponseResults[] results;
    public SearchJourneysResponse withResults(SearchJourneysResponseResults[] results) {
        this.results = results;
        return this;
    }
}