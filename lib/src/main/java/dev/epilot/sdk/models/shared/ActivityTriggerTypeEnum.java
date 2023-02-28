package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ActivityTriggerTypeEnum {
    ACTIVITY("activity");

    @JsonValue
    public final String value;

    private ActivityTriggerTypeEnum(String value) {
        this.value = value;
    }
}
