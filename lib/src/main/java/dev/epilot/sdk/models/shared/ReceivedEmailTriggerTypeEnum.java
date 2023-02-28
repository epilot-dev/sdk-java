package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ReceivedEmailTriggerTypeEnum {
    RECEIVED_EMAIL("received_email");

    @JsonValue
    public final String value;

    private ReceivedEmailTriggerTypeEnum(String value) {
        this.value = value;
    }
}
