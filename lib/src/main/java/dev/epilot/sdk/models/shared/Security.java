package dev.epilot.sdk.models.shared;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer")
    public SchemeEpilotAuth epilotAuth;
    public Security withEpilotAuth(SchemeEpilotAuth epilotAuth) {
        this.epilotAuth = epilotAuth;
        return this;
    }
}
