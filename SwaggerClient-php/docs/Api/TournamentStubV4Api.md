# Swagger\Client\TournamentStubV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentStubV4CreateTournamentCode**](TournamentStubV4Api.md#tournamentStubV4CreateTournamentCode) | **POST** /lol/tournament-stub/v4/codes | Create a mock tournament code for the given tournament.
[**tournamentStubV4GetLobbyEventsByCode**](TournamentStubV4Api.md#tournamentStubV4GetLobbyEventsByCode) | **GET** /lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode} | Gets a mock list of lobby events by tournament code.
[**tournamentStubV4RegisterProviderData**](TournamentStubV4Api.md#tournamentStubV4RegisterProviderData) | **POST** /lol/tournament-stub/v4/providers | Creates a mock tournament provider and returns its ID.
[**tournamentStubV4RegisterTournament**](TournamentStubV4Api.md#tournamentStubV4RegisterTournament) | **POST** /lol/tournament-stub/v4/tournaments | Creates a mock tournament and returns its ID.


# **tournamentStubV4CreateTournamentCode**
> string[] tournamentStubV4CreateTournamentCode($tournament_id, $tournament_code_parameters, $count)

Create a mock tournament code for the given tournament.

Create a mock tournament code for the given tournament.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: X-Riot-Token
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-Riot-Token', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-Riot-Token', 'Bearer');
// Configure API key authorization: api_key
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key', 'Bearer');

$apiInstance = new Swagger\Client\Api\TournamentStubV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_id = 789; // int | The tournament ID
$tournament_code_parameters = new \Swagger\Client\Model\TournamentStubV4TournamentCodeParameters(); // \Swagger\Client\Model\TournamentStubV4TournamentCodeParameters | Metadata for the generated code
$count = 56; // int | The number of codes to create (max 1000)

try {
    $result = $apiInstance->tournamentStubV4CreateTournamentCode($tournament_id, $tournament_code_parameters, $count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentStubV4Api->tournamentStubV4CreateTournamentCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_id** | **int**| The tournament ID |
 **tournament_code_parameters** | [**\Swagger\Client\Model\TournamentStubV4TournamentCodeParameters**](../Model/TournamentStubV4TournamentCodeParameters.md)| Metadata for the generated code |
 **count** | **int**| The number of codes to create (max 1000) | [optional]

### Return type

**string[]**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentStubV4GetLobbyEventsByCode**
> \Swagger\Client\Model\TournamentStubV4LobbyEventDTOWrapper tournamentStubV4GetLobbyEventsByCode($tournament_code)

Gets a mock list of lobby events by tournament code.

Gets a mock list of lobby events by tournament code.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: X-Riot-Token
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-Riot-Token', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-Riot-Token', 'Bearer');
// Configure API key authorization: api_key
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key', 'Bearer');

$apiInstance = new Swagger\Client\Api\TournamentStubV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_code = "tournament_code_example"; // string | The short code to look up lobby events for

try {
    $result = $apiInstance->tournamentStubV4GetLobbyEventsByCode($tournament_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentStubV4Api->tournamentStubV4GetLobbyEventsByCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **string**| The short code to look up lobby events for |

### Return type

[**\Swagger\Client\Model\TournamentStubV4LobbyEventDTOWrapper**](../Model/TournamentStubV4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentStubV4RegisterProviderData**
> int tournamentStubV4RegisterProviderData($provider_registration_parameters)

Creates a mock tournament provider and returns its ID.

Creates a mock tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: X-Riot-Token
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-Riot-Token', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-Riot-Token', 'Bearer');
// Configure API key authorization: api_key
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key', 'Bearer');

$apiInstance = new Swagger\Client\Api\TournamentStubV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$provider_registration_parameters = new \Swagger\Client\Model\TournamentStubV4ProviderRegistrationParameters(); // \Swagger\Client\Model\TournamentStubV4ProviderRegistrationParameters | The provider definition.

try {
    $result = $apiInstance->tournamentStubV4RegisterProviderData($provider_registration_parameters);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentStubV4Api->tournamentStubV4RegisterProviderData: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_registration_parameters** | [**\Swagger\Client\Model\TournamentStubV4ProviderRegistrationParameters**](../Model/TournamentStubV4ProviderRegistrationParameters.md)| The provider definition. |

### Return type

**int**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentStubV4RegisterTournament**
> int tournamentStubV4RegisterTournament($tournament_registration_parameters)

Creates a mock tournament and returns its ID.

Creates a mock tournament and returns its ID.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: X-Riot-Token
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('X-Riot-Token', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('X-Riot-Token', 'Bearer');
// Configure API key authorization: api_key
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api_key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api_key', 'Bearer');

$apiInstance = new Swagger\Client\Api\TournamentStubV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_registration_parameters = new \Swagger\Client\Model\TournamentStubV4TournamentRegistrationParameters(); // \Swagger\Client\Model\TournamentStubV4TournamentRegistrationParameters | The tournament definition.

try {
    $result = $apiInstance->tournamentStubV4RegisterTournament($tournament_registration_parameters);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentStubV4Api->tournamentStubV4RegisterTournament: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_registration_parameters** | [**\Swagger\Client\Model\TournamentStubV4TournamentRegistrationParameters**](../Model/TournamentStubV4TournamentRegistrationParameters.md)| The tournament definition. |

### Return type

**int**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

