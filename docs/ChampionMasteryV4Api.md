# swagger_client.ChampionMasteryV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**champion_mastery_v4_get_all_champion_masteries**](ChampionMasteryV4Api.md#champion_mastery_v4_get_all_champion_masteries) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId} | Get all champion mastery entries sorted by number of champion points descending,
[**champion_mastery_v4_get_champion_mastery**](ChampionMasteryV4Api.md#champion_mastery_v4_get_champion_mastery) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId} | Get a champion mastery by player ID and champion ID.
[**champion_mastery_v4_get_champion_mastery_score**](ChampionMasteryV4Api.md#champion_mastery_v4_get_champion_mastery_score) | **GET** /lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId} | Get a player&#39;s total champion mastery score, which is the sum of individual champion mastery levels.


# **champion_mastery_v4_get_all_champion_masteries**
> list[ChampionMasteryV4ChampionMasteryDTO] champion_mastery_v4_get_all_champion_masteries(encrypted_summoner_id)

Get all champion mastery entries sorted by number of champion points descending,

Get all champion mastery entries sorted by number of champion points descending,

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: X-Riot-Token
configuration = swagger_client.Configuration()
configuration.api_key['X-Riot-Token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Riot-Token'] = 'Bearer'
# Configure API key authorization: api_key
configuration = swagger_client.Configuration()
configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ChampionMasteryV4Api(swagger_client.ApiClient(configuration))
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | Summoner ID associated with the player

try:
    # Get all champion mastery entries sorted by number of champion points descending,
    api_response = api_instance.champion_mastery_v4_get_all_champion_masteries(encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChampionMasteryV4Api->champion_mastery_v4_get_all_champion_masteries: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **str**| Summoner ID associated with the player | 

### Return type

[**list[ChampionMasteryV4ChampionMasteryDTO]**](ChampionMasteryV4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **champion_mastery_v4_get_champion_mastery**
> ChampionMasteryV4ChampionMasteryDTO champion_mastery_v4_get_champion_mastery(champion_id, encrypted_summoner_id)

Get a champion mastery by player ID and champion ID.

Get a champion mastery by player ID and champion ID.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: X-Riot-Token
configuration = swagger_client.Configuration()
configuration.api_key['X-Riot-Token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Riot-Token'] = 'Bearer'
# Configure API key authorization: api_key
configuration = swagger_client.Configuration()
configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ChampionMasteryV4Api(swagger_client.ApiClient(configuration))
champion_id = 789 # int | Champion ID to retrieve Champion Mastery for
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | Summoner ID associated with the player

try:
    # Get a champion mastery by player ID and champion ID.
    api_response = api_instance.champion_mastery_v4_get_champion_mastery(champion_id, encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChampionMasteryV4Api->champion_mastery_v4_get_champion_mastery: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **champion_id** | **int**| Champion ID to retrieve Champion Mastery for | 
 **encrypted_summoner_id** | **str**| Summoner ID associated with the player | 

### Return type

[**ChampionMasteryV4ChampionMasteryDTO**](ChampionMasteryV4ChampionMasteryDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **champion_mastery_v4_get_champion_mastery_score**
> int champion_mastery_v4_get_champion_mastery_score(encrypted_summoner_id)

Get a player's total champion mastery score, which is the sum of individual champion mastery levels.

Get a player's total champion mastery score, which is the sum of individual champion mastery levels.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: X-Riot-Token
configuration = swagger_client.Configuration()
configuration.api_key['X-Riot-Token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['X-Riot-Token'] = 'Bearer'
# Configure API key authorization: api_key
configuration = swagger_client.Configuration()
configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ChampionMasteryV4Api(swagger_client.ApiClient(configuration))
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | Summoner ID associated with the player

try:
    # Get a player's total champion mastery score, which is the sum of individual champion mastery levels.
    api_response = api_instance.champion_mastery_v4_get_champion_mastery_score(encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChampionMasteryV4Api->champion_mastery_v4_get_champion_mastery_score: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **str**| Summoner ID associated with the player | 

### Return type

**int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

