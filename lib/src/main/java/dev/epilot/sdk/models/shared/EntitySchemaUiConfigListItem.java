package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntitySchemaUiConfigListItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary_attributes")
    public Object[] summaryAttributes;
    public EntitySchemaUiConfigListItem withSummaryAttributes(Object[] summaryAttributes) {
        this.summaryAttributes = summaryAttributes;
        return this;
    }
    
}
