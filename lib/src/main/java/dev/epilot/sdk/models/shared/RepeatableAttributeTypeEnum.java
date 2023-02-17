package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RepeatableAttributeTypeEnum {
    STRING("string"),
    PHONE("phone"),
    EMAIL("email"),
    ADDRESS("address"),
    RELATION("relation"),
    PAYMENT("payment"),
    PRICE_COMPONENT("price_component"),
    DATE("date");

    @JsonValue
    public final String value;

    private RepeatableAttributeTypeEnum(String value) {
        this.value = value;
    }
}
