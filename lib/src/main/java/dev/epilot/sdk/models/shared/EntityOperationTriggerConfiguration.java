package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class EntityOperationTriggerConfiguration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exclude_activities")
    public String[] excludeActivities;
    public EntityOperationTriggerConfiguration withExcludeActivities(String[] excludeActivities) {
        this.excludeActivities = excludeActivities;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_activities")
    public String[] includeActivities;
    public EntityOperationTriggerConfiguration withIncludeActivities(String[] includeActivities) {
        this.includeActivities = includeActivities;
        return this;
    }
    @JsonProperty("operations")
    public EntityOperationTriggerConfigurationOperationsEnum[] operations;
    public EntityOperationTriggerConfiguration withOperations(EntityOperationTriggerConfigurationOperationsEnum[] operations) {
        this.operations = operations;
        return this;
    }
    @JsonProperty("schema")
    public String schema;
    public EntityOperationTriggerConfiguration withSchema(String schema) {
        this.schema = schema;
        return this;
    }
}
