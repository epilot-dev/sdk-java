package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class EntityManualTrigger {
    @JsonProperty("configuration")
    public EntityManualTriggerConfiguration configuration;
    public EntityManualTrigger withConfiguration(EntityManualTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    @JsonProperty("type")
    public EntityManualTriggerTypeEnum type;
    public EntityManualTrigger withType(EntityManualTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}