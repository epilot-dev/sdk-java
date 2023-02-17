package dev.epilot.sdk.models.operations;



public class CreateSavedViewResponse {
    public String contentType;
    public CreateSavedViewResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.epilot.sdk.models.shared.SavedViewItem savedViewItem;
    public CreateSavedViewResponse withSavedViewItem(dev.epilot.sdk.models.shared.SavedViewItem savedViewItem) {
        this.savedViewItem = savedViewItem;
        return this;
    }
    
    public Integer statusCode;
    public CreateSavedViewResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
