package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SummaryField
 * Summary Fields are displayed inside list view as a resume of the relation entity.
**/public class SummaryField {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_as")
    public String displayAs;
    public SummaryField withDisplayAs(String displayAs) {
        this.displayAs = displayAs;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field")
    public String field;
    public SummaryField withField(String field) {
        this.field = field;
        return this;
    }
}