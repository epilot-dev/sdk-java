package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SendEmailConfigLanguageCodeEnum {
    DE("de"),
    EN("en");

    @JsonValue
    public final String value;

    private SendEmailConfigLanguageCodeEnum(String value) {
        this.value = value;
    }
}
