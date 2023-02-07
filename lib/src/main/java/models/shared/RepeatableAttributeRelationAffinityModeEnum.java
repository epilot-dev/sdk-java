package .models.shared;


public enum RepeatableAttributeRelationAffinityModeEnum {
    WEAK("weak"),
    STRONG("strong");

    public final String value;

    private RepeatableAttributeRelationAffinityModeEnum(String value) {
        this.value = value;
    }
}
