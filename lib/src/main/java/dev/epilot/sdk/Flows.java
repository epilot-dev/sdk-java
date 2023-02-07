package dev.epilot.sdk;

import dev.epilot.sdk.utils.HTTPClient;
import dev.epilot.sdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import dev.epilot.sdk.utils.SerializedBody;
import org.apache.http.NameValuePair;

public class Flows {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Flows(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * createFlow - createFlow
     *
     * Create new automation flow
    **/
    public dev.epilot.sdk.models.operations.CreateFlowResponse createFlow(dev.epilot.sdk.models.operations.CreateFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/flows");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.CreateFlowResponse res = new dev.epilot.sdk.models.operations.CreateFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationFlow.class);
                res.automationFlow = out;
            }
        }

        return res;
    }
	
	
    /**
     * deleteFlow - deleteFlow
     *
     * Update automation flow by id
    **/
    public dev.epilot.sdk.models.operations.DeleteFlowResponse deleteFlow(dev.epilot.sdk.models.operations.DeleteFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/flows/{flow_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.DeleteFlowResponse res = new dev.epilot.sdk.models.operations.DeleteFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationFlow.class);
                res.automationFlow = out;
            }
        }

        return res;
    }
	
	
    /**
     * getFlow - getFlow
     *
     * List available automation flows
    **/
    public dev.epilot.sdk.models.operations.GetFlowResponse getFlow(dev.epilot.sdk.models.operations.GetFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/flows/{flow_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.GetFlowResponse res = new dev.epilot.sdk.models.operations.GetFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationFlow.class);
                res.automationFlow = out;
            }
        }

        return res;
    }
	
	
    /**
     * putFlow - putFlow
     *
     * Update automation flow by id
    **/
    public dev.epilot.sdk.models.operations.PutFlowResponse putFlow(dev.epilot.sdk.models.operations.PutFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/flows/{flow_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.epilot.sdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.epilot.sdk.models.operations.PutFlowResponse res = new dev.epilot.sdk.models.operations.PutFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.AutomationFlow.class);
                res.automationFlow = out;
            }
        }

        return res;
    }
	
	
    /**
     * searchFlows - searchFlows
     *
     * Search available automation flows
    **/
    public dev.epilot.sdk.models.operations.SearchFlowsResponse searchFlows(dev.epilot.sdk.models.operations.SearchFlowsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.epilot.sdk.utils.Utils.generateURL(baseUrl, "/v1/automation/flows");
        
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

        dev.epilot.sdk.models.operations.SearchFlowsResponse res = new dev.epilot.sdk.models.operations.SearchFlowsResponse() {{
            searchAutomationsResp = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.epilot.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.epilot.sdk.models.shared.SearchAutomationsResp out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.epilot.sdk.models.shared.SearchAutomationsResp.class);
                res.searchAutomationsResp = out;
            }
        }

        return res;
    }
	
}