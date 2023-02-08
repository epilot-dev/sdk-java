package dev.epilot.sdk.models.operations;



public class UpdateSavedViewResponse {
    public String contentType;
    public UpdateSavedViewResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public dev.epilot.sdk.models.shared.SavedViewItem savedViewItem;
    public UpdateSavedViewResponse withSavedViewItem(dev.epilot.sdk.models.shared.SavedViewItem savedViewItem) {
        this.savedViewItem = savedViewItem;
        return this;
    }
    public Long statusCode;
    public UpdateSavedViewResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
