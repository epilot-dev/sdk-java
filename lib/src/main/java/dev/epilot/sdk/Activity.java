package dev.epilot.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.epilot.sdk.utils.HTTPClient;
import dev.epilot.sdk.utils.HTTPRequest;
import dev.epilot.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
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
    public dev.epilot.sdk.models.operations.AttachActivityResponse attachActivity(dev.epilot.sdk.models.operations.AttachActivityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/activity/{id}:attach", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = dev.epilot.sdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.AttachActivityResponse res = new dev.epilot.sdk.models.operations.AttachActivityResponse() {{
            activityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.ActivityItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.ActivityItem.class);
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
    public dev.epilot.sdk.models.operations.CreateActivityResponse createActivity(dev.epilot.sdk.models.operations.CreateActivityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/activity");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = dev.epilot.sdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.CreateActivityResponse res = new dev.epilot.sdk.models.operations.CreateActivityResponse() {{
            activityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.ActivityItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.ActivityItem.class);
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
    public dev.epilot.sdk.models.operations.GetActivityResponse getActivity(dev.epilot.sdk.models.operations.GetActivityRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/activity/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = dev.epilot.sdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.GetActivityResponse res = new dev.epilot.sdk.models.operations.GetActivityResponse() {{
            activityItem = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.ActivityItem out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.ActivityItem.class);
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
    public dev.epilot.sdk.models.operations.GetEntityActivityFeedResponse getEntityActivityFeed(dev.epilot.sdk.models.operations.GetEntityActivityFeedRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/entity/{slug}/{id}/activity", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = dev.epilot.sdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.GetEntityActivityFeedResponse res = new dev.epilot.sdk.models.operations.GetEntityActivityFeedResponse() {{
            getEntityActivityFeed200ApplicationJSONObject = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.operations.GetEntityActivityFeed200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.operations.GetEntityActivityFeed200ApplicationJSON.class);
                res.getEntityActivityFeed200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}