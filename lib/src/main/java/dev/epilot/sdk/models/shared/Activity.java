package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {
    @JsonProperty("message")
    public String message;
    public Activity withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payload")
    public java.util.Map<String, Object> payload;
    public Activity withPayload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public Activity withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonProperty("type")
    public String type;
    public Activity withType(String type) {
        this.type = type;
        return this;
    }
    
}
