package .models.operations;

import .utils.SpeakeasyMetadata;
public class UpsertEntityPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=slug")
    public String slug;
    public UpsertEntityPathParams withSlug(String slug) {
        this.slug = slug;
        return this;
    }
}