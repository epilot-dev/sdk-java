package .models.shared;


public enum BooleanAttributeTypeEnum {
    BOOLEAN_("boolean");

    public final String value;

    private BooleanAttributeTypeEnum(String value) {
        this.value = value;
    }
}
