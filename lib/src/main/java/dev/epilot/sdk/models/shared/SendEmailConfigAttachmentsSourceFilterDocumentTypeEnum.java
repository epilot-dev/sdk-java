package dev.epilot.sdk.models.shared;


public enum SendEmailConfigAttachmentsSourceFilterDocumentTypeEnum {
    DOCUMENT("document"),
    TEXT("text"),
    IMAGE("image"),
    VIDEO("video"),
    AUDIO("audio"),
    SPREADSHEET("spreadsheet"),
    PRESENTATION("presentation"),
    FONT("font"),
    ARCHIVE("archive"),
    APPLICATION("application"),
    UNKNOWN("unknown");

    public final String value;

    private SendEmailConfigAttachmentsSourceFilterDocumentTypeEnum(String value) {
        this.value = value;
    }
}
