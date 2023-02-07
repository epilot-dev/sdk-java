package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class RelationAttribute1 {
    @JsonProperty("mode")
    public RelationAttribute1ModeEnum mode;
    public RelationAttribute1 withMode(RelationAttribute1ModeEnum mode) {
        this.mode = mode;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("related_to")
    public java.util.Map<String, Object> relatedTo;
    public RelationAttribute1 withRelatedTo(java.util.Map<String, Object> relatedTo) {
        this.relatedTo = relatedTo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source_filter")
    public RelationAttribute1SourceFilter sourceFilter;
    public RelationAttribute1 withSourceFilter(RelationAttribute1SourceFilter sourceFilter) {
        this.sourceFilter = sourceFilter;
        return this;
    }
    @JsonProperty("target")
    public String target;
    public RelationAttribute1 withTarget(String target) {
        this.target = target;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_tags")
    public String[] targetTags;
    public RelationAttribute1 withTargetTags(String[] targetTags) {
        this.targetTags = targetTags;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_tags_include_source")
    public Boolean targetTagsIncludeSource;
    public RelationAttribute1 withTargetTagsIncludeSource(Boolean targetTagsIncludeSource) {
        this.targetTagsIncludeSource = targetTagsIncludeSource;
        return this;
    }
}