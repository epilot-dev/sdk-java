package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Activity {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Activity(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * attachActivity - attachActivity
     *
     * Attach existing activity to entity activity feeds
    **/
    public .models.operations.AttachActivityResponse attachActivity(.models.operations.AttachActivityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/activity/{id}:attach", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
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

        .models.operations.AttachActivityResponse res = new .models.operations.AttachActivityResponse() {{
            activityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ActivityItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ActivityItem.class);
                res.activityItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * createActivity - createActivity
     *
     * Create an activity that can be displayed in activity feeds.
     * 
     * - All activites are published as events on the event bus
     * - Entity mutations are always part of an activity
     * 
    **/
    public .models.operations.CreateActivityResponse createActivity(.models.operations.CreateActivityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/activity");
        
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

        .models.operations.CreateActivityResponse res = new .models.operations.CreateActivityResponse() {{
            activityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ActivityItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ActivityItem.class);
                res.activityItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * getActivity - getActivity
     *
     * Get activity by id
    **/
    public .models.operations.GetActivityResponse getActivity(.models.operations.GetActivityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/activity/{id}", request.pathParams);
        
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

        .models.operations.GetActivityResponse res = new .models.operations.GetActivityResponse() {{
            activityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ActivityItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ActivityItem.class);
                res.activityItem = out;
            }
        }

        return res;
    }
	
	
    /**
     * getEntityActivityFeed - getEntityActivityFeed
     *
     * Get activity feed for an entity
     * 
    **/
    public .models.operations.GetEntityActivityFeedResponse getEntityActivityFeed(.models.operations.GetEntityActivityFeedRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}/activity", request.pathParams);
        
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

        .models.operations.GetEntityActivityFeedResponse res = new .models.operations.GetEntityActivityFeedResponse() {{
            getEntityActivityFeed200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.operations.GetEntityActivityFeed200ApplicationJson out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.operations.GetEntityActivityFeed200ApplicationJson.class);
                res.getEntityActivityFeed200ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
}