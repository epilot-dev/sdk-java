package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ComparisonEnum {
    EQUALS("equals"),
    ANY_OF("any_of"),
    NOT_EMPTY("not_empty"),
    IS_EMPTY("is_empty");

    @JsonValue
    public final String value;

    private ComparisonEnum(String value) {
        this.value = value;
    }
}
