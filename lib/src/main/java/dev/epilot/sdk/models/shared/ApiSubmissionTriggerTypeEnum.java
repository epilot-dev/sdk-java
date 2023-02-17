package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ApiSubmissionTriggerTypeEnum {
    API_SUBMISSION("api_submission");

    @JsonValue
    public final String value;

    private ApiSubmissionTriggerTypeEnum(String value) {
        this.value = value;
    }
}
