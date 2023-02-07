package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class GetExecutionsResp {
    @JsonProperty("results")
    public AutomationExecution[] results;
    public GetExecutionsResp withResults(AutomationExecution[] results) {
        this.results = results;
        return this;
    }
    @JsonProperty("total")
    public Double total;
    public GetExecutionsResp withTotal(Double total) {
        this.total = total;
        return this;
    }
}