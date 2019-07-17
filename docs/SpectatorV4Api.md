# swagger_client.SpectatorV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spectator_v4_get_current_game_info_by_summoner**](SpectatorV4Api.md#spectator_v4_get_current_game_info_by_summoner) | **GET** /lol/spectator/v4/active-games/by-summoner/{encryptedSummonerId} | Get current game information for the given summoner ID.
[**spectator_v4_get_featured_games**](SpectatorV4Api.md#spectator_v4_get_featured_games) | **GET** /lol/spectator/v4/featured-games | Get list of featured games.


# **spectator_v4_get_current_game_info_by_summoner**
> SpectatorV4CurrentGameInfo spectator_v4_get_current_game_info_by_summoner(encrypted_summoner_id)

Get current game information for the given summoner ID.

Get current game information for the given summoner ID.

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
api_instance = swagger_client.SpectatorV4Api(swagger_client.ApiClient(configuration))
encrypted_summoner_id = 'encrypted_summoner_id_example' # str | The ID of the summoner.

try:
    # Get current game information for the given summoner ID.
    api_response = api_instance.spectator_v4_get_current_game_info_by_summoner(encrypted_summoner_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpectatorV4Api->spectator_v4_get_current_game_info_by_summoner: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **encrypted_summoner_id** | **str**| The ID of the summoner. | 

### Return type

[**SpectatorV4CurrentGameInfo**](SpectatorV4CurrentGameInfo.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **spectator_v4_get_featured_games**
> SpectatorV4FeaturedGames spectator_v4_get_featured_games()

Get list of featured games.

Get list of featured games.

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
api_instance = swagger_client.SpectatorV4Api(swagger_client.ApiClient(configuration))

try:
    # Get list of featured games.
    api_response = api_instance.spectator_v4_get_featured_games()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpectatorV4Api->spectator_v4_get_featured_games: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SpectatorV4FeaturedGames**](SpectatorV4FeaturedGames.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

