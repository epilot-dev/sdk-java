package .models.operations;


public class TaxonomiesClassificationsSearchResponse {
    public String contentType;
    public TaxonomiesClassificationsSearchResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public TaxonomiesClassificationsSearchResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public TaxonomiesClassificationsSearch200ApplicationJson taxonomiesClassificationsSearch200ApplicationJSONObject;
    public TaxonomiesClassificationsSearchResponse withTaxonomiesClassificationsSearch200ApplicationJsonObject(TaxonomiesClassificationsSearch200ApplicationJson taxonomiesClassificationsSearch200ApplicationJSONObject) {
        this.taxonomiesClassificationsSearch200ApplicationJSONObject = taxonomiesClassificationsSearch200ApplicationJSONObject;
        return this;
    }
}