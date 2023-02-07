package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class SearchJourneysResponseResultsCreatedBy {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public SearchJourneysResponseResultsCreatedBy withId(String id) {
        this.id = id;
        return this;
    }
}