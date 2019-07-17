# TournamentV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentV4.createTournamentCode**](TournamentV4Api.md#tournamentV4.createTournamentCode) | **POST** /lol/tournament/v4/codes | Create a tournament code for the given tournament.
[**tournamentV4.getLobbyEventsByCode**](TournamentV4Api.md#tournamentV4.getLobbyEventsByCode) | **GET** /lol/tournament/v4/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code.
[**tournamentV4.getTournamentCode**](TournamentV4Api.md#tournamentV4.getTournamentCode) | **GET** /lol/tournament/v4/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string.
[**tournamentV4.registerProviderData**](TournamentV4Api.md#tournamentV4.registerProviderData) | **POST** /lol/tournament/v4/providers | Creates a tournament provider and returns its ID.
[**tournamentV4.registerTournament**](TournamentV4Api.md#tournamentV4.registerTournament) | **POST** /lol/tournament/v4/tournaments | Creates a tournament and returns its ID.
[**tournamentV4.updateCode**](TournamentV4Api.md#tournamentV4.updateCode) | **PUT** /lol/tournament/v4/codes/{tournamentCode} | Update the pick type, map, spectator type, or allowed summoners for a code.


<a name="tournamentV4.createTournamentCode"></a>
# **tournamentV4.createTournamentCode**
> kotlin.Array&lt;kotlin.String&gt; tournamentV4.createTournamentCode(tournamentId, tournamentCodeParameters, count)

Create a tournament code for the given tournament.

Create a tournament code for the given tournament.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentV4Api()
val tournamentId : kotlin.Long = 789 // kotlin.Long | The tournament ID
val tournamentCodeParameters : TournamentMinusv4TournamentCodeParameters =  // TournamentMinusv4TournamentCodeParameters | Metadata for the generated code
val count : kotlin.Int = 56 // kotlin.Int | The number of codes to create (max 1000)
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.tournamentV4.createTournamentCode(tournamentId, tournamentCodeParameters, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentV4Api#tournamentV4.createTournamentCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentV4Api#tournamentV4.createTournamentCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **kotlin.Long**| The tournament ID |
 **tournamentCodeParameters** | [**TournamentMinusv4TournamentCodeParameters**](TournamentMinusv4TournamentCodeParameters.md)| Metadata for the generated code |
 **count** | **kotlin.Int**| The number of codes to create (max 1000) | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4.getLobbyEventsByCode"></a>
# **tournamentV4.getLobbyEventsByCode**
> TournamentMinusv4LobbyEventDTOWrapper tournamentV4.getLobbyEventsByCode(tournamentCode)

Gets a list of lobby events by tournament code.

Gets a list of lobby events by tournament code.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentV4Api()
val tournamentCode : kotlin.String = tournamentCode_example // kotlin.String | The short code to look up lobby events for
try {
    val result : TournamentMinusv4LobbyEventDTOWrapper = apiInstance.tournamentV4.getLobbyEventsByCode(tournamentCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentV4Api#tournamentV4.getLobbyEventsByCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentV4Api#tournamentV4.getLobbyEventsByCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **kotlin.String**| The short code to look up lobby events for |

### Return type

[**TournamentMinusv4LobbyEventDTOWrapper**](TournamentMinusv4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tournamentV4.getTournamentCode"></a>
# **tournamentV4.getTournamentCode**
> TournamentMinusv4TournamentCodeDTO tournamentV4.getTournamentCode(tournamentCode)

Returns the tournament code DTO associated with a tournament code string.

Returns the tournament code DTO associated with a tournament code string.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentV4Api()
val tournamentCode : kotlin.String = tournamentCode_example // kotlin.String | The tournament code string.
try {
    val result : TournamentMinusv4TournamentCodeDTO = apiInstance.tournamentV4.getTournamentCode(tournamentCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentV4Api#tournamentV4.getTournamentCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentV4Api#tournamentV4.getTournamentCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **kotlin.String**| The tournament code string. |

### Return type

[**TournamentMinusv4TournamentCodeDTO**](TournamentMinusv4TournamentCodeDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tournamentV4.registerProviderData"></a>
# **tournamentV4.registerProviderData**
> kotlin.Int tournamentV4.registerProviderData(providerRegistrationParameters)

Creates a tournament provider and returns its ID.

Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentV4Api()
val providerRegistrationParameters : TournamentMinusv4ProviderRegistrationParameters =  // TournamentMinusv4ProviderRegistrationParameters | The provider definition.
try {
    val result : kotlin.Int = apiInstance.tournamentV4.registerProviderData(providerRegistrationParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentV4Api#tournamentV4.registerProviderData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentV4Api#tournamentV4.registerProviderData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerRegistrationParameters** | [**TournamentMinusv4ProviderRegistrationParameters**](TournamentMinusv4ProviderRegistrationParameters.md)| The provider definition. |

### Return type

**kotlin.Int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4.registerTournament"></a>
# **tournamentV4.registerTournament**
> kotlin.Int tournamentV4.registerTournament(tournamentRegistrationParameters)

Creates a tournament and returns its ID.

Creates a tournament and returns its ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentV4Api()
val tournamentRegistrationParameters : TournamentMinusv4TournamentRegistrationParameters =  // TournamentMinusv4TournamentRegistrationParameters | The tournament definition.
try {
    val result : kotlin.Int = apiInstance.tournamentV4.registerTournament(tournamentRegistrationParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentV4Api#tournamentV4.registerTournament")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentV4Api#tournamentV4.registerTournament")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentRegistrationParameters** | [**TournamentMinusv4TournamentRegistrationParameters**](TournamentMinusv4TournamentRegistrationParameters.md)| The tournament definition. |

### Return type

**kotlin.Int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentV4.updateCode"></a>
# **tournamentV4.updateCode**
> tournamentV4.updateCode(tournamentCode, tournamentCodeUpdateParameters)

Update the pick type, map, spectator type, or allowed summoners for a code.

Update the pick type, map, spectator type, or allowed summoners for a code.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentV4Api()
val tournamentCode : kotlin.String = tournamentCode_example // kotlin.String | The tournament code to update
val tournamentCodeUpdateParameters : TournamentMinusv4TournamentCodeUpdateParameters =  // TournamentMinusv4TournamentCodeUpdateParameters | The fields to update
try {
    apiInstance.tournamentV4.updateCode(tournamentCode, tournamentCodeUpdateParameters)
} catch (e: ClientException) {
    println("4xx response calling TournamentV4Api#tournamentV4.updateCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentV4Api#tournamentV4.updateCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **kotlin.String**| The tournament code to update |
 **tournamentCodeUpdateParameters** | [**TournamentMinusv4TournamentCodeUpdateParameters**](TournamentMinusv4TournamentCodeUpdateParameters.md)| The fields to update | [optional]

### Return type

null (empty response body)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

