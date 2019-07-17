# ThirdPartyCodeV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**thirdPartyCodeV4GetThirdPartyCodeBySummonerId**](ThirdPartyCodeV4Api.md#thirdPartyCodeV4GetThirdPartyCodeBySummonerId) | **GET** /lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId} | Get third party code for a given summoner ID.


<a name="thirdPartyCodeV4GetThirdPartyCodeBySummonerId"></a>
# **thirdPartyCodeV4GetThirdPartyCodeBySummonerId**
> String thirdPartyCodeV4GetThirdPartyCodeBySummonerId(encryptedSummonerId)

Get third party code for a given summoner ID.

Get third party code for a given summoner ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ThirdPartyCodeV4Api;

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

ThirdPartyCodeV4Api apiInstance = new ThirdPartyCodeV4Api();
String encryptedSummonerId = "encryptedSummonerId_example"; // String | 
try {
    String result = apiInstance.thirdPartyCodeV4GetThirdPartyCodeBySummonerId(encryptedSummonerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThirdPartyCodeV4Api#thirdPartyCodeV4GetThirdPartyCodeBySummonerId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**|  |

### Return type

**String**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

