package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;

public class SavedViews {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public SavedViews(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * createSavedView - createSavedView
     *
     * Creates a new saved view
    **/
    public .models.operations.CreateSavedViewResponse createSavedView(.models.operations.CreateSavedViewRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/view");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.CreateSavedViewResponse res = new .models.operations.CreateSavedViewResponse() {{
            savedViewItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.SavedViewItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.SavedViewItem.class);
                res.savedViewItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * deleteSavedView - deleteSavedView
     *
     * Deletes a saved view
    **/
    public .models.operations.DeleteSavedViewResponse deleteSavedView(.models.operations.DeleteSavedViewRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/view/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteSavedViewResponse res = new .models.operations.DeleteSavedViewResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
	
	
    /**
     * getSavedView - getSavedView
     *
     * Gets Saved View configuration by id.
    **/
    public .models.operations.GetSavedViewResponse getSavedView(.models.operations.GetSavedViewRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/view/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetSavedViewResponse res = new .models.operations.GetSavedViewResponse() {{
            getSavedView200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.GetSavedView200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.GetSavedView200ApplicationJson.class);
                res.getSavedView200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * listSavedViews - listSavedViews
     *
     * Get the Saved Views based on the schema
    **/
    public .models.operations.ListSavedViewsResponse listSavedViews() throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/views");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.ListSavedViewsResponse res = new .models.operations.ListSavedViewsResponse() {{
            listSavedViews200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.ListSavedViews200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.ListSavedViews200ApplicationJson.class);
                res.listSavedViews200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
	
    /**
     * updateSavedView - updateSavedView
     *
     * Updates a saved view
    **/
    public .models.operations.UpdateSavedViewResponse updateSavedView(.models.operations.UpdateSavedViewRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/view/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.UpdateSavedViewResponse res = new .models.operations.UpdateSavedViewResponse() {{
            savedViewItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.SavedViewItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.SavedViewItem.class);
                res.savedViewItem = out;
            }
        }

        return res;
    }
	
}