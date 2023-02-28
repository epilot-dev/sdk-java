package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RelationAttributeDrawerSizeEnum {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    @JsonValue
    public final String value;

    private RelationAttributeDrawerSizeEnum(String value) {
        this.value = value;
    }
}
