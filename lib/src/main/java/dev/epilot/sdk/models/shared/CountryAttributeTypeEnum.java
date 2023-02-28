package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum CountryAttributeTypeEnum {
    COUNTRY("country");

    @JsonValue
    public final String value;

    private CountryAttributeTypeEnum(String value) {
        this.value = value;
    }
}
