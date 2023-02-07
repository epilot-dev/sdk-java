package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;
public class AutomationFlow {
    @JsonProperty("actions")
    public Object[] actions;
    public AutomationFlow withActions(Object[] actions) {
        this.actions = actions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public AutomationFlow withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public String createdBy;
    public AutomationFlow withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    public Boolean enabled;
    public AutomationFlow withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_schema")
    public String entitySchema;
    public AutomationFlow withEntitySchema(String entitySchema) {
        this.entitySchema = entitySchema;
        return this;
    }
    @JsonProperty("flow_name")
    public String flowName;
    public AutomationFlow withFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public AutomationFlow withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_updated_by")
    public String lastUpdatedBy;
    public AutomationFlow withLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("runs")
    public Double runs;
    public AutomationFlow withRuns(Double runs) {
        this.runs = runs;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trigger_conditions")
    public TriggerCondition[] triggerConditions;
    public AutomationFlow withTriggerConditions(TriggerCondition[] triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }
    @JsonProperty("triggers")
    public Object[] triggers;
    public AutomationFlow withTriggers(Object[] triggers) {
        this.triggers = triggers;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public AutomationFlow withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}