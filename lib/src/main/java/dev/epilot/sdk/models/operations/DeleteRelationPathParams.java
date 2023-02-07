package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class DeleteRelationPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=attribute")
    public String attribute;
    public DeleteRelationPathParams withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=entity_id")
    public String entityId;
    public DeleteRelationPathParams withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public DeleteRelationPathParams withId(String id) {
        this.id = id;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public DeleteRelationPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}