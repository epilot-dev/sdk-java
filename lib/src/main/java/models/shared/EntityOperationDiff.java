package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityOperationDiff {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("added")
    public java.util.Map<String, Object> added;
    public EntityOperationDiff withAdded(java.util.Map<String, Object> added) {
        this.added = added;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public java.util.Map<String, Object> deleted;
    public EntityOperationDiff withDeleted(java.util.Map<String, Object> deleted) {
        this.deleted = deleted;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    public java.util.Map<String, Object> updated;
    public EntityOperationDiff withUpdated(java.util.Map<String, Object> updated) {
        this.updated = updated;
        return this;
    }
}