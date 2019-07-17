# ChampionV3Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championV3GetChampionInfo**](ChampionV3Api.md#championV3GetChampionInfo) | **GET** /lol/platform/v3/champion-rotations | Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)


<a name="championV3GetChampionInfo"></a>
# **championV3GetChampionInfo**
> ChampionV3ChampionInfo championV3GetChampionInfo()

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChampionV3Api;

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

ChampionV3Api apiInstance = new ChampionV3Api();
try {
    ChampionV3ChampionInfo result = apiInstance.championV3GetChampionInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChampionV3Api#championV3GetChampionInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChampionV3ChampionInfo**](ChampionV3ChampionInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

