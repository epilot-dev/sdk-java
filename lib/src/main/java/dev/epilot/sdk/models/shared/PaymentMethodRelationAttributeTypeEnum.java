package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PaymentMethodRelationAttributeTypeEnum {
    RELATION_PAYMENT_METHOD("relation_payment_method");

    @JsonValue
    public final String value;

    private PaymentMethodRelationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
