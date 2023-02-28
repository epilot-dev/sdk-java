package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEntity200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity")
    public java.util.Map<String, Object> entity;
    public GetEntity200ApplicationJSON withEntity(java.util.Map<String, Object> entity) {
        this.entity = entity;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relations")
    public java.util.Map<String, Object>[] relations;
    public GetEntity200ApplicationJSON withRelations(java.util.Map<String, Object>[] relations) {
        this.relations = relations;
        return this;
    }
    
}
