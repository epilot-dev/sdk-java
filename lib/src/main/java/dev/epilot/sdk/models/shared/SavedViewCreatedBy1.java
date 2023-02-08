package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SavedViewCreatedBy1
 * A user that created the view
**/
public class SavedViewCreatedBy1 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;
    public SavedViewCreatedBy1 withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
