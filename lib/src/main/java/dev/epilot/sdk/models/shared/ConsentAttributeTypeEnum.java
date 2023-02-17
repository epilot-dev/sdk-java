package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ConsentAttributeTypeEnum {
    CONSENT("consent");

    @JsonValue
    public final String value;

    private ConsentAttributeTypeEnum(String value) {
        this.value = value;
    }
}
