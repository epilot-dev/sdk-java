package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EntityDefaultEditViewTypeEnum {
    DEFAULT_("default");

    @JsonValue
    public final String value;

    private EntityDefaultEditViewTypeEnum(String value) {
        this.value = value;
    }
}
