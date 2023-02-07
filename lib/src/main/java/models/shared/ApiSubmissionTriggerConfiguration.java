package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class ApiSubmissionTriggerConfiguration {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_id")
    public String sourceId;
    public ApiSubmissionTriggerConfiguration withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
}