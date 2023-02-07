package .models.operations;

import .utils.SpeakeasyMetadata;
public class DeleteSchemaByIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public DeleteSchemaByIdPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}