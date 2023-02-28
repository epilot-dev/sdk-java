package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InternalAttributeTypeEnum {
    INTERNAL("internal");

    @JsonValue
    public final String value;

    private InternalAttributeTypeEnum(String value) {
        this.value = value;
    }
}
