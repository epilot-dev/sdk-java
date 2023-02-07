package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class GetEntity200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity")
    public java.util.Map<String, Object> entity;
    public GetEntity200ApplicationJson withEntity(java.util.Map<String, Object> entity) {
        this.entity = entity;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relations")
    public java.util.Map<String, Object>[] relations;
    public GetEntity200ApplicationJson withRelations(java.util.Map<String, Object>[] relations) {
        this.relations = relations;
        return this;
    }
}