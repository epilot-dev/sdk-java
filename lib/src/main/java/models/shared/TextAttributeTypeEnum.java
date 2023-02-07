package .models.shared;


public enum TextAttributeTypeEnum {
    STRING("string");

    public final String value;

    private TextAttributeTypeEnum(String value) {
        this.value = value;
    }
}
