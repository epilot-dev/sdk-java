package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityDefaultTableViewTypeEnum {
    DEFAULT_("default");

    @JsonValue
    public final String value;

    private EntityDefaultTableViewTypeEnum(String value) {
        this.value = value;
    }
}
