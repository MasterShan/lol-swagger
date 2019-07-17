/*
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdPartyCodeV4Api {
    private ApiClient apiClient;

    public ThirdPartyCodeV4Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ThirdPartyCodeV4Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for thirdPartyCodeV4GetThirdPartyCodeBySummonerId
     * @param encryptedSummonerId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#third-party-code-v4/GET_getThirdPartyCodeBySummonerId">Get third party code for a given summoner ID. Documentation</a>
     */
    public com.squareup.okhttp.Call thirdPartyCodeV4GetThirdPartyCodeBySummonerIdCall(String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId}"
            .replaceAll("\\{" + "encryptedSummonerId" + "\\}", apiClient.escapeString(encryptedSummonerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "X-Riot-Token", "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call thirdPartyCodeV4GetThirdPartyCodeBySummonerIdValidateBeforeCall(String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'encryptedSummonerId' is set
        if (encryptedSummonerId == null) {
            throw new ApiException("Missing the required parameter 'encryptedSummonerId' when calling thirdPartyCodeV4GetThirdPartyCodeBySummonerId(Async)");
        }
        

        com.squareup.okhttp.Call call = thirdPartyCodeV4GetThirdPartyCodeBySummonerIdCall(encryptedSummonerId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get third party code for a given summoner ID.
     * Get third party code for a given summoner ID.
     * @param encryptedSummonerId  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#third-party-code-v4/GET_getThirdPartyCodeBySummonerId">Get third party code for a given summoner ID. Documentation</a>
     */
    public String thirdPartyCodeV4GetThirdPartyCodeBySummonerId(String encryptedSummonerId) throws ApiException {
        ApiResponse<String> resp = thirdPartyCodeV4GetThirdPartyCodeBySummonerIdWithHttpInfo(encryptedSummonerId);
        return resp.getData();
    }

    /**
     * Get third party code for a given summoner ID.
     * Get third party code for a given summoner ID.
     * @param encryptedSummonerId  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#third-party-code-v4/GET_getThirdPartyCodeBySummonerId">Get third party code for a given summoner ID. Documentation</a>
     */
    public ApiResponse<String> thirdPartyCodeV4GetThirdPartyCodeBySummonerIdWithHttpInfo(String encryptedSummonerId) throws ApiException {
        com.squareup.okhttp.Call call = thirdPartyCodeV4GetThirdPartyCodeBySummonerIdValidateBeforeCall(encryptedSummonerId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get third party code for a given summoner ID. (asynchronously)
     * Get third party code for a given summoner ID.
     * @param encryptedSummonerId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#third-party-code-v4/GET_getThirdPartyCodeBySummonerId">Get third party code for a given summoner ID. Documentation</a>
     */
    public com.squareup.okhttp.Call thirdPartyCodeV4GetThirdPartyCodeBySummonerIdAsync(String encryptedSummonerId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = thirdPartyCodeV4GetThirdPartyCodeBySummonerIdValidateBeforeCall(encryptedSummonerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}