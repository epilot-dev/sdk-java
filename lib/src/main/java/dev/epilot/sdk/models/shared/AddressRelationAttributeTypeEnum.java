package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum AddressRelationAttributeTypeEnum {
    RELATION_ADDRESS("relation_address");

    @JsonValue
    public final String value;

    private AddressRelationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
