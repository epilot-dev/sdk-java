package dev.epilot.sdk.models.operations;



public class ListSavedViewsResponse {
    public String contentType;
    public ListSavedViewsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ListSavedViewsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public ListSavedViews200ApplicationJSON listSavedViews200ApplicationJSONObject;
    public ListSavedViewsResponse withListSavedViews200ApplicationJSONObject(ListSavedViews200ApplicationJSON listSavedViews200ApplicationJSONObject) {
        this.listSavedViews200ApplicationJSONObject = listSavedViews200ApplicationJSONObject;
        return this;
    }
    
}
