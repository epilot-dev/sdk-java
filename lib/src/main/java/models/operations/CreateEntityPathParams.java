package .models.operations;

import .utils.SpeakeasyMetadata;
public class CreateEntityPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public CreateEntityPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}