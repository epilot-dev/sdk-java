package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class UpdateRelationPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=attribute")
    public String attribute;
    public UpdateRelationPathParams withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=entity_id")
    public String entityId;
    public UpdateRelationPathParams withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public UpdateRelationPathParams withId(String id) {
        this.id = id;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public UpdateRelationPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
}
