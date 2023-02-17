package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PurposeAttributeTypeEnum {
    PURPOSE("purpose");

    @JsonValue
    public final String value;

    private PurposeAttributeTypeEnum(String value) {
        this.value = value;
    }
}
