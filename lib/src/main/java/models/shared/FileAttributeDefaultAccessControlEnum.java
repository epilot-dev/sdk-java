package .models.shared;


public enum FileAttributeDefaultAccessControlEnum {
    PUBLIC_READ("public-read"),
    PRIVATE_("private");

    public final String value;

    private FileAttributeDefaultAccessControlEnum(String value) {
        this.value = value;
    }
}
