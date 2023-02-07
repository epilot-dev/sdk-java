package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class TriggerCondition {
    @JsonProperty("comparison")
    public ComparisonEnum comparison;
    public TriggerCondition withComparison(ComparisonEnum comparison) {
        this.comparison = comparison;
        return this;
    }
    @JsonProperty("source")
    public String source;
    public TriggerCondition withSource(String source) {
        this.source = source;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Object value;
    public TriggerCondition withValue(Object value) {
        this.value = value;
        return this;
    }
}