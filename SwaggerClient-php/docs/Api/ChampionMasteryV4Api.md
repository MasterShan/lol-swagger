# Swagger\Client\ChampionMasteryV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**championMasteryV4GetAllChampionMasteries**](ChampionMasteryV4Api.md#championMasteryV4GetAllChampionMasteries) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId} | Get all champion mastery entries sorted by number of champion points descending,
[**championMasteryV4GetChampionMastery**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMastery) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId} | Get a champion mastery by player ID and champion ID.
[**championMasteryV4GetChampionMasteryScore**](ChampionMasteryV4Api.md#championMasteryV4GetChampionMasteryScore) | **GET** /lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId} | Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.


# **championMasteryV4GetAllChampionMasteries**
> \Swagger\Client\Model\ChampionMasteryV4ChampionMasteryDTO[] championMasteryV4GetAllChampionMasteries($encrypted_summoner_id)

Get all champion mastery entries sorted by number of champion points descending,

Get all champion mastery entries sorted by number of champion points descending,

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

$apiInstance = new Swagger\Client\Api\ChampionMasteryV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$encrypted_summoner_id = "encrypted_summoner_id_example"; // string | Summoner ID associated with the player

try {
    $result = $apiInstance->championMasteryV4GetAllChampionMasteries($encrypted_summoner_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChampionMasteryV4Api->championMasteryV4GetAllChampionMasteries: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **string**| Summoner ID associated with the player |

### Return type

[**\Swagger\Client\Model\ChampionMasteryV4ChampionMasteryDTO[]**](../Model/ChampionMasteryV4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **championMasteryV4GetChampionMastery**
> \Swagger\Client\Model\ChampionMasteryV4ChampionMasteryDTO championMasteryV4GetChampionMastery($champion_id, $encrypted_summoner_id)

Get a champion mastery by player ID and champion ID.

Get a champion mastery by player ID and champion ID.

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

$apiInstance = new Swagger\Client\Api\ChampionMasteryV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$champion_id = 789; // int | Champion ID to retrieve Champion Mastery for
$encrypted_summoner_id = "encrypted_summoner_id_example"; // string | Summoner ID associated with the player

try {
    $result = $apiInstance->championMasteryV4GetChampionMastery($champion_id, $encrypted_summoner_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChampionMasteryV4Api->championMasteryV4GetChampionMastery: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **champion_id** | **int**| Champion ID to retrieve Champion Mastery for |
 **encrypted_summoner_id** | **string**| Summoner ID associated with the player |

### Return type

[**\Swagger\Client\Model\ChampionMasteryV4ChampionMasteryDTO**](../Model/ChampionMasteryV4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **championMasteryV4GetChampionMasteryScore**
> int championMasteryV4GetChampionMasteryScore($encrypted_summoner_id)

Get a player's total champion mastery score, which is the sum of individual champion mastery levels.

Get a player's total champion mastery score, which is the sum of individual champion mastery levels.

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

$apiInstance = new Swagger\Client\Api\ChampionMasteryV4Api(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$encrypted_summoner_id = "encrypted_summoner_id_example"; // string | Summoner ID associated with the player

try {
    $result = $apiInstance->championMasteryV4GetChampionMasteryScore($encrypted_summoner_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChampionMasteryV4Api->championMasteryV4GetChampionMasteryScore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **string**| Summoner ID associated with the player |

### Return type

**int**

### Authorization

[X-Riot-Token](../../README.md#X-Riot-Token), [api_key](../../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

