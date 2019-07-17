# swagger_client.TournamentStubV4Api

All URIs are relative to *https://na1.api.riotgames.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tournament_stub_v4_create_tournament_code**](TournamentStubV4Api.md#tournament_stub_v4_create_tournament_code) | **POST** /lol/tournament-stub/v4/codes | Create a mock tournament code for the given tournament.
[**tournament_stub_v4_get_lobby_events_by_code**](TournamentStubV4Api.md#tournament_stub_v4_get_lobby_events_by_code) | **GET** /lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode} | Gets a mock list of lobby events by tournament code.
[**tournament_stub_v4_register_provider_data**](TournamentStubV4Api.md#tournament_stub_v4_register_provider_data) | **POST** /lol/tournament-stub/v4/providers | Creates a mock tournament provider and returns its ID.
[**tournament_stub_v4_register_tournament**](TournamentStubV4Api.md#tournament_stub_v4_register_tournament) | **POST** /lol/tournament-stub/v4/tournaments | Creates a mock tournament and returns its ID.


# **tournament_stub_v4_create_tournament_code**
> list[str] tournament_stub_v4_create_tournament_code(tournament_id, tournament_code_parameters, count=count)

Create a mock tournament code for the given tournament.

Create a mock tournament code for the given tournament.

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
api_instance = swagger_client.TournamentStubV4Api(swagger_client.ApiClient(configuration))
tournament_id = 789 # int | The tournament ID
tournament_code_parameters = swagger_client.TournamentStubV4TournamentCodeParameters() # TournamentStubV4TournamentCodeParameters | Metadata for the generated code
count = 56 # int | The number of codes to create (max 1000) (optional)

try:
    # Create a mock tournament code for the given tournament.
    api_response = api_instance.tournament_stub_v4_create_tournament_code(tournament_id, tournament_code_parameters, count=count)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentStubV4Api->tournament_stub_v4_create_tournament_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_id** | **int**| The tournament ID | 
 **tournament_code_parameters** | [**TournamentStubV4TournamentCodeParameters**](TournamentStubV4TournamentCodeParameters.md)| Metadata for the generated code | 
 **count** | **int**| The number of codes to create (max 1000) | [optional] 

### Return type

**list[str]**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_stub_v4_get_lobby_events_by_code**
> TournamentStubV4LobbyEventDTOWrapper tournament_stub_v4_get_lobby_events_by_code(tournament_code)

Gets a mock list of lobby events by tournament code.

Gets a mock list of lobby events by tournament code.

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
api_instance = swagger_client.TournamentStubV4Api(swagger_client.ApiClient(configuration))
tournament_code = 'tournament_code_example' # str | The short code to look up lobby events for

try:
    # Gets a mock list of lobby events by tournament code.
    api_response = api_instance.tournament_stub_v4_get_lobby_events_by_code(tournament_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentStubV4Api->tournament_stub_v4_get_lobby_events_by_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_code** | **str**| The short code to look up lobby events for | 

### Return type

[**TournamentStubV4LobbyEventDTOWrapper**](TournamentStubV4LobbyEventDTOWrapper.md)

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_stub_v4_register_provider_data**
> int tournament_stub_v4_register_provider_data(provider_registration_parameters)

Creates a mock tournament provider and returns its ID.

Creates a mock tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.

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
api_instance = swagger_client.TournamentStubV4Api(swagger_client.ApiClient(configuration))
provider_registration_parameters = swagger_client.TournamentStubV4ProviderRegistrationParameters() # TournamentStubV4ProviderRegistrationParameters | The provider definition.

try:
    # Creates a mock tournament provider and returns its ID.
    api_response = api_instance.tournament_stub_v4_register_provider_data(provider_registration_parameters)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentStubV4Api->tournament_stub_v4_register_provider_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_registration_parameters** | [**TournamentStubV4ProviderRegistrationParameters**](TournamentStubV4ProviderRegistrationParameters.md)| The provider definition. | 

### Return type

**int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tournament_stub_v4_register_tournament**
> int tournament_stub_v4_register_tournament(tournament_registration_parameters)

Creates a mock tournament and returns its ID.

Creates a mock tournament and returns its ID.

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
api_instance = swagger_client.TournamentStubV4Api(swagger_client.ApiClient(configuration))
tournament_registration_parameters = swagger_client.TournamentStubV4TournamentRegistrationParameters() # TournamentStubV4TournamentRegistrationParameters | The tournament definition.

try:
    # Creates a mock tournament and returns its ID.
    api_response = api_instance.tournament_stub_v4_register_tournament(tournament_registration_parameters)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TournamentStubV4Api->tournament_stub_v4_register_tournament: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tournament_registration_parameters** | [**TournamentStubV4TournamentRegistrationParameters**](TournamentStubV4TournamentRegistrationParameters.md)| The tournament definition. | 

### Return type

**int**

### Authorization

[X-Riot-Token](../README.md#X-Riot-Token), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

