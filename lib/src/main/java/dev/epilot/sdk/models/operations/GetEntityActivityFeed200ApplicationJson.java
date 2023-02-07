package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class GetEntityActivityFeed200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public dev.epilot.sdk.models.shared.ActivityItem[] results;
    public GetEntityActivityFeed200ApplicationJson withResults(dev.epilot.sdk.models.shared.ActivityItem[] results) {
        this.results = results;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total")
    public Long total;
    public GetEntityActivityFeed200ApplicationJson withTotal(Long total) {
        this.total = total;
        return this;
    }
}