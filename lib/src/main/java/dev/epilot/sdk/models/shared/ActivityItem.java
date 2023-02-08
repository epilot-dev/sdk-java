package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.epilot.sdk.utils.DateTimeDeserializer;
import dev.epilot.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class ActivityItem {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_id")
    public String id;
    public ActivityItem withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("caller")
    public java.util.Map<String, Object> caller;
    public ActivityItem withCaller(java.util.Map<String, Object> caller) {
        this.caller = caller;
        return this;
    }
    @JsonProperty("message")
    public String message;
    public ActivityItem withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("operations")
    public EntityOperation[] operations;
    public ActivityItem withOperations(EntityOperation[] operations) {
        this.operations = operations;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("operations_total")
    public Long operationsTotal;
    public ActivityItem withOperationsTotal(Long operationsTotal) {
        this.operationsTotal = operationsTotal;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payload")
    public java.util.Map<String, Object> payload;
    public ActivityItem withPayload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;
    public ActivityItem withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    @JsonProperty("title")
    public String title;
    public ActivityItem withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonProperty("type")
    public String type;
    public ActivityItem withType(String type) {
        this.type = type;
        return this;
    }
}
