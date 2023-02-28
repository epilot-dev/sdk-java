package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum CurrencyAttributeTypeEnum {
    CURRENCY("currency");

    @JsonValue
    public final String value;

    private CurrencyAttributeTypeEnum(String value) {
        this.value = value;
    }
}
