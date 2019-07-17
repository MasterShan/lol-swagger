# RiotApi.MatchV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matchV4GetMatch**](MatchV4Api.md#matchV4GetMatch) | **GET** /lol/match/v4/matches/{matchId} | Get match by match ID.
[**matchV4GetMatchByTournamentCode**](MatchV4Api.md#matchV4GetMatchByTournamentCode) | **GET** /lol/match/v4/matches/{matchId}/by-tournament-code/{tournamentCode} | Get match by match ID and tournament code.
[**matchV4GetMatchIdsByTournamentCode**](MatchV4Api.md#matchV4GetMatchIdsByTournamentCode) | **GET** /lol/match/v4/matches/by-tournament-code/{tournamentCode}/ids | Get match IDs by tournament code.
[**matchV4GetMatchTimeline**](MatchV4Api.md#matchV4GetMatchTimeline) | **GET** /lol/match/v4/timelines/by-match/{matchId} | Get match timeline by match ID.
[**matchV4GetMatchlist**](MatchV4Api.md#matchV4GetMatchlist) | **GET** /lol/match/v4/matchlists/by-account/{encryptedAccountId} | Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.


<a name="matchV4GetMatch"></a>
# **matchV4GetMatch**
> MatchV4MatchDto matchV4GetMatch(matchId)

Get match by match ID.

Get match by match ID.

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

var apiInstance = new RiotApi.MatchV4Api();

var matchId = 789; // Number | The match ID.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.matchV4GetMatch(matchId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Number**| The match ID. | 

### Return type

[**MatchV4MatchDto**](MatchV4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchByTournamentCode"></a>
# **matchV4GetMatchByTournamentCode**
> MatchV4MatchDto matchV4GetMatchByTournamentCode(tournamentCode, matchId)

Get match by match ID and tournament code.

Get match by match ID and tournament code.

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

var apiInstance = new RiotApi.MatchV4Api();

var tournamentCode = "tournamentCode_example"; // String | The tournament code.

var matchId = 789; // Number | The match ID.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.matchV4GetMatchByTournamentCode(tournamentCode, matchId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The tournament code. | 
 **matchId** | **Number**| The match ID. | 

### Return type

[**MatchV4MatchDto**](MatchV4MatchDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchIdsByTournamentCode"></a>
# **matchV4GetMatchIdsByTournamentCode**
> [&#39;Number&#39;] matchV4GetMatchIdsByTournamentCode(tournamentCode)

Get match IDs by tournament code.

Get match IDs by tournament code.

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

var apiInstance = new RiotApi.MatchV4Api();

var tournamentCode = "tournamentCode_example"; // String | The tournament code.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.matchV4GetMatchIdsByTournamentCode(tournamentCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The tournament code. | 

### Return type

**[&#39;Number&#39;]**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchTimeline"></a>
# **matchV4GetMatchTimeline**
> MatchV4MatchTimelineDto matchV4GetMatchTimeline(matchId)

Get match timeline by match ID.

Get match timeline by match ID. ## Implementation Notes Not all matches have timeline data.

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

var apiInstance = new RiotApi.MatchV4Api();

var matchId = 789; // Number | The match ID.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.matchV4GetMatchTimeline(matchId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **Number**| The match ID. | 

### Return type

[**MatchV4MatchTimelineDto**](MatchV4MatchTimelineDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchV4GetMatchlist"></a>
# **matchV4GetMatchlist**
> MatchV4MatchlistDto matchV4GetMatchlist(encryptedAccountId, opts)

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.

Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any. ## Implementation Notes A number of optional parameters are provided for filtering. It is up to the caller to ensure that the combination of filter parameters provided is valid for the requested account, otherwise, no matches may be returned.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.  If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.

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

var apiInstance = new RiotApi.MatchV4Api();

var encryptedAccountId = "encryptedAccountId_example"; // String | The account ID.

var opts = { 
  'champion': [3.4], // [Number] | Set of champion IDs for filtering the matchlist.
  'queue': [3.4], // [Number] | Set of queue IDs for filtering the matchlist.
  'season': [3.4], // [Number] | Set of season IDs for filtering the matchlist.
  'endTime': 789, // Number | The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.
  'beginTime': 789, // Number | The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account's match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned.
  'endIndex': 56, // Number | The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.
  'beginIndex': 56 // Number | The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.matchV4GetMatchlist(encryptedAccountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encryptedAccountId** | **String**| The account ID. | 
 **champion** | [**[Number]**](Number.md)| Set of champion IDs for filtering the matchlist. | [optional] 
 **queue** | [**[Number]**](Number.md)| Set of queue IDs for filtering the matchlist. | [optional] 
 **season** | [**[Number]**](Number.md)| Set of season IDs for filtering the matchlist. | [optional] 
 **endTime** | **Number**| The end time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional] 
 **beginTime** | **Number**| The begin time to use for filtering matchlist specified as epoch milliseconds. If beginTime is specified, but not endTime, then endTime defaults to the the current unix timestamp in milliseconds (the maximum time range limitation is not observed in this specific case). If endTime is specified, but not beginTime, then beginTime defaults to the start of the account&#39;s match history returning a 400 due to the maximum time range limitation. If both are specified, then endTime should be greater than beginTime. The maximum time range allowed is one week, otherwise a 400 error code is returned. | [optional] 
 **endIndex** | **Number**| The end index to use for filtering matchlist. If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional] 
 **beginIndex** | **Number**| The begin index to use for filtering matchlist.  If beginIndex is specified, but not endIndex, then endIndex defaults to beginIndex+100. If endIndex is specified, but not beginIndex, then beginIndex defaults to 0. If both are specified, then endIndex must be greater than beginIndex. The maximum range allowed is 100, otherwise a 400 error code is returned. | [optional] 

### Return type

[**MatchV4MatchlistDto**](MatchV4MatchlistDto.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

