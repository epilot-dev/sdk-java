package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum AutomationAttributeTypeEnum {
    AUTOMATION("automation");

    @JsonValue
    public final String value;

    private AutomationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
