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


import io.swagger.client.model.ChampionMasteryV4ChampionMasteryDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChampionMasteryV4Api {
    private ApiClient apiClient;

    public ChampionMasteryV4Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ChampionMasteryV4Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for championMasteryV4GetAllChampionMasteries
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getAllChampionMasteries">Get all champion mastery entries sorted by number of champion points descending, Documentation</a>
     */
    public com.squareup.okhttp.Call championMasteryV4GetAllChampionMasteriesCall(String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}"
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
    private com.squareup.okhttp.Call championMasteryV4GetAllChampionMasteriesValidateBeforeCall(String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'encryptedSummonerId' is set
        if (encryptedSummonerId == null) {
            throw new ApiException("Missing the required parameter 'encryptedSummonerId' when calling championMasteryV4GetAllChampionMasteries(Async)");
        }
        

        com.squareup.okhttp.Call call = championMasteryV4GetAllChampionMasteriesCall(encryptedSummonerId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all champion mastery entries sorted by number of champion points descending,
     * Get all champion mastery entries sorted by number of champion points descending,
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @return List&lt;ChampionMasteryV4ChampionMasteryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getAllChampionMasteries">Get all champion mastery entries sorted by number of champion points descending, Documentation</a>
     */
    public List<ChampionMasteryV4ChampionMasteryDTO> championMasteryV4GetAllChampionMasteries(String encryptedSummonerId) throws ApiException {
        ApiResponse<List<ChampionMasteryV4ChampionMasteryDTO>> resp = championMasteryV4GetAllChampionMasteriesWithHttpInfo(encryptedSummonerId);
        return resp.getData();
    }

    /**
     * Get all champion mastery entries sorted by number of champion points descending,
     * Get all champion mastery entries sorted by number of champion points descending,
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @return ApiResponse&lt;List&lt;ChampionMasteryV4ChampionMasteryDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getAllChampionMasteries">Get all champion mastery entries sorted by number of champion points descending, Documentation</a>
     */
    public ApiResponse<List<ChampionMasteryV4ChampionMasteryDTO>> championMasteryV4GetAllChampionMasteriesWithHttpInfo(String encryptedSummonerId) throws ApiException {
        com.squareup.okhttp.Call call = championMasteryV4GetAllChampionMasteriesValidateBeforeCall(encryptedSummonerId, null, null);
        Type localVarReturnType = new TypeToken<List<ChampionMasteryV4ChampionMasteryDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all champion mastery entries sorted by number of champion points descending, (asynchronously)
     * Get all champion mastery entries sorted by number of champion points descending,
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getAllChampionMasteries">Get all champion mastery entries sorted by number of champion points descending, Documentation</a>
     */
    public com.squareup.okhttp.Call championMasteryV4GetAllChampionMasteriesAsync(String encryptedSummonerId, final ApiCallback<List<ChampionMasteryV4ChampionMasteryDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = championMasteryV4GetAllChampionMasteriesValidateBeforeCall(encryptedSummonerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ChampionMasteryV4ChampionMasteryDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for championMasteryV4GetChampionMastery
     * @param championId Champion ID to retrieve Champion Mastery for (required)
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMastery">Get a champion mastery by player ID and champion ID. Documentation</a>
     */
    public com.squareup.okhttp.Call championMasteryV4GetChampionMasteryCall(Long championId, String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId}"
            .replaceAll("\\{" + "championId" + "\\}", apiClient.escapeString(championId.toString()))
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
    private com.squareup.okhttp.Call championMasteryV4GetChampionMasteryValidateBeforeCall(Long championId, String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'championId' is set
        if (championId == null) {
            throw new ApiException("Missing the required parameter 'championId' when calling championMasteryV4GetChampionMastery(Async)");
        }
        
        // verify the required parameter 'encryptedSummonerId' is set
        if (encryptedSummonerId == null) {
            throw new ApiException("Missing the required parameter 'encryptedSummonerId' when calling championMasteryV4GetChampionMastery(Async)");
        }
        

        com.squareup.okhttp.Call call = championMasteryV4GetChampionMasteryCall(championId, encryptedSummonerId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a champion mastery by player ID and champion ID.
     * Get a champion mastery by player ID and champion ID.
     * @param championId Champion ID to retrieve Champion Mastery for (required)
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @return ChampionMasteryV4ChampionMasteryDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMastery">Get a champion mastery by player ID and champion ID. Documentation</a>
     */
    public ChampionMasteryV4ChampionMasteryDTO championMasteryV4GetChampionMastery(Long championId, String encryptedSummonerId) throws ApiException {
        ApiResponse<ChampionMasteryV4ChampionMasteryDTO> resp = championMasteryV4GetChampionMasteryWithHttpInfo(championId, encryptedSummonerId);
        return resp.getData();
    }

    /**
     * Get a champion mastery by player ID and champion ID.
     * Get a champion mastery by player ID and champion ID.
     * @param championId Champion ID to retrieve Champion Mastery for (required)
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @return ApiResponse&lt;ChampionMasteryV4ChampionMasteryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMastery">Get a champion mastery by player ID and champion ID. Documentation</a>
     */
    public ApiResponse<ChampionMasteryV4ChampionMasteryDTO> championMasteryV4GetChampionMasteryWithHttpInfo(Long championId, String encryptedSummonerId) throws ApiException {
        com.squareup.okhttp.Call call = championMasteryV4GetChampionMasteryValidateBeforeCall(championId, encryptedSummonerId, null, null);
        Type localVarReturnType = new TypeToken<ChampionMasteryV4ChampionMasteryDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a champion mastery by player ID and champion ID. (asynchronously)
     * Get a champion mastery by player ID and champion ID.
     * @param championId Champion ID to retrieve Champion Mastery for (required)
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMastery">Get a champion mastery by player ID and champion ID. Documentation</a>
     */
    public com.squareup.okhttp.Call championMasteryV4GetChampionMasteryAsync(Long championId, String encryptedSummonerId, final ApiCallback<ChampionMasteryV4ChampionMasteryDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = championMasteryV4GetChampionMasteryValidateBeforeCall(championId, encryptedSummonerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChampionMasteryV4ChampionMasteryDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for championMasteryV4GetChampionMasteryScore
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMasteryScore">Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels. Documentation</a>
     */
    public com.squareup.okhttp.Call championMasteryV4GetChampionMasteryScoreCall(String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId}"
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
    private com.squareup.okhttp.Call championMasteryV4GetChampionMasteryScoreValidateBeforeCall(String encryptedSummonerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'encryptedSummonerId' is set
        if (encryptedSummonerId == null) {
            throw new ApiException("Missing the required parameter 'encryptedSummonerId' when calling championMasteryV4GetChampionMasteryScore(Async)");
        }
        

        com.squareup.okhttp.Call call = championMasteryV4GetChampionMasteryScoreCall(encryptedSummonerId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.
     * Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @return Integer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMasteryScore">Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels. Documentation</a>
     */
    public Integer championMasteryV4GetChampionMasteryScore(String encryptedSummonerId) throws ApiException {
        ApiResponse<Integer> resp = championMasteryV4GetChampionMasteryScoreWithHttpInfo(encryptedSummonerId);
        return resp.getData();
    }

    /**
     * Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.
     * Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @return ApiResponse&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMasteryScore">Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels. Documentation</a>
     */
    public ApiResponse<Integer> championMasteryV4GetChampionMasteryScoreWithHttpInfo(String encryptedSummonerId) throws ApiException {
        com.squareup.okhttp.Call call = championMasteryV4GetChampionMasteryScoreValidateBeforeCall(encryptedSummonerId, null, null);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels. (asynchronously)
     * Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.
     * @param encryptedSummonerId Summoner ID associated with the player (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * Official API Reference
     * @see <a href="https://developer.riotgames.com/api-methods/#champion-mastery-v4/GET_getChampionMasteryScore">Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels. Documentation</a>
     */
    public com.squareup.okhttp.Call championMasteryV4GetChampionMasteryScoreAsync(String encryptedSummonerId, final ApiCallback<Integer> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = championMasteryV4GetChampionMasteryScoreValidateBeforeCall(encryptedSummonerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Integer>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
