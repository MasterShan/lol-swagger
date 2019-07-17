# RiotApi.ThirdPartyCodeV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**thirdPartyCodeV4GetThirdPartyCodeBySummonerId**](ThirdPartyCodeV4Api.md#thirdPartyCodeV4GetThirdPartyCodeBySummonerId) | **GET** /lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId} | Get third party code for a given summoner ID.


<a name="thirdPartyCodeV4GetThirdPartyCodeBySummonerId"></a>
# **thirdPartyCodeV4GetThirdPartyCodeBySummonerId**
> &#39;String&#39; thirdPartyCodeV4GetThirdPartyCodeBySummonerId(encryptedSummonerId)

Get third party code for a given summoner ID.

Get third party code for a given summoner ID.

### Example
```javascript
var RiotApi = require('riot_api');
var defaultClient = RiotApi.ApiClient.instance;

// Configure API key authorization: X-Riot-Token
var X-Riot-Token = defaultClient.authentications['X-Riot-Token'];
X-Riot-Token.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Riot-Token.apiKeyPrefix = 'Token';

// Configure API key authorization: api_key
var api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

var apiInstance = new RiotApi.ThirdPartyCodeV4Api();

var encryptedSummonerId = "encryptedSummonerId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.thirdPartyCodeV4GetThirdPartyCodeBySummonerId(encryptedSummonerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

