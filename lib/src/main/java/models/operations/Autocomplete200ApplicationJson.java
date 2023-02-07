package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class Autocomplete200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    public Double hits;
    public Autocomplete200ApplicationJson withHits(Double hits) {
        this.hits = hits;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public Object[] results;
    public Autocomplete200ApplicationJson withResults(Object[] results) {
        this.results = results;
        return this;
    }
}