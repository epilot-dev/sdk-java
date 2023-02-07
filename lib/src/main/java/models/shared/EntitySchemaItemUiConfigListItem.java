package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class EntitySchemaItemUiConfigListItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary_attributes")
    public Object[] summaryAttributes;
    public EntitySchemaItemUiConfigListItem withSummaryAttributes(Object[] summaryAttributes) {
        this.summaryAttributes = summaryAttributes;
        return this;
    }
}