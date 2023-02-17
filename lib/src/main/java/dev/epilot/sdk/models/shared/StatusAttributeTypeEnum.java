package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum StatusAttributeTypeEnum {
    STATUS("status");

    @JsonValue
    public final String value;

    private StatusAttributeTypeEnum(String value) {
        this.value = value;
    }
}
