# RiotApi.LeagueV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leagueV4GetChallengerLeague**](LeagueV4Api.md#leagueV4GetChallengerLeague) | **GET** /lol/league/v4/challengerleagues/by-queue/{queue} | Get the challenger league for given queue.
[**leagueV4GetGrandmasterLeague**](LeagueV4Api.md#leagueV4GetGrandmasterLeague) | **GET** /lol/league/v4/grandmasterleagues/by-queue/{queue} | Get the grandmaster league of a specific queue.
[**leagueV4GetLeagueById**](LeagueV4Api.md#leagueV4GetLeagueById) | **GET** /lol/league/v4/leagues/{leagueId} | Get league with given ID, including inactive entries.
[**leagueV4GetLeagueEntries**](LeagueV4Api.md#leagueV4GetLeagueEntries) | **GET** /lol/league/v4/entries/{queue}/{tier}/{division} | Get all the league entries.
[**leagueV4GetLeagueEntriesForSummoner**](LeagueV4Api.md#leagueV4GetLeagueEntriesForSummoner) | **GET** /lol/league/v4/entries/by-summoner/{encryptedSummonerId} | Get league entries in all queues for a given summoner ID.
[**leagueV4GetMasterLeague**](LeagueV4Api.md#leagueV4GetMasterLeague) | **GET** /lol/league/v4/masterleagues/by-queue/{queue} | Get the master league for given queue.


<a name="leagueV4GetChallengerLeague"></a>
# **leagueV4GetChallengerLeague**
> LeagueV4LeagueListDTO leagueV4GetChallengerLeague(queue)

Get the challenger league for given queue.

Get the challenger league for given queue.

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

var apiInstance = new RiotApi.LeagueV4Api();

var queue = "queue_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.leagueV4GetChallengerLeague(queue, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **String**|  | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetGrandmasterLeague"></a>
# **leagueV4GetGrandmasterLeague**
> LeagueV4LeagueListDTO leagueV4GetGrandmasterLeague(queue)

Get the grandmaster league of a specific queue.

Get the grandmaster league of a specific queue.

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

var apiInstance = new RiotApi.LeagueV4Api();

var queue = "queue_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.leagueV4GetGrandmasterLeague(queue, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **String**|  | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetLeagueById"></a>
# **leagueV4GetLeagueById**
> LeagueV4LeagueListDTO leagueV4GetLeagueById(leagueId)

Get league with given ID, including inactive entries.

Get league with given ID, including inactive entries.

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

var apiInstance = new RiotApi.LeagueV4Api();

var leagueId = "leagueId_example"; // String | The UUID of the league.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.leagueV4GetLeagueById(leagueId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leagueId** | **String**| The UUID of the league. | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetLeagueEntries"></a>
# **leagueV4GetLeagueEntries**
> [LeagueV4LeagueEntryDTO] leagueV4GetLeagueEntries(division, tier, queue, opts)

Get all the league entries.

Get all the league entries.

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

var apiInstance = new RiotApi.LeagueV4Api();

var division = "division_example"; // String | 

var tier = "tier_example"; // String | 

var queue = "queue_example"; // String | Note that the queue value must be a valid ranked queue.

var opts = { 
  'page': 56 // Number | Starts with page 1.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.leagueV4GetLeagueEntries(division, tier, queue, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **division** | **String**|  | 
 **tier** | **String**|  | 
 **queue** | **String**| Note that the queue value must be a valid ranked queue. | 
 **page** | **Number**| Starts with page 1. | [optional] 

### Return type

[**[LeagueV4LeagueEntryDTO]**](LeagueV4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetLeagueEntriesForSummoner"></a>
# **leagueV4GetLeagueEntriesForSummoner**
> [LeagueV4LeagueEntryDTO] leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId)

Get league entries in all queues for a given summoner ID.

Get league entries in all queues for a given summoner ID.

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

var apiInstance = new RiotApi.LeagueV4Api();

var encryptedSummonerId = "encryptedSummonerId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedSummonerId** | **String**|  | 

### Return type

[**[LeagueV4LeagueEntryDTO]**](LeagueV4LeagueEntryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leagueV4GetMasterLeague"></a>
# **leagueV4GetMasterLeague**
> LeagueV4LeagueListDTO leagueV4GetMasterLeague(queue)

Get the master league for given queue.

Get the master league for given queue.

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

var apiInstance = new RiotApi.LeagueV4Api();

var queue = "queue_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.leagueV4GetMasterLeague(queue, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queue** | **String**|  | 

### Return type

[**LeagueV4LeagueListDTO**](LeagueV4LeagueListDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

