package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntityManualTriggerConfiguration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public EntityManualTriggerConfiguration withSchema(String schema) {
        this.schema = schema;
        return this;
    }
}