package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ListSchemas200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public .models.shared.EntitySchemaItem[] results;
    public ListSchemas200ApplicationJson withResults(.models.shared.EntitySchemaItem[] results) {
        this.results = results;
        return this;
    }
}