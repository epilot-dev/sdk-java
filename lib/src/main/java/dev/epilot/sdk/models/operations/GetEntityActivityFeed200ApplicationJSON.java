package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEntityActivityFeed200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public dev.epilot.sdk.models.shared.ActivityItem[] results;
    public GetEntityActivityFeed200ApplicationJSON withResults(dev.epilot.sdk.models.shared.ActivityItem[] results) {
        this.results = results;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total")
    public Long total;
    public GetEntityActivityFeed200ApplicationJSON withTotal(Long total) {
        this.total = total;
        return this;
    }
    
}
