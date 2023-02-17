package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RedirectEntityViewViewTypeEnum {
    REDIRECT("redirect");

    @JsonValue
    public final String value;

    private RedirectEntityViewViewTypeEnum(String value) {
        this.value = value;
    }
}
