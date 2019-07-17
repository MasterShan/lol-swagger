# TournamentStubV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentStubV4CreateTournamentCode**](TournamentStubV4Api.md#tournamentStubV4CreateTournamentCode) | **POST** /lol/tournament-stub/v4/codes | Create a mock tournament code for the given tournament.
[**tournamentStubV4GetLobbyEventsByCode**](TournamentStubV4Api.md#tournamentStubV4GetLobbyEventsByCode) | **GET** /lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode} | Gets a mock list of lobby events by tournament code.
[**tournamentStubV4RegisterProviderData**](TournamentStubV4Api.md#tournamentStubV4RegisterProviderData) | **POST** /lol/tournament-stub/v4/providers | Creates a mock tournament provider and returns its ID.
[**tournamentStubV4RegisterTournament**](TournamentStubV4Api.md#tournamentStubV4RegisterTournament) | **POST** /lol/tournament-stub/v4/tournaments | Creates a mock tournament and returns its ID.


<a name="tournamentStubV4CreateTournamentCode"></a>
# **tournamentStubV4CreateTournamentCode**
> List&lt;String&gt; tournamentStubV4CreateTournamentCode(tournamentId, tournamentCodeParameters, count)

Create a mock tournament code for the given tournament.

Create a mock tournament code for the given tournament.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentStubV4Api;

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

TournamentStubV4Api apiInstance = new TournamentStubV4Api();
Long tournamentId = 789L; // Long | The tournament ID
TournamentStubV4TournamentCodeParameters tournamentCodeParameters = new TournamentStubV4TournamentCodeParameters(); // TournamentStubV4TournamentCodeParameters | Metadata for the generated code
Integer count = 56; // Integer | The number of codes to create (max 1000)
try {
    List<String> result = apiInstance.tournamentStubV4CreateTournamentCode(tournamentId, tournamentCodeParameters, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentStubV4Api#tournamentStubV4CreateTournamentCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **Long**| The tournament ID |
 **tournamentCodeParameters** | [**TournamentStubV4TournamentCodeParameters**](TournamentStubV4TournamentCodeParameters.md)| Metadata for the generated code |
 **count** | **Integer**| The number of codes to create (max 1000) | [optional]

### Return type

**List&lt;String&gt;**

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentStubV4Api;

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

TournamentStubV4Api apiInstance = new TournamentStubV4Api();
String tournamentCode = "tournamentCode_example"; // String | The short code to look up lobby events for
try {
    TournamentStubV4LobbyEventDTOWrapper result = apiInstance.tournamentStubV4GetLobbyEventsByCode(tournamentCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentStubV4Api#tournamentStubV4GetLobbyEventsByCode");
    e.printStackTrace();
}
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
> Integer tournamentStubV4RegisterProviderData(providerRegistrationParameters)

Creates a mock tournament provider and returns its ID.

Creates a mock tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentStubV4Api;

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

TournamentStubV4Api apiInstance = new TournamentStubV4Api();
TournamentStubV4ProviderRegistrationParameters providerRegistrationParameters = new TournamentStubV4ProviderRegistrationParameters(); // TournamentStubV4ProviderRegistrationParameters | The provider definition.
try {
    Integer result = apiInstance.tournamentStubV4RegisterProviderData(providerRegistrationParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentStubV4Api#tournamentStubV4RegisterProviderData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerRegistrationParameters** | [**TournamentStubV4ProviderRegistrationParameters**](TournamentStubV4ProviderRegistrationParameters.md)| The provider definition. |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentStubV4RegisterTournament"></a>
# **tournamentStubV4RegisterTournament**
> Integer tournamentStubV4RegisterTournament(tournamentRegistrationParameters)

Creates a mock tournament and returns its ID.

Creates a mock tournament and returns its ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TournamentStubV4Api;

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

TournamentStubV4Api apiInstance = new TournamentStubV4Api();
TournamentStubV4TournamentRegistrationParameters tournamentRegistrationParameters = new TournamentStubV4TournamentRegistrationParameters(); // TournamentStubV4TournamentRegistrationParameters | The tournament definition.
try {
    Integer result = apiInstance.tournamentStubV4RegisterTournament(tournamentRegistrationParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TournamentStubV4Api#tournamentStubV4RegisterTournament");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentRegistrationParameters** | [**TournamentStubV4TournamentRegistrationParameters**](TournamentStubV4TournamentRegistrationParameters.md)| The tournament definition. |

### Return type

**Integer**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

