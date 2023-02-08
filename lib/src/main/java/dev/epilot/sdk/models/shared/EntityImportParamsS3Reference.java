package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityImportParamsS3Reference {
    @JsonProperty("bucket")
    public String bucket;
    public EntityImportParamsS3Reference withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    @JsonProperty("key")
    public String key;
    public EntityImportParamsS3Reference withKey(String key) {
        this.key = key;
        return this;
    }
}
