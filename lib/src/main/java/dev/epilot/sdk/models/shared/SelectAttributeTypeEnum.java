package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SelectAttributeTypeEnum {
    SELECT("select"),
    RADIO("radio");

    @JsonValue
    public final String value;

    private SelectAttributeTypeEnum(String value) {
        this.value = value;
    }
}
