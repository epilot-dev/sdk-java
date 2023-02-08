package dev.epilot.sdk.models.operations;

import dev.epilot.sdk.utils.SpeakeasyMetadata;

public class AutocompleteQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=attribute")
    public String attribute;
    public AutocompleteQueryParams withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=input")
    public String input;
    public AutocompleteQueryParams withInput(String input) {
        this.input = input;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=size")
    public Long size;
    public AutocompleteQueryParams withSize(Long size) {
        this.size = size;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=slug")
    public String slug;
    public AutocompleteQueryParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}
