# LolStatusV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lolStatusV3GetShardData**](LolStatusV3Api.md#lolStatusV3GetShardData) | **GET** /lol/status/v3/shard-data | Get League of Legends status for the given shard.


<a name="lolStatusV3GetShardData"></a>
# **lolStatusV3GetShardData**
> LolStatusV3ShardStatus lolStatusV3GetShardData()

Get League of Legends status for the given shard.

Get League of Legends status for the given shard. ## Rate Limit Notes Requests to this API are not counted against the application Rate Limits.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LolStatusV3Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Riot-Token
ApiKeyAuth X-Riot-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Riot-Token");
X-Riot-Token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

LolStatusV3Api apiInstance = new LolStatusV3Api();
try {
    LolStatusV3ShardStatus result = apiInstance.lolStatusV3GetShardData();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LolStatusV3Api#lolStatusV3GetShardData");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LolStatusV3ShardStatus**](LolStatusV3ShardStatus.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

