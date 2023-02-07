package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Taxonomy {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Taxonomy(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getTaxonomy - getTaxonomy
     *
     * Get taxonomy by slug
    **/
    public .models.operations.GetTaxonomyResponse getTaxonomy(.models.operations.GetTaxonomyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/{taxonomySlug}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetTaxonomyResponse res = new .models.operations.GetTaxonomyResponse() {{
            taxonomy = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.Taxonomy out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.Taxonomy.class);
                res.taxonomy = out;
            }
        }

        return res;
    }
	
	
    /**
     * listTaxonomies - listTaxonomies
     *
     * List taxonomies in an organisation
    **/
    public .models.operations.ListTaxonomiesResponse listTaxonomies() throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/listTaxonomies");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.ListTaxonomiesResponse res = new .models.operations.ListTaxonomiesResponse() {{
            listTaxonomies200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.ListTaxonomies200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.ListTaxonomies200ApplicationJson.class);
                res.listTaxonomies200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * taxonomiesClassificationsSearch - taxonomiesClassificationsSearch
     *
     * List taxonomy classifications in an organisation based on taxonomy slug
    **/
    public .models.operations.TaxonomiesClassificationsSearchResponse taxonomiesClassificationsSearch(.models.operations.TaxonomiesClassificationsSearchRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/classifications:search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.TaxonomiesClassificationsSearchResponse res = new .models.operations.TaxonomiesClassificationsSearchResponse() {{
            taxonomiesClassificationsSearch200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.TaxonomiesClassificationsSearch200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.TaxonomiesClassificationsSearch200ApplicationJson.class);
                res.taxonomiesClassificationsSearch200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * taxonomyAutocomplete - taxonomyAutocomplete
     *
     * Taxonomies autocomplete
    **/
    public .models.operations.TaxonomyAutocompleteResponse taxonomyAutocomplete(.models.operations.TaxonomyAutocompleteRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/{taxonomySlug}:autocomplete", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.TaxonomyAutocompleteResponse res = new .models.operations.TaxonomyAutocompleteResponse() {{
            taxonomyAutocomplete200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.TaxonomyAutocomplete200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.TaxonomyAutocomplete200ApplicationJson.class);
                res.taxonomyAutocomplete200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * updateClassificationsForTaxonomy - updateClassificationsForTaxonomy
     *
     * Update taxonomies in an organisation based in taxonomy slug
    **/
    public .models.operations.UpdateClassificationsForTaxonomyResponse updateClassificationsForTaxonomy(.models.operations.UpdateClassificationsForTaxonomyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/taxonomies/{taxonomySlug}/classifications", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.UpdateClassificationsForTaxonomyResponse res = new .models.operations.UpdateClassificationsForTaxonomyResponse() {{
            updateClassificationsForTaxonomy200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.UpdateClassificationsForTaxonomy200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.UpdateClassificationsForTaxonomy200ApplicationJson.class);
                res.updateClassificationsForTaxonomy200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
}