package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class UpdateRelationRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_tags")
    public String[] tags;
    public UpdateRelationRequestBody withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
}