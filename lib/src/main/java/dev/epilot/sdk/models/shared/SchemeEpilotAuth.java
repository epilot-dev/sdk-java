package dev.epilot.sdk.models.shared;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class SchemeEpilotAuth {
    @SpeakeasyMetadata("security:name=Authorization")
    public String authorization;
    public SchemeEpilotAuth withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
}