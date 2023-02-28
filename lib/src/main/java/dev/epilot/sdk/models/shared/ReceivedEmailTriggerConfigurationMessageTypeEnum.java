package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ReceivedEmailTriggerConfigurationMessageTypeEnum {
    RECEIVED("RECEIVED");

    @JsonValue
    public final String value;

    private ReceivedEmailTriggerConfigurationMessageTypeEnum(String value) {
        this.value = value;
    }
}
