package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InvitationEmailAttributeTypeEnum {
    INVITATION_EMAIL("invitation_email");

    @JsonValue
    public final String value;

    private InvitationEmailAttributeTypeEnum(String value) {
        this.value = value;
    }
}
