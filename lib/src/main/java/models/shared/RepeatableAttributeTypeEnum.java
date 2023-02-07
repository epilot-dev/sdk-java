package .models.shared;


public enum RepeatableAttributeTypeEnum {
    STRING("string"),
    PHONE("phone"),
    EMAIL("email"),
    ADDRESS("address"),
    RELATION("relation"),
    PAYMENT("payment"),
    PRICE_COMPONENT("price_component"),
    DATE("date");

    public final String value;

    private RepeatableAttributeTypeEnum(String value) {
        this.value = value;
    }
}
