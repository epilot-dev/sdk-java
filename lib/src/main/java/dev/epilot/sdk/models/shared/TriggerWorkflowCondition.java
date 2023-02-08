package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerWorkflowCondition {
    @JsonProperty("comparison")
    public ComparisonEnum comparison;
    public TriggerWorkflowCondition withComparison(ComparisonEnum comparison) {
        this.comparison = comparison;
        return this;
    }
    @JsonProperty("schema")
    public String schema;
    public TriggerWorkflowCondition withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    @JsonProperty("source")
    public String source;
    public TriggerWorkflowCondition withSource(String source) {
        this.source = source;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Object value;
    public TriggerWorkflowCondition withValue(Object value) {
        this.value = value;
        return this;
    }
}
