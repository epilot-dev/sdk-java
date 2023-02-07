package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class SearchMappings {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public Object fields;
    public SearchMappings withFields(Object fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Boolean index;
    public SearchMappings withIndex(Boolean index) {
        this.index = index;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public SearchMappingsTypeEnum type;
    public SearchMappings withType(SearchMappingsTypeEnum type) {
        this.type = type;
        return this;
    }
}