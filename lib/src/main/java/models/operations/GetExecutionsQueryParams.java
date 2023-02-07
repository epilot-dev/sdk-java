package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetExecutionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=entity_id")
    public String entityId;
    public GetExecutionsQueryParams withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    public Long from;
    public GetExecutionsQueryParams withFrom(Long from) {
        this.from = from;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public Long size;
    public GetExecutionsQueryParams withSize(Long size) {
        this.size = size;
        return this;
    }
}