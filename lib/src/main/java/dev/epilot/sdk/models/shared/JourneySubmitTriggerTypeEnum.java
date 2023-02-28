package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum JourneySubmitTriggerTypeEnum {
    JOURNEY_SUBMISSION("journey_submission");

    @JsonValue
    public final String value;

    private JourneySubmitTriggerTypeEnum(String value) {
        this.value = value;
    }
}
