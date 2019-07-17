# SummonerV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**summonerV4GetByAccountId**](SummonerV4Api.md#summonerV4GetByAccountId) | **GET** /lol/summoner/v4/summoners/by-account/{encryptedAccountId} | Get a summoner by account ID.
[**summonerV4GetByPUUID**](SummonerV4Api.md#summonerV4GetByPUUID) | **GET** /lol/summoner/v4/summoners/by-puuid/{encryptedPUUID} | Get a summoner by PUUID.
[**summonerV4GetBySummonerId**](SummonerV4Api.md#summonerV4GetBySummonerId) | **GET** /lol/summoner/v4/summoners/{encryptedSummonerId} | Get a summoner by summoner ID.
[**summonerV4GetBySummonerName**](SummonerV4Api.md#summonerV4GetBySummonerName) | **GET** /lol/summoner/v4/summoners/by-name/{summonerName} | Get a summoner by summoner name.


<a name="summonerV4GetByAccountId"></a>
# **summonerV4GetByAccountId**
> SummonerV4SummonerDTO summonerV4GetByAccountId(encryptedAccountId)

Get a summoner by account ID.

Get a summoner by account ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SummonerV4Api;

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

SummonerV4Api apiInstance = new SummonerV4Api();
String encryptedAccountId = "encryptedAccountId_example"; // String | 
try {
    SummonerV4SummonerDTO result = apiInstance.summonerV4GetByAccountId(encryptedAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SummonerV4Api#summonerV4GetByAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedAccountId** | **String**|  |

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="summonerV4GetByPUUID"></a>
# **summonerV4GetByPUUID**
> SummonerV4SummonerDTO summonerV4GetByPUUID(encryptedPUUID)

Get a summoner by PUUID.

Get a summoner by PUUID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SummonerV4Api;

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

SummonerV4Api apiInstance = new SummonerV4Api();
String encryptedPUUID = "encryptedPUUID_example"; // String | Summoner ID
try {
    SummonerV4SummonerDTO result = apiInstance.summonerV4GetByPUUID(encryptedPUUID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SummonerV4Api#summonerV4GetByPUUID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedPUUID** | **String**| Summoner ID |

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="summonerV4GetBySummonerId"></a>
# **summonerV4GetBySummonerId**
> SummonerV4SummonerDTO summonerV4GetBySummonerId(encryptedSummonerId)

Get a summoner by summoner ID.

Get a summoner by summoner ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SummonerV4Api;

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

SummonerV4Api apiInstance = new SummonerV4Api();
String encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID
try {
    SummonerV4SummonerDTO result = apiInstance.summonerV4GetBySummonerId(encryptedSummonerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SummonerV4Api#summonerV4GetBySummonerId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**| Summoner ID |

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="summonerV4GetBySummonerName"></a>
# **summonerV4GetBySummonerName**
> SummonerV4SummonerDTO summonerV4GetBySummonerName(summonerName)

Get a summoner by summoner name.

Get a summoner by summoner name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SummonerV4Api;

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

SummonerV4Api apiInstance = new SummonerV4Api();
String summonerName = "summonerName_example"; // String | Summoner Name
try {
    SummonerV4SummonerDTO result = apiInstance.summonerV4GetBySummonerName(summonerName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SummonerV4Api#summonerV4GetBySummonerName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **summonerName** | **String**| Summoner Name |

### Return type

[**SummonerV4SummonerDTO**](SummonerV4SummonerDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

