# swagger_client.TournamentV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournament_v4_create_tournament_code**](TournamentV4Api.md#tournament_v4_create_tournament_code) | **POST** /lol/tournament/v4/codes | Create a tournament code for the given tournament.
[**tournament_v4_get_lobby_events_by_code**](TournamentV4Api.md#tournament_v4_get_lobby_events_by_code) | **GET** /lol/tournament/v4/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code.
[**tournament_v4_get_tournament_code**](TournamentV4Api.md#tournament_v4_get_tournament_code) | **GET** /lol/tournament/v4/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string.
[**tournament_v4_register_provider_data**](TournamentV4Api.md#tournament_v4_register_provider_data) | **POST** /lol/tournament/v4/providers | Creates a tournament provider and returns its ID.
[**tournament_v4_register_tournament**](TournamentV4Api.md#tournament_v4_register_tournament) | **POST** /lol/tournament/v4/tournaments | Creates a tournament and returns its ID.
[**tournament_v4_update_code**](TournamentV4Api.md#tournament_v4_update_code) | **PUT** /lol/tournament/v4/codes/{tournamentCode} | Update the pick type, map, spectator type, or allowed summoners for a code.


# **tournament_v4_create_tournament_code**
> list[str] tournament_v4_create_tournament_code(tournament_id, tournament_code_parameters, count=count)

Create a tournament code for the given tournament.

Create a tournament code for the given tournament.

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
api_instance = swagger_client.TournamentV4Api(swagger_client.ApiClient(configuration))
tournament_id = 789 # int | The tournament ID
tournament_code_parameters = swagger_client.TournamentV4TournamentCodeParameters() # TournamentV4TournamentCodeParameters | Metadata for the generated code
count = 56 # int | The number of codes to create (max 1000) (optional)

try:
    # Create a tournament code for the given tournament.
    api_response = api_instance.tournament_v4_create_tournament_code(tournament_id, tournament_code_parameters, count=count)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentV4Api->tournament_v4_create_tournament_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_id** | **int**| The tournament ID | 
 **tournament_code_parameters** | [**TournamentV4TournamentCodeParameters**](TournamentV4TournamentCodeParameters.md)| Metadata for the generated code | 
 **count** | **int**| The number of codes to create (max 1000) | [optional] 

### Return type

**list[str]**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_v4_get_lobby_events_by_code**
> TournamentV4LobbyEventDTOWrapper tournament_v4_get_lobby_events_by_code(tournament_code)

Gets a list of lobby events by tournament code.

Gets a list of lobby events by tournament code.

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
api_instance = swagger_client.TournamentV4Api(swagger_client.ApiClient(configuration))
tournament_code = 'tournament_code_example' # str | The short code to look up lobby events for

try:
    # Gets a list of lobby events by tournament code.
    api_response = api_instance.tournament_v4_get_lobby_events_by_code(tournament_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentV4Api->tournament_v4_get_lobby_events_by_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **str**| The short code to look up lobby events for | 

### Return type

[**TournamentV4LobbyEventDTOWrapper**](TournamentV4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_v4_get_tournament_code**
> TournamentV4TournamentCodeDTO tournament_v4_get_tournament_code(tournament_code)

Returns the tournament code DTO associated with a tournament code string.

Returns the tournament code DTO associated with a tournament code string.

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
api_instance = swagger_client.TournamentV4Api(swagger_client.ApiClient(configuration))
tournament_code = 'tournament_code_example' # str | The tournament code string.

try:
    # Returns the tournament code DTO associated with a tournament code string.
    api_response = api_instance.tournament_v4_get_tournament_code(tournament_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentV4Api->tournament_v4_get_tournament_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **str**| The tournament code string. | 

### Return type

[**TournamentV4TournamentCodeDTO**](TournamentV4TournamentCodeDTO.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_v4_register_provider_data**
> int tournament_v4_register_provider_data(provider_registration_parameters)

Creates a tournament provider and returns its ID.

Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

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
api_instance = swagger_client.TournamentV4Api(swagger_client.ApiClient(configuration))
provider_registration_parameters = swagger_client.TournamentV4ProviderRegistrationParameters() # TournamentV4ProviderRegistrationParameters | The provider definition.

try:
    # Creates a tournament provider and returns its ID.
    api_response = api_instance.tournament_v4_register_provider_data(provider_registration_parameters)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentV4Api->tournament_v4_register_provider_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_registration_parameters** | [**TournamentV4ProviderRegistrationParameters**](TournamentV4ProviderRegistrationParameters.md)| The provider definition. | 

### Return type

**int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_v4_register_tournament**
> int tournament_v4_register_tournament(tournament_registration_parameters)

Creates a tournament and returns its ID.

Creates a tournament and returns its ID.

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
api_instance = swagger_client.TournamentV4Api(swagger_client.ApiClient(configuration))
tournament_registration_parameters = swagger_client.TournamentV4TournamentRegistrationParameters() # TournamentV4TournamentRegistrationParameters | The tournament definition.

try:
    # Creates a tournament and returns its ID.
    api_response = api_instance.tournament_v4_register_tournament(tournament_registration_parameters)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentV4Api->tournament_v4_register_tournament: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_registration_parameters** | [**TournamentV4TournamentRegistrationParameters**](TournamentV4TournamentRegistrationParameters.md)| The tournament definition. | 

### Return type

**int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_v4_update_code**
> tournament_v4_update_code(tournament_code, tournament_code_update_parameters=tournament_code_update_parameters)

Update the pick type, map, spectator type, or allowed summoners for a code.

Update the pick type, map, spectator type, or allowed summoners for a code.

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
api_instance = swagger_client.TournamentV4Api(swagger_client.ApiClient(configuration))
tournament_code = 'tournament_code_example' # str | The tournament code to update
tournament_code_update_parameters = swagger_client.TournamentV4TournamentCodeUpdateParameters() # TournamentV4TournamentCodeUpdateParameters | The fields to update (optional)

try:
    # Update the pick type, map, spectator type, or allowed summoners for a code.
    api_instance.tournament_v4_update_code(tournament_code, tournament_code_update_parameters=tournament_code_update_parameters)
except ApiException as e:
    print("Exception when calling TournamentV4Api->tournament_v4_update_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **str**| The tournament code to update | 
 **tournament_code_update_parameters** | [**TournamentV4TournamentCodeUpdateParameters**](TournamentV4TournamentCodeUpdateParameters.md)| The fields to update | [optional] 

### Return type

void (empty response body)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

