package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum OrderedListAttributeTypeEnum {
    ORDERED_LIST("ordered_list");

    @JsonValue
    public final String value;

    private OrderedListAttributeTypeEnum(String value) {
        this.value = value;
    }
}
