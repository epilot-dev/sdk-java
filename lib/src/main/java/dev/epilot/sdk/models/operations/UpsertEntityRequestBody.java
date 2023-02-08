package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class UpsertEntityRequestBody {
    @JsonProperty("entity")
    public java.util.Map<String, Object> entity;
    public UpsertEntityRequestBody withEntity(java.util.Map<String, Object> entity) {
        this.entity = entity;
        return this;
    }
    @JsonProperty("unique_key")
    public String[] uniqueKey;
    public UpsertEntityRequestBody withUniqueKey(String[] uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }
}
