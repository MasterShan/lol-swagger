# TournamentStubV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentStubV4.createTournamentCode**](TournamentStubV4Api.md#tournamentStubV4.createTournamentCode) | **POST** /lol/tournament-stub/v4/codes | Create a mock tournament code for the given tournament.
[**tournamentStubV4.getLobbyEventsByCode**](TournamentStubV4Api.md#tournamentStubV4.getLobbyEventsByCode) | **GET** /lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode} | Gets a mock list of lobby events by tournament code.
[**tournamentStubV4.registerProviderData**](TournamentStubV4Api.md#tournamentStubV4.registerProviderData) | **POST** /lol/tournament-stub/v4/providers | Creates a mock tournament provider and returns its ID.
[**tournamentStubV4.registerTournament**](TournamentStubV4Api.md#tournamentStubV4.registerTournament) | **POST** /lol/tournament-stub/v4/tournaments | Creates a mock tournament and returns its ID.


<a name="tournamentStubV4.createTournamentCode"></a>
# **tournamentStubV4.createTournamentCode**
> kotlin.Array&lt;kotlin.String&gt; tournamentStubV4.createTournamentCode(tournamentId, tournamentCodeParameters, count)

Create a mock tournament code for the given tournament.

Create a mock tournament code for the given tournament.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentStubV4Api()
val tournamentId : kotlin.Long = 789 // kotlin.Long | The tournament ID
val tournamentCodeParameters : TournamentMinusstubMinusv4TournamentCodeParameters =  // TournamentMinusstubMinusv4TournamentCodeParameters | Metadata for the generated code
val count : kotlin.Int = 56 // kotlin.Int | The number of codes to create (max 1000)
try {
    val result : kotlin.Array<kotlin.String> = apiInstance.tournamentStubV4.createTournamentCode(tournamentId, tournamentCodeParameters, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentStubV4Api#tournamentStubV4.createTournamentCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentStubV4Api#tournamentStubV4.createTournamentCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentId** | **kotlin.Long**| The tournament ID |
 **tournamentCodeParameters** | [**TournamentMinusstubMinusv4TournamentCodeParameters**](TournamentMinusstubMinusv4TournamentCodeParameters.md)| Metadata for the generated code |
 **count** | **kotlin.Int**| The number of codes to create (max 1000) | [optional]

### Return type

**kotlin.Array&lt;kotlin.String&gt;**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentStubV4.getLobbyEventsByCode"></a>
# **tournamentStubV4.getLobbyEventsByCode**
> TournamentMinusstubMinusv4LobbyEventDTOWrapper tournamentStubV4.getLobbyEventsByCode(tournamentCode)

Gets a mock list of lobby events by tournament code.

Gets a mock list of lobby events by tournament code.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentStubV4Api()
val tournamentCode : kotlin.String = tournamentCode_example // kotlin.String | The short code to look up lobby events for
try {
    val result : TournamentMinusstubMinusv4LobbyEventDTOWrapper = apiInstance.tournamentStubV4.getLobbyEventsByCode(tournamentCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentStubV4Api#tournamentStubV4.getLobbyEventsByCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentStubV4Api#tournamentStubV4.getLobbyEventsByCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentCode** | **kotlin.String**| The short code to look up lobby events for |

### Return type

[**TournamentMinusstubMinusv4LobbyEventDTOWrapper**](TournamentMinusstubMinusv4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tournamentStubV4.registerProviderData"></a>
# **tournamentStubV4.registerProviderData**
> kotlin.Int tournamentStubV4.registerProviderData(providerRegistrationParameters)

Creates a mock tournament provider and returns its ID.

Creates a mock tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentStubV4Api()
val providerRegistrationParameters : TournamentMinusstubMinusv4ProviderRegistrationParameters =  // TournamentMinusstubMinusv4ProviderRegistrationParameters | The provider definition.
try {
    val result : kotlin.Int = apiInstance.tournamentStubV4.registerProviderData(providerRegistrationParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentStubV4Api#tournamentStubV4.registerProviderData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentStubV4Api#tournamentStubV4.registerProviderData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerRegistrationParameters** | [**TournamentMinusstubMinusv4ProviderRegistrationParameters**](TournamentMinusstubMinusv4ProviderRegistrationParameters.md)| The provider definition. |

### Return type

**kotlin.Int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tournamentStubV4.registerTournament"></a>
# **tournamentStubV4.registerTournament**
> kotlin.Int tournamentStubV4.registerTournament(tournamentRegistrationParameters)

Creates a mock tournament and returns its ID.

Creates a mock tournament and returns its ID.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TournamentStubV4Api()
val tournamentRegistrationParameters : TournamentMinusstubMinusv4TournamentRegistrationParameters =  // TournamentMinusstubMinusv4TournamentRegistrationParameters | The tournament definition.
try {
    val result : kotlin.Int = apiInstance.tournamentStubV4.registerTournament(tournamentRegistrationParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TournamentStubV4Api#tournamentStubV4.registerTournament")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TournamentStubV4Api#tournamentStubV4.registerTournament")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournamentRegistrationParameters** | [**TournamentMinusstubMinusv4TournamentRegistrationParameters**](TournamentMinusstubMinusv4TournamentRegistrationParameters.md)| The tournament definition. |

### Return type

**kotlin.Int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

