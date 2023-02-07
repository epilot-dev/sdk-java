package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class MapEntityConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkback_relation_attribute")
    public String linkbackRelationAttribute;
    public MapEntityConfig withLinkbackRelationAttribute(String linkbackRelationAttribute) {
        this.linkbackRelationAttribute = linkbackRelationAttribute;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkback_relation_tags")
    public String[] linkbackRelationTags;
    public MapEntityConfig withLinkbackRelationTags(String[] linkbackRelationTags) {
        this.linkbackRelationTags = linkbackRelationTags;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mapping_attributes")
    public Object[] mappingAttributes;
    public MapEntityConfig withMappingAttributes(Object[] mappingAttributes) {
        this.mappingAttributes = mappingAttributes;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mapping_config")
    public MappingConfigRef mappingConfig;
    public MapEntityConfig withMappingConfig(MappingConfigRef mappingConfig) {
        this.mappingConfig = mappingConfig;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation_attributes")
    public RelationAttribute1[] relationAttributes;
    public MapEntityConfig withRelationAttributes(RelationAttribute1[] relationAttributes) {
        this.relationAttributes = relationAttributes;
        return this;
    }
    @JsonProperty("target_schema")
    public String targetSchema;
    public MapEntityConfig withTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_unique")
    public String[] targetUnique;
    public MapEntityConfig withTargetUnique(String[] targetUnique) {
        this.targetUnique = targetUnique;
        return this;
    }
}