package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class GetRelationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=hydrate")
    public Boolean hydrate;
    public GetRelationsQueryParams withHydrate(Boolean hydrate) {
        this.hydrate = hydrate;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include_reverse")
    public Boolean includeReverse;
    public GetRelationsQueryParams withIncludeReverse(Boolean includeReverse) {
        this.includeReverse = includeReverse;
        return this;
    }
}