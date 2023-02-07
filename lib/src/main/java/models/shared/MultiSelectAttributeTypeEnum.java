package .models.shared;


public enum MultiSelectAttributeTypeEnum {
    MULTISELECT("multiselect"),
    CHECKBOX("checkbox");

    public final String value;

    private MultiSelectAttributeTypeEnum(String value) {
        this.value = value;
    }
}
