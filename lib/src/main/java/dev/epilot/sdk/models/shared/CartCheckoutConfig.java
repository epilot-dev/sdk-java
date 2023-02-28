package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartCheckoutConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkback_relation_attribute")
    public String linkbackRelationAttribute;
    public CartCheckoutConfig withLinkbackRelationAttribute(String linkbackRelationAttribute) {
        this.linkbackRelationAttribute = linkbackRelationAttribute;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkback_relation_tags")
    public String[] linkbackRelationTags;
    public CartCheckoutConfig withLinkbackRelationTags(String[] linkbackRelationTags) {
        this.linkbackRelationTags = linkbackRelationTags;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mapping_attributes")
    public Object[] mappingAttributes;
    public CartCheckoutConfig withMappingAttributes(Object[] mappingAttributes) {
        this.mappingAttributes = mappingAttributes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mapping_config")
    public MappingConfigRef mappingConfig;
    public CartCheckoutConfig withMappingConfig(MappingConfigRef mappingConfig) {
        this.mappingConfig = mappingConfig;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation_attributes")
    public RelationAttribute1[] relationAttributes;
    public CartCheckoutConfig withRelationAttributes(RelationAttribute1[] relationAttributes) {
        this.relationAttributes = relationAttributes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target_unique")
    public String[] targetUnique;
    public CartCheckoutConfig withTargetUnique(String[] targetUnique) {
        this.targetUnique = targetUnique;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;
    public CartCheckoutConfig withVersion(String version) {
        this.version = version;
        return this;
    }
    
}
