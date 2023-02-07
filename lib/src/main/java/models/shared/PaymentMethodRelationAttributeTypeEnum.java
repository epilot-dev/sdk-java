package .models.shared;


public enum PaymentMethodRelationAttributeTypeEnum {
    RELATION_PAYMENT_METHOD("relation_payment_method");

    public final String value;

    private PaymentMethodRelationAttributeTypeEnum(String value) {
        this.value = value;
    }
}
