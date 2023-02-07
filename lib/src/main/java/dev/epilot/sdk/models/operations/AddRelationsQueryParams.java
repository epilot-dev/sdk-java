package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;
public class AddRelationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=async")
    public Boolean async;
    public AddRelationsQueryParams withAsync(Boolean async) {
        this.async = async;
        return this;
    }
}