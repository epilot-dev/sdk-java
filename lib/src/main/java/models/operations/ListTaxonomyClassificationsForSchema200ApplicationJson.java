package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ListTaxonomyClassificationsForSchema200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public .models.shared.TaxonomyClassification[] results;
    public ListTaxonomyClassificationsForSchema200ApplicationJson withResults(.models.shared.TaxonomyClassification[] results) {
        this.results = results;
        return this;
    }
}