# RiotApi.TournamentStubV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentStubV4CreateTournamentCode**](TournamentStubV4Api.md#tournamentStubV4CreateTournamentCode) | **POST** /lol/tournament-stub/v4/codes | Create a mock tournament code for the given tournament.
[**tournamentStubV4GetLobbyEventsByCode**](TournamentStubV4Api.md#tournamentStubV4GetLobbyEventsByCode) | **GET** /lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode} | Gets a mock list of lobby events by tournament code.
[**tournamentStubV4RegisterProviderData**](TournamentStubV4Api.md#tournamentStubV4RegisterProviderData) | **POST** /lol/tournament-stub/v4/providers | Creates a mock tournament provider and returns its ID.
[**tournamentStubV4RegisterTournament**](TournamentStubV4Api.md#tournamentStubV4RegisterTournament) | **POST** /lol/tournament-stub/v4/tournaments | Creates a mock tournament and returns its ID.


<a name="tournamentStubV4CreateTournamentCode"></a>
# **tournamentStubV4CreateTournamentCode**
> [&#39;String&#39;] tournamentStubV4CreateTournamentCode(tournamentId, tournamentCodeParameters, opts)

Create a mock tournament code for the given tournament.

Create a mock tournament code for the given tournament.

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

var apiInstance = new RiotApi.TournamentStubV4Api();

var tournamentId = 789; // Number | The tournament ID

var tournamentCodeParameters = new RiotApi.TournamentStubV4TournamentCodeParameters(); // TournamentStubV4TournamentCodeParameters | Metadata for the generated code

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
apiInstance.tournamentStubV4CreateTournamentCode(tournamentId, tournamentCodeParameters, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **Number**| The tournament ID | 
 **tournamentCodeParameters** | [**TournamentStubV4TournamentCodeParameters**](TournamentStubV4TournamentCodeParameters.md)| Metadata for the generated code | 
 **count** | **Number**| The number of codes to create (max 1000) | [optional] 

### Return type

**[&#39;String&#39;]**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentStubV4GetLobbyEventsByCode"></a>
# **tournamentStubV4GetLobbyEventsByCode**
> TournamentStubV4LobbyEventDTOWrapper tournamentStubV4GetLobbyEventsByCode(tournamentCode)

Gets a mock list of lobby events by tournament code.

Gets a mock list of lobby events by tournament code.

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

var apiInstance = new RiotApi.TournamentStubV4Api();

var tournamentCode = "tournamentCode_example"; // String | The short code to look up lobby events for


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentStubV4GetLobbyEventsByCode(tournamentCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **String**| The short code to look up lobby events for | 

### Return type

[**TournamentStubV4LobbyEventDTOWrapper**](TournamentStubV4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tournamentStubV4RegisterProviderData"></a>
# **tournamentStubV4RegisterProviderData**
> &#39;Number&#39; tournamentStubV4RegisterProviderData(providerRegistrationParameters)

Creates a mock tournament provider and returns its ID.

Creates a mock tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

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

var apiInstance = new RiotApi.TournamentStubV4Api();

var providerRegistrationParameters = new RiotApi.TournamentStubV4ProviderRegistrationParameters(); // TournamentStubV4ProviderRegistrationParameters | The provider definition.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentStubV4RegisterProviderData(providerRegistrationParameters, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerRegistrationParameters** | [**TournamentStubV4ProviderRegistrationParameters**](TournamentStubV4ProviderRegistrationParameters.md)| The provider definition. | 

### Return type

**&#39;Number&#39;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentStubV4RegisterTournament"></a>
# **tournamentStubV4RegisterTournament**
> &#39;Number&#39; tournamentStubV4RegisterTournament(tournamentRegistrationParameters)

Creates a mock tournament and returns its ID.

Creates a mock tournament and returns its ID.

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

var apiInstance = new RiotApi.TournamentStubV4Api();

var tournamentRegistrationParameters = new RiotApi.TournamentStubV4TournamentRegistrationParameters(); // TournamentStubV4TournamentRegistrationParameters | The tournament definition.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.tournamentStubV4RegisterTournament(tournamentRegistrationParameters, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentRegistrationParameters** | [**TournamentStubV4TournamentRegistrationParameters**](TournamentStubV4TournamentRegistrationParameters.md)| The tournament definition. | 

### Return type

**&#39;Number&#39;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

