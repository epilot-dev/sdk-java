package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateRelationRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_tags")
    public String[] tags;
    public UpdateRelationRequestBody withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
}
