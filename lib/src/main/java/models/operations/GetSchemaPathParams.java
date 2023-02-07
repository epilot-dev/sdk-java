package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetSchemaPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public GetSchemaPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}