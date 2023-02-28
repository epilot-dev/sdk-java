package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityImportParams {
    @JsonProperty("S3Reference")
    public EntityImportParamsS3Reference s3Reference;
    public EntityImportParams withS3Reference(EntityImportParamsS3Reference s3Reference) {
        this.s3Reference = s3Reference;
        return this;
    }
    
    @JsonProperty("schema")
    public String schema;
    public EntityImportParams withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    
}
