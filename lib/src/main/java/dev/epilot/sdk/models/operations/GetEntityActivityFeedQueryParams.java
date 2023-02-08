package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class GetEntityActivityFeedQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    public OffsetDateTime after;
    public GetEntityActivityFeedQueryParams withAfter(OffsetDateTime after) {
        this.after = after;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=before")
    public OffsetDateTime before;
    public GetEntityActivityFeedQueryParams withBefore(OffsetDateTime before) {
        this.before = before;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    public Long from;
    public GetEntityActivityFeedQueryParams withFrom(Long from) {
        this.from = from;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public Long size;
    public GetEntityActivityFeedQueryParams withSize(Long size) {
        this.size = size;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public String type;
    public GetEntityActivityFeedQueryParams withType(String type) {
        this.type = type;
        return this;
    }
}
