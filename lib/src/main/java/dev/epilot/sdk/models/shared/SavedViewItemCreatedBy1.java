package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SavedViewItemCreatedBy1
 * A user that created the view
**/public class SavedViewItemCreatedBy1 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    public String userId;
    public SavedViewItemCreatedBy1 withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}