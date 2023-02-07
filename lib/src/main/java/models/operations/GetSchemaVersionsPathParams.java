package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetSchemaVersionsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public GetSchemaVersionsPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}