package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttribute1ModeEnum {
    APPEND("append"),
    PREPEND("prepend"),
    SET("set");

    @JsonValue
    public final String value;

    private RelationAttribute1ModeEnum(String value) {
        this.value = value;
    }
}
