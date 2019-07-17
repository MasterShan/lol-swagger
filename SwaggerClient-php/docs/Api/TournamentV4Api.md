# Swagger\Client\TournamentV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournamentV4CreateTournamentCode**](TournamentV4Api.md#tournamentV4CreateTournamentCode) | **POST** /lol/tournament/v4/codes | Create a tournament code for the given tournament.
[**tournamentV4GetLobbyEventsByCode**](TournamentV4Api.md#tournamentV4GetLobbyEventsByCode) | **GET** /lol/tournament/v4/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code.
[**tournamentV4GetTournamentCode**](TournamentV4Api.md#tournamentV4GetTournamentCode) | **GET** /lol/tournament/v4/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string.
[**tournamentV4RegisterProviderData**](TournamentV4Api.md#tournamentV4RegisterProviderData) | **POST** /lol/tournament/v4/providers | Creates a tournament provider and returns its ID.
[**tournamentV4RegisterTournament**](TournamentV4Api.md#tournamentV4RegisterTournament) | **POST** /lol/tournament/v4/tournaments | Creates a tournament and returns its ID.
[**tournamentV4UpdateCode**](TournamentV4Api.md#tournamentV4UpdateCode) | **PUT** /lol/tournament/v4/codes/{tournamentCode} | Update the pick type, map, spectator type, or allowed summoners for a code.


# **tournamentV4CreateTournamentCode**
> string[] tournamentV4CreateTournamentCode($tournament_id, $tournament_code_parameters, $count)

Create a tournament code for the given tournament.

Create a tournament code for the given tournament.

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

$apiInstance = new Swagger\Client\Api\TournamentV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_id = 789; // int | The tournament ID
$tournament_code_parameters = new \Swagger\Client\Model\TournamentV4TournamentCodeParameters(); // \Swagger\Client\Model\TournamentV4TournamentCodeParameters | Metadata for the generated code
$count = 56; // int | The number of codes to create (max 1000)

try {
    $result = $apiInstance->tournamentV4CreateTournamentCode($tournament_id, $tournament_code_parameters, $count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentV4Api->tournamentV4CreateTournamentCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_id** | **int**| The tournament ID |
 **tournament_code_parameters** | [**\Swagger\Client\Model\TournamentV4TournamentCodeParameters**](../Model/TournamentV4TournamentCodeParameters.md)| Metadata for the generated code |
 **count** | **int**| The number of codes to create (max 1000) | [optional]

### Return type

**string[]**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentV4GetLobbyEventsByCode**
> \Swagger\Client\Model\TournamentV4LobbyEventDTOWrapper tournamentV4GetLobbyEventsByCode($tournament_code)

Gets a list of lobby events by tournament code.

Gets a list of lobby events by tournament code.

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

$apiInstance = new Swagger\Client\Api\TournamentV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_code = "tournament_code_example"; // string | The short code to look up lobby events for

try {
    $result = $apiInstance->tournamentV4GetLobbyEventsByCode($tournament_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentV4Api->tournamentV4GetLobbyEventsByCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **string**| The short code to look up lobby events for |

### Return type

[**\Swagger\Client\Model\TournamentV4LobbyEventDTOWrapper**](../Model/TournamentV4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentV4GetTournamentCode**
> \Swagger\Client\Model\TournamentV4TournamentCodeDTO tournamentV4GetTournamentCode($tournament_code)

Returns the tournament code DTO associated with a tournament code string.

Returns the tournament code DTO associated with a tournament code string.

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

$apiInstance = new Swagger\Client\Api\TournamentV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_code = "tournament_code_example"; // string | The tournament code string.

try {
    $result = $apiInstance->tournamentV4GetTournamentCode($tournament_code);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentV4Api->tournamentV4GetTournamentCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **string**| The tournament code string. |

### Return type

[**\Swagger\Client\Model\TournamentV4TournamentCodeDTO**](../Model/TournamentV4TournamentCodeDTO.md)

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentV4RegisterProviderData**
> int tournamentV4RegisterProviderData($provider_registration_parameters)

Creates a tournament provider and returns its ID.

Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

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

$apiInstance = new Swagger\Client\Api\TournamentV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$provider_registration_parameters = new \Swagger\Client\Model\TournamentV4ProviderRegistrationParameters(); // \Swagger\Client\Model\TournamentV4ProviderRegistrationParameters | The provider definition.

try {
    $result = $apiInstance->tournamentV4RegisterProviderData($provider_registration_parameters);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentV4Api->tournamentV4RegisterProviderData: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_registration_parameters** | [**\Swagger\Client\Model\TournamentV4ProviderRegistrationParameters**](../Model/TournamentV4ProviderRegistrationParameters.md)| The provider definition. |

### Return type

**int**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentV4RegisterTournament**
> int tournamentV4RegisterTournament($tournament_registration_parameters)

Creates a tournament and returns its ID.

Creates a tournament and returns its ID.

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

$apiInstance = new Swagger\Client\Api\TournamentV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_registration_parameters = new \Swagger\Client\Model\TournamentV4TournamentRegistrationParameters(); // \Swagger\Client\Model\TournamentV4TournamentRegistrationParameters | The tournament definition.

try {
    $result = $apiInstance->tournamentV4RegisterTournament($tournament_registration_parameters);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TournamentV4Api->tournamentV4RegisterTournament: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_registration_parameters** | [**\Swagger\Client\Model\TournamentV4TournamentRegistrationParameters**](../Model/TournamentV4TournamentRegistrationParameters.md)| The tournament definition. |

### Return type

**int**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tournamentV4UpdateCode**
> tournamentV4UpdateCode($tournament_code, $tournament_code_update_parameters)

Update the pick type, map, spectator type, or allowed summoners for a code.

Update the pick type, map, spectator type, or allowed summoners for a code.

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

$apiInstance = new Swagger\Client\Api\TournamentV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$tournament_code = "tournament_code_example"; // string | The tournament code to update
$tournament_code_update_parameters = new \Swagger\Client\Model\TournamentV4TournamentCodeUpdateParameters(); // \Swagger\Client\Model\TournamentV4TournamentCodeUpdateParameters | The fields to update

try {
    $apiInstance->tournamentV4UpdateCode($tournament_code, $tournament_code_update_parameters);
} catch (Exception $e) {
    echo 'Exception when calling TournamentV4Api->tournamentV4UpdateCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **string**| The tournament code to update |
 **tournament_code_update_parameters** | [**\Swagger\Client\Model\TournamentV4TournamentCodeUpdateParameters**](../Model/TournamentV4TournamentCodeUpdateParameters.md)| The fields to update | [optional]

### Return type

void (empty response body)

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

