package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum DateAttributeTypeEnum {
    DATE("date"),
    DATETIME("datetime");

    @JsonValue
    public final String value;

    private DateAttributeTypeEnum(String value) {
        this.value = value;
    }
}
