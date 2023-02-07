package .models.shared;


public enum FileAttributeTypeEnum {
    IMAGE("image"),
    FILE("file");

    public final String value;

    private FileAttributeTypeEnum(String value) {
        this.value = value;
    }
}
