package .models.operations;


public class ListSavedViewsResponse {
    public String contentType;
    public ListSavedViewsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public ListSavedViewsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public ListSavedViews200ApplicationJson listSavedViews200ApplicationJSONObject;
    public ListSavedViewsResponse withListSavedViews200ApplicationJsonObject(ListSavedViews200ApplicationJson listSavedViews200ApplicationJSONObject) {
        this.listSavedViews200ApplicationJSONObject = listSavedViews200ApplicationJSONObject;
        return this;
    }
}