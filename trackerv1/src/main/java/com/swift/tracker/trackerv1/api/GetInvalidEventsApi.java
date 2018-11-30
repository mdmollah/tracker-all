/*
 * Tracker API V1
 * Move your app forward with the gpi API
 */


package com.swift.tracker.trackerv1.api;

import com.swift.tracker.trackerv1.ApiCallback;
import com.swift.tracker.trackerv1.ApiClient;
import com.swift.tracker.trackerv1.ApiException;
import com.swift.tracker.trackerv1.ApiResponse;
import com.swift.tracker.trackerv1.Configuration;
import com.swift.tracker.trackerv1.Pair;
import com.swift.tracker.trackerv1.ProgressRequestBody;
import com.swift.tracker.trackerv1.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.swift.tracker.trackerv1.model.CamtA0500102;
import com.swift.tracker.trackerv1.model.CamtA0500202;
import com.swift.tracker.trackerv1.model.ErrorCode;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetInvalidEventsApi {
    private ApiClient apiClient;

    public GetInvalidEventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GetInvalidEventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInvalidEventsPost
     * @param laUApplicationID ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ (required)
     * @param laURequestNonce a random value generated by the client. Provided with the request and copied by the gpi Connector on the response (required)
     * @param laUSigned service specific HTTP headers (required)
     * @param laUSignature contains the LAU signature, base64 ecoded (required)
     * @param xApiKey An API key given to your application to authenticate against the sandbox URL (required)
     * @param requestBody Payment Event Request (required)
     * @param xRecord A type of API response to get from API Sandbox. A value between 1 and 13 (optional, default to 0)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInvalidEventsPostCall(String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xApiKey, CamtA0500102 requestBody, String xRecord, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/get_invalid_events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (laUApplicationID != null)
        localVarHeaderParams.put("LAUApplicationID", apiClient.parameterToString(laUApplicationID));
        if (laUVersion != null)
        localVarHeaderParams.put("LAUVersion", apiClient.parameterToString(laUVersion));
        if (laUCallTime != null)
        localVarHeaderParams.put("LAUCallTime", apiClient.parameterToString(laUCallTime));
        if (laURequestNonce != null)
        localVarHeaderParams.put("LAURequestNonce", apiClient.parameterToString(laURequestNonce));
        if (laUSigned != null)
        localVarHeaderParams.put("LAUSigned", apiClient.parameterToString(laUSigned));
        if (laUSignature != null)
        localVarHeaderParams.put("LAUSignature", apiClient.parameterToString(laUSignature));
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (xRecord != null)
        localVarHeaderParams.put("x-record", apiClient.parameterToString(xRecord));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInvalidEventsPostValidateBeforeCall(String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xApiKey, CamtA0500102 requestBody, String xRecord, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'laUApplicationID' is set
        if (laUApplicationID == null) {
            throw new ApiException("Missing the required parameter 'laUApplicationID' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'laUVersion' is set
        if (laUVersion == null) {
            throw new ApiException("Missing the required parameter 'laUVersion' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'laUCallTime' is set
        if (laUCallTime == null) {
            throw new ApiException("Missing the required parameter 'laUCallTime' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'laURequestNonce' is set
        if (laURequestNonce == null) {
            throw new ApiException("Missing the required parameter 'laURequestNonce' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'laUSigned' is set
        if (laUSigned == null) {
            throw new ApiException("Missing the required parameter 'laUSigned' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'laUSignature' is set
        if (laUSignature == null) {
            throw new ApiException("Missing the required parameter 'laUSignature' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getInvalidEventsPost(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling getInvalidEventsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = getInvalidEventsPostCall(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Invalid Events
     * This API is a payment events&#39; query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.
     * @param laUApplicationID ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ (required)
     * @param laURequestNonce a random value generated by the client. Provided with the request and copied by the gpi Connector on the response (required)
     * @param laUSigned service specific HTTP headers (required)
     * @param laUSignature contains the LAU signature, base64 ecoded (required)
     * @param xApiKey An API key given to your application to authenticate against the sandbox URL (required)
     * @param requestBody Payment Event Request (required)
     * @param xRecord A type of API response to get from API Sandbox. A value between 1 and 13 (optional, default to 0)
     * @return CamtA0500202
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CamtA0500202 getInvalidEventsPost(String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xApiKey, CamtA0500102 requestBody, String xRecord) throws ApiException {
        ApiResponse<CamtA0500202> resp = getInvalidEventsPostWithHttpInfo(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);
        return resp.getData();
    }

    /**
     * Get Invalid Events
     * This API is a payment events&#39; query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.
     * @param laUApplicationID ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ (required)
     * @param laURequestNonce a random value generated by the client. Provided with the request and copied by the gpi Connector on the response (required)
     * @param laUSigned service specific HTTP headers (required)
     * @param laUSignature contains the LAU signature, base64 ecoded (required)
     * @param xApiKey An API key given to your application to authenticate against the sandbox URL (required)
     * @param requestBody Payment Event Request (required)
     * @param xRecord A type of API response to get from API Sandbox. A value between 1 and 13 (optional, default to 0)
     * @return ApiResponse&lt;CamtA0500202&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CamtA0500202> getInvalidEventsPostWithHttpInfo(String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xApiKey, CamtA0500102 requestBody, String xRecord) throws ApiException {
        com.squareup.okhttp.Call call = getInvalidEventsPostValidateBeforeCall(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord, null, null);
        Type localVarReturnType = new TypeToken<CamtA0500202>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Invalid Events (asynchronously)
     * This API is a payment events&#39; query to get invalid events for payment transactions within a given time frame. An event is either a payment or a status confirmation.
     * @param laUApplicationID ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ (required)
     * @param laURequestNonce a random value generated by the client. Provided with the request and copied by the gpi Connector on the response (required)
     * @param laUSigned service specific HTTP headers (required)
     * @param laUSignature contains the LAU signature, base64 ecoded (required)
     * @param xApiKey An API key given to your application to authenticate against the sandbox URL (required)
     * @param requestBody Payment Event Request (required)
     * @param xRecord A type of API response to get from API Sandbox. A value between 1 and 13 (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInvalidEventsPostAsync(String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xApiKey, CamtA0500102 requestBody, String xRecord, final ApiCallback<CamtA0500202> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInvalidEventsPostValidateBeforeCall(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CamtA0500202>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
