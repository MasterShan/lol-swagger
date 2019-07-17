# RiotApi.SummonerV4Api

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

var apiInstance = new RiotApi.SummonerV4Api();

var encryptedAccountId = "encryptedAccountId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.summonerV4GetByAccountId(encryptedAccountId, callback);
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

var apiInstance = new RiotApi.SummonerV4Api();

var encryptedPUUID = "encryptedPUUID_example"; // String | Summoner ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.summonerV4GetByPUUID(encryptedPUUID, callback);
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

var apiInstance = new RiotApi.SummonerV4Api();

var encryptedSummonerId = "encryptedSummonerId_example"; // String | Summoner ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.summonerV4GetBySummonerId(encryptedSummonerId, callback);
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

var apiInstance = new RiotApi.SummonerV4Api();

var summonerName = "summonerName_example"; // String | Summoner Name


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.summonerV4GetBySummonerName(summonerName, callback);
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

