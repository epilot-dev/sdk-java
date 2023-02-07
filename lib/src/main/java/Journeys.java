package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Journeys {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Journeys(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * createJourney - createJourney
     *
     * Create a Journey
    **/
    public .models.operations.CreateJourneyResponse createJourney(.models.operations.CreateJourneyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/configuration");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.CreateJourneyResponse res = new .models.operations.CreateJourneyResponse() {{
            journeyResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.journeyResponse = out;
            }
        }

        return res;
    }
	
	
    /**
     * getJourney - getJourney
     *
     * Get journey by id
    **/
    public .models.operations.GetJourneyResponse getJourney(.models.operations.GetJourneyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/configuration/{id}", request.pathParams);
        
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

        .models.operations.GetJourneyResponse res = new .models.operations.GetJourneyResponse() {{
            journeyResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.journeyResponse = out;
            }
        }

        return res;
    }
	
	
    /**
     * getJourneysByOrgId - getJourneysByOrgId
     *
     * Get all journeys by organization id
    **/
    public .models.operations.GetJourneysByOrgIdResponse getJourneysByOrgId(.models.operations.GetJourneysByOrgIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/organization/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetJourneysByOrgIdResponse res = new .models.operations.GetJourneysByOrgIdResponse() {{
            getJourneysResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.getJourneysResponse = out;
            }
        }

        return res;
    }
	
	
    /**
     * patchUpdateJourney - patchUpdateJourney
     *
     * Update a Journey (partially / patch). Support for nested properties updates (e.g. "property[0].name").
    **/
    public .models.operations.PatchUpdateJourneyResponse patchUpdateJourney(.models.operations.PatchUpdateJourneyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/configuration");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PatchUpdateJourneyResponse res = new .models.operations.PatchUpdateJourneyResponse() {{
            journeyResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.journeyResponse = out;
            }
        }

        return res;
    }
	
	
    /**
     * removeJourney - removeJourney
     *
     * Remove journey by id
    **/
    public .models.operations.RemoveJourneyResponse removeJourney(.models.operations.RemoveJourneyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/configuration/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.RemoveJourneyResponse res = new .models.operations.RemoveJourneyResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
	
	
    /**
     * searchJourneys - searchJourneys
     *
     * Search Journeys
    **/
    public .models.operations.SearchJourneysResponse searchJourneys(.models.operations.SearchJourneysRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/configuration/search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.SearchJourneysResponse res = new .models.operations.SearchJourneysResponse() {{
            searchJourneysResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.SearchJourneysResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.SearchJourneysResponse.class);
                res.searchJourneysResponse = out;
            }
        }

        return res;
    }
	
	
    /**
     * updateJourney - updateJourney
     *
     * Update a Journey
    **/
    public .models.operations.UpdateJourneyResponse updateJourney(.models.operations.UpdateJourneyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/journey/configuration");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.UpdateJourneyResponse res = new .models.operations.UpdateJourneyResponse() {{
            journeyResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.journeyResponse = out;
            }
        }

        return res;
    }
	
}