package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class SearchAutomationsResp {
    @JsonProperty("results")
    public AutomationFlow[] results;
    public SearchAutomationsResp withResults(AutomationFlow[] results) {
        this.results = results;
        return this;
    }
    @JsonProperty("total")
    public Double total;
    public SearchAutomationsResp withTotal(Double total) {
        this.total = total;
        return this;
    }
}