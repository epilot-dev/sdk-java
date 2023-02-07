package .models.shared;


public enum SelectAttributeTypeEnum {
    SELECT("select"),
    RADIO("radio");

    public final String value;

    private SelectAttributeTypeEnum(String value) {
        this.value = value;
    }
}
