package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class GetEntityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=hydrate")
    public Boolean hydrate;
    public GetEntityQueryParams withHydrate(Boolean hydrate) {
        this.hydrate = hydrate;
        return this;
    }
}
