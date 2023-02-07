package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RelationAttribute1SourceFilter
 * A filter to identify which source entities to pick as relations from main entity
**/public class RelationAttribute1SourceFilter {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute")
    public String attribute;
    public RelationAttribute1SourceFilter withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public RelationAttribute1SourceFilter withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation_tag")
    public String relationTag;
    public RelationAttribute1SourceFilter withRelationTag(String relationTag) {
        this.relationTag = relationTag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    public String schema;
    public RelationAttribute1SourceFilter withSchema(String schema) {
        this.schema = schema;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("self")
    public Boolean self;
    public RelationAttribute1SourceFilter withSelf(Boolean self) {
        this.self = self;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;
    public RelationAttribute1SourceFilter withTag(String tag) {
        this.tag = tag;
        return this;
    }
}