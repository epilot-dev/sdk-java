package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import .utils.SerializedBody;
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
    public .models.operations.CreateFlowResponse createFlow(.models.operations.CreateFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/flows");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.CreateFlowResponse res = new .models.operations.CreateFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationFlow.class);
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
    public .models.operations.DeleteFlowResponse deleteFlow(.models.operations.DeleteFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/flows/{flow_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.DeleteFlowResponse res = new .models.operations.DeleteFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationFlow.class);
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
    public .models.operations.GetFlowResponse getFlow(.models.operations.GetFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/flows/{flow_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetFlowResponse res = new .models.operations.GetFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationFlow.class);
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
    public .models.operations.PutFlowResponse putFlow(.models.operations.PutFlowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/flows/{flow_id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutFlowResponse res = new .models.operations.PutFlowResponse() {{
            automationFlow = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.AutomationFlow out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.AutomationFlow.class);
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
    public .models.operations.SearchFlowsResponse searchFlows(.models.operations.SearchFlowsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/v1/automation/flows");
        
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

        .models.operations.SearchFlowsResponse res = new .models.operations.SearchFlowsResponse() {{
            searchAutomationsResp = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.SearchAutomationsResp out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.SearchAutomationsResp.class);
                res.searchAutomationsResp = out;
            }
        }

        return res;
    }
	
}