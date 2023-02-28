package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityDefaultCreateViewTypeEnum {
    DEFAULT_("default");

    @JsonValue
    public final String value;

    private EntityDefaultCreateViewTypeEnum(String value) {
        this.value = value;
    }
}
