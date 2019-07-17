# RiotApi.TournamentV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentV4CreateTournamentCode**](TournamentV4Api.md#tournamentV4CreateTournamentCode) | **POST** /lol/tournament/v4/codes | Create a tournament code for the given tournament.
[**tournamentV4GetLobbyEventsByCode**](TournamentV4Api.md#tournamentV4GetLobbyEventsByCode) | **GET** /lol/tournament/v4/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code.
[**tournamentV4GetTournamentCode**](TournamentV4Api.md#tournamentV4GetTournamentCode) | **GET** /lol/tournament/v4/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string.
[**tournamentV4RegisterProviderData**](TournamentV4Api.md#tournamentV4RegisterProviderData) | **POST** /lol/tournament/v4/providers | Creates a tournament provider and returns its ID.
[**tournamentV4RegisterTournament**](TournamentV4Api.md#tournamentV4RegisterTournament) | **POST** /lol/tournament/v4/tournaments | Creates a tournament and returns its ID.
[**tournamentV4UpdateCode**](TournamentV4Api.md#tournamentV4UpdateCode) | **PUT** /lol/tournament/v4/codes/{tournamentCode} | Update the pick type, map, spectator type, or allowed summoners for a code.


<a name="tournamentV4CreateTournamentCode"></a>
# **tournamentV4CreateTournamentCode**
> [&#39;String&#39;] tournamentV4CreateTournamentCode(tournamentId, tournamentCodeParameters, opts)

Create a tournament code for the given tournament.

Create a tournament code for the given tournament.

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

var apiInstance = new RiotApi.TournamentV4Api();

var tournamentId = 789; // Number | The tournament ID

var tournamentCodeParameters = new RiotApi.TournamentV4TournamentCodeParameters(); // TournamentV4TournamentCodeParameters | Metadata for the generated code

var opts = { 
  'count': 56 // Number | The number of codes to create (max 1000)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentV4CreateTournamentCode(tournamentId, tournamentCodeParameters, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **Number**| The tournament ID | 
 **tournamentCodeParameters** | [**TournamentV4TournamentCodeParameters**](TournamentV4TournamentCodeParameters.md)| Metadata for the generated code | 
 **count** | **Number**| The number of codes to create (max 1000) | [optional] 

### Return type

**[&#39;String&#39;]**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4GetLobbyEventsByCode"></a>
# **tournamentV4GetLobbyEventsByCode**
> TournamentV4LobbyEventDTOWrapper tournamentV4GetLobbyEventsByCode(tournamentCode)

Gets a list of lobby events by tournament code.

Gets a list of lobby events by tournament code.

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

var apiInstance = new RiotApi.TournamentV4Api();

var tournamentCode = "tournamentCode_example"; // String | The short code to look up lobby events for


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentV4GetLobbyEventsByCode(tournamentCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The short code to look up lobby events for | 

### Return type

[**TournamentV4LobbyEventDTOWrapper**](TournamentV4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tournamentV4GetTournamentCode"></a>
# **tournamentV4GetTournamentCode**
> TournamentV4TournamentCodeDTO tournamentV4GetTournamentCode(tournamentCode)

Returns the tournament code DTO associated with a tournament code string.

Returns the tournament code DTO associated with a tournament code string.

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

var apiInstance = new RiotApi.TournamentV4Api();

var tournamentCode = "tournamentCode_example"; // String | The tournament code string.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentV4GetTournamentCode(tournamentCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The tournament code string. | 

### Return type

[**TournamentV4TournamentCodeDTO**](TournamentV4TournamentCodeDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tournamentV4RegisterProviderData"></a>
# **tournamentV4RegisterProviderData**
> &#39;Number&#39; tournamentV4RegisterProviderData(providerRegistrationParameters)

Creates a tournament provider and returns its ID.

Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

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

var apiInstance = new RiotApi.TournamentV4Api();

var providerRegistrationParameters = new RiotApi.TournamentV4ProviderRegistrationParameters(); // TournamentV4ProviderRegistrationParameters | The provider definition.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentV4RegisterProviderData(providerRegistrationParameters, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerRegistrationParameters** | [**TournamentV4ProviderRegistrationParameters**](TournamentV4ProviderRegistrationParameters.md)| The provider definition. | 

### Return type

**&#39;Number&#39;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4RegisterTournament"></a>
# **tournamentV4RegisterTournament**
> &#39;Number&#39; tournamentV4RegisterTournament(tournamentRegistrationParameters)

Creates a tournament and returns its ID.

Creates a tournament and returns its ID.

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

var apiInstance = new RiotApi.TournamentV4Api();

var tournamentRegistrationParameters = new RiotApi.TournamentV4TournamentRegistrationParameters(); // TournamentV4TournamentRegistrationParameters | The tournament definition.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentV4RegisterTournament(tournamentRegistrationParameters, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentRegistrationParameters** | [**TournamentV4TournamentRegistrationParameters**](TournamentV4TournamentRegistrationParameters.md)| The tournament definition. | 

### Return type

**&#39;Number&#39;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4UpdateCode"></a>
# **tournamentV4UpdateCode**
> tournamentV4UpdateCode(tournamentCode, opts)

Update the pick type, map, spectator type, or allowed summoners for a code.

Update the pick type, map, spectator type, or allowed summoners for a code.

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

var apiInstance = new RiotApi.TournamentV4Api();

var tournamentCode = "tournamentCode_example"; // String | The tournament code to update

var opts = { 
  'tournamentCodeUpdateParameters': new RiotApi.TournamentV4TournamentCodeUpdateParameters() // TournamentV4TournamentCodeUpdateParameters | The fields to update
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.tournamentV4UpdateCode(tournamentCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The tournament code to update | 
 **tournamentCodeUpdateParameters** | [**TournamentV4TournamentCodeUpdateParameters**](TournamentV4TournamentCodeUpdateParameters.md)| The fields to update | [optional] 

### Return type

null (empty response body)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

