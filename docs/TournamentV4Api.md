# TournamentV4Api

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
> List&lt;String&gt; tournamentV4CreateTournamentCode(tournamentId, tournamentCodeParameters, count)

Create a tournament code for the given tournament.

Create a tournament code for the given tournament.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentV4Api;

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

TournamentV4Api apiInstance = new TournamentV4Api();
Long tournamentId = 789L; // Long | The tournament ID
TournamentV4TournamentCodeParameters tournamentCodeParameters = new TournamentV4TournamentCodeParameters(); // TournamentV4TournamentCodeParameters | Metadata for the generated code
Integer count = 56; // Integer | The number of codes to create (max 1000)
try {
    List<String> result = apiInstance.tournamentV4CreateTournamentCode(tournamentId, tournamentCodeParameters, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentV4Api#tournamentV4CreateTournamentCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **Long**| The tournament ID |
 **tournamentCodeParameters** | [**TournamentV4TournamentCodeParameters**](TournamentV4TournamentCodeParameters.md)| Metadata for the generated code |
 **count** | **Integer**| The number of codes to create (max 1000) | [optional]

### Return type

**List&lt;String&gt;**

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentV4Api;

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

TournamentV4Api apiInstance = new TournamentV4Api();
String tournamentCode = "tournamentCode_example"; // String | The short code to look up lobby events for
try {
    TournamentV4LobbyEventDTOWrapper result = apiInstance.tournamentV4GetLobbyEventsByCode(tournamentCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentV4Api#tournamentV4GetLobbyEventsByCode");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentV4Api;

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

TournamentV4Api apiInstance = new TournamentV4Api();
String tournamentCode = "tournamentCode_example"; // String | The tournament code string.
try {
    TournamentV4TournamentCodeDTO result = apiInstance.tournamentV4GetTournamentCode(tournamentCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentV4Api#tournamentV4GetTournamentCode");
    e.printStackTrace();
}
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
> Integer tournamentV4RegisterProviderData(providerRegistrationParameters)

Creates a tournament provider and returns its ID.

Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentV4Api;

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

TournamentV4Api apiInstance = new TournamentV4Api();
TournamentV4ProviderRegistrationParameters providerRegistrationParameters = new TournamentV4ProviderRegistrationParameters(); // TournamentV4ProviderRegistrationParameters | The provider definition.
try {
    Integer result = apiInstance.tournamentV4RegisterProviderData(providerRegistrationParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentV4Api#tournamentV4RegisterProviderData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerRegistrationParameters** | [**TournamentV4ProviderRegistrationParameters**](TournamentV4ProviderRegistrationParameters.md)| The provider definition. |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4RegisterTournament"></a>
# **tournamentV4RegisterTournament**
> Integer tournamentV4RegisterTournament(tournamentRegistrationParameters)

Creates a tournament and returns its ID.

Creates a tournament and returns its ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentV4Api;

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

TournamentV4Api apiInstance = new TournamentV4Api();
TournamentV4TournamentRegistrationParameters tournamentRegistrationParameters = new TournamentV4TournamentRegistrationParameters(); // TournamentV4TournamentRegistrationParameters | The tournament definition.
try {
    Integer result = apiInstance.tournamentV4RegisterTournament(tournamentRegistrationParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentV4Api#tournamentV4RegisterTournament");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentRegistrationParameters** | [**TournamentV4TournamentRegistrationParameters**](TournamentV4TournamentRegistrationParameters.md)| The tournament definition. |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4UpdateCode"></a>
# **tournamentV4UpdateCode**
> tournamentV4UpdateCode(tournamentCode, tournamentCodeUpdateParameters)

Update the pick type, map, spectator type, or allowed summoners for a code.

Update the pick type, map, spectator type, or allowed summoners for a code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentV4Api;

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

TournamentV4Api apiInstance = new TournamentV4Api();
String tournamentCode = "tournamentCode_example"; // String | The tournament code to update
TournamentV4TournamentCodeUpdateParameters tournamentCodeUpdateParameters = new TournamentV4TournamentCodeUpdateParameters(); // TournamentV4TournamentCodeUpdateParameters | The fields to update
try {
    apiInstance.tournamentV4UpdateCode(tournamentCode, tournamentCodeUpdateParameters);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentV4Api#tournamentV4UpdateCode");
    e.printStackTrace();
}
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

