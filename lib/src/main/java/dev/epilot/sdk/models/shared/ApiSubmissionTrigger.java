package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
public class ApiSubmissionTrigger {
    @JsonProperty("configuration")
    public ApiSubmissionTriggerConfiguration configuration;
    public ApiSubmissionTrigger withConfiguration(ApiSubmissionTriggerConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    @JsonProperty("type")
    public ApiSubmissionTriggerTypeEnum type;
    public ApiSubmissionTrigger withType(ApiSubmissionTriggerTypeEnum type) {
        this.type = type;
        return this;
    }
}