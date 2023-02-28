package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RelationItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_tags")
    public String[] tags;
    public RelationItem withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonProperty("attribute")
    public String attribute;
    public RelationItem withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    @JsonProperty("entity_id")
    public String entityId;
    public RelationItem withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reverse")
    public Boolean reverse;
    public RelationItem withReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    
}
