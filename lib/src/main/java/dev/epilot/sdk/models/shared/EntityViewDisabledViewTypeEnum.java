package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityViewDisabledViewTypeEnum {
    DISABLED("disabled");

    @JsonValue
    public final String value;

    private EntityViewDisabledViewTypeEnum(String value) {
        this.value = value;
    }
}
