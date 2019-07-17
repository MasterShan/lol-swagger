# coding: utf-8

"""
    Riot API

     OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. ***   # noqa: E501

    OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class TournamentV4Api(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def tournament_v4_create_tournament_code(self, tournament_id, tournament_code_parameters, **kwargs):  # noqa: E501
        """Create a tournament code for the given tournament.  # noqa: E501

        Create a tournament code for the given tournament.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_create_tournament_code(tournament_id, tournament_code_parameters, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int tournament_id: The tournament ID (required)
        :param TournamentV4TournamentCodeParameters tournament_code_parameters: Metadata for the generated code (required)
        :param int count: The number of codes to create (max 1000)
        :return: list[str]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.tournament_v4_create_tournament_code_with_http_info(tournament_id, tournament_code_parameters, **kwargs)  # noqa: E501
        else:
            (data) = self.tournament_v4_create_tournament_code_with_http_info(tournament_id, tournament_code_parameters, **kwargs)  # noqa: E501
            return data

    def tournament_v4_create_tournament_code_with_http_info(self, tournament_id, tournament_code_parameters, **kwargs):  # noqa: E501
        """Create a tournament code for the given tournament.  # noqa: E501

        Create a tournament code for the given tournament.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_create_tournament_code_with_http_info(tournament_id, tournament_code_parameters, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int tournament_id: The tournament ID (required)
        :param TournamentV4TournamentCodeParameters tournament_code_parameters: Metadata for the generated code (required)
        :param int count: The number of codes to create (max 1000)
        :return: list[str]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['tournament_id', 'tournament_code_parameters', 'count']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method tournament_v4_create_tournament_code" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'tournament_id' is set
        if ('tournament_id' not in params or
                params['tournament_id'] is None):
            raise ValueError("Missing the required parameter `tournament_id` when calling `tournament_v4_create_tournament_code`")  # noqa: E501
        # verify the required parameter 'tournament_code_parameters' is set
        if ('tournament_code_parameters' not in params or
                params['tournament_code_parameters'] is None):
            raise ValueError("Missing the required parameter `tournament_code_parameters` when calling `tournament_v4_create_tournament_code`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'count' in params:
            query_params.append(('count', params['count']))  # noqa: E501
        if 'tournament_id' in params:
            query_params.append(('tournamentId', params['tournament_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'tournament_code_parameters' in params:
            body_params = params['tournament_code_parameters']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['X-Riot-Token', 'api_key']  # noqa: E501

        return self.api_client.call_api(
            '/lol/tournament/v4/codes', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[str]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def tournament_v4_get_lobby_events_by_code(self, tournament_code, **kwargs):  # noqa: E501
        """Gets a list of lobby events by tournament code.  # noqa: E501

        Gets a list of lobby events by tournament code.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_get_lobby_events_by_code(tournament_code, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str tournament_code: The short code to look up lobby events for (required)
        :return: TournamentV4LobbyEventDTOWrapper
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.tournament_v4_get_lobby_events_by_code_with_http_info(tournament_code, **kwargs)  # noqa: E501
        else:
            (data) = self.tournament_v4_get_lobby_events_by_code_with_http_info(tournament_code, **kwargs)  # noqa: E501
            return data

    def tournament_v4_get_lobby_events_by_code_with_http_info(self, tournament_code, **kwargs):  # noqa: E501
        """Gets a list of lobby events by tournament code.  # noqa: E501

        Gets a list of lobby events by tournament code.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_get_lobby_events_by_code_with_http_info(tournament_code, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str tournament_code: The short code to look up lobby events for (required)
        :return: TournamentV4LobbyEventDTOWrapper
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['tournament_code']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method tournament_v4_get_lobby_events_by_code" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'tournament_code' is set
        if ('tournament_code' not in params or
                params['tournament_code'] is None):
            raise ValueError("Missing the required parameter `tournament_code` when calling `tournament_v4_get_lobby_events_by_code`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'tournament_code' in params:
            path_params['tournamentCode'] = params['tournament_code']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['X-Riot-Token', 'api_key']  # noqa: E501

        return self.api_client.call_api(
            '/lol/tournament/v4/lobby-events/by-code/{tournamentCode}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='TournamentV4LobbyEventDTOWrapper',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def tournament_v4_get_tournament_code(self, tournament_code, **kwargs):  # noqa: E501
        """Returns the tournament code DTO associated with a tournament code string.  # noqa: E501

        Returns the tournament code DTO associated with a tournament code string.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_get_tournament_code(tournament_code, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str tournament_code: The tournament code string. (required)
        :return: TournamentV4TournamentCodeDTO
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.tournament_v4_get_tournament_code_with_http_info(tournament_code, **kwargs)  # noqa: E501
        else:
            (data) = self.tournament_v4_get_tournament_code_with_http_info(tournament_code, **kwargs)  # noqa: E501
            return data

    def tournament_v4_get_tournament_code_with_http_info(self, tournament_code, **kwargs):  # noqa: E501
        """Returns the tournament code DTO associated with a tournament code string.  # noqa: E501

        Returns the tournament code DTO associated with a tournament code string.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_get_tournament_code_with_http_info(tournament_code, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str tournament_code: The tournament code string. (required)
        :return: TournamentV4TournamentCodeDTO
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['tournament_code']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method tournament_v4_get_tournament_code" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'tournament_code' is set
        if ('tournament_code' not in params or
                params['tournament_code'] is None):
            raise ValueError("Missing the required parameter `tournament_code` when calling `tournament_v4_get_tournament_code`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'tournament_code' in params:
            path_params['tournamentCode'] = params['tournament_code']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['X-Riot-Token', 'api_key']  # noqa: E501

        return self.api_client.call_api(
            '/lol/tournament/v4/codes/{tournamentCode}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='TournamentV4TournamentCodeDTO',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def tournament_v4_register_provider_data(self, provider_registration_parameters, **kwargs):  # noqa: E501
        """Creates a tournament provider and returns its ID.  # noqa: E501

        Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_register_provider_data(provider_registration_parameters, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param TournamentV4ProviderRegistrationParameters provider_registration_parameters: The provider definition. (required)
        :return: int
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.tournament_v4_register_provider_data_with_http_info(provider_registration_parameters, **kwargs)  # noqa: E501
        else:
            (data) = self.tournament_v4_register_provider_data_with_http_info(provider_registration_parameters, **kwargs)  # noqa: E501
            return data

    def tournament_v4_register_provider_data_with_http_info(self, provider_registration_parameters, **kwargs):  # noqa: E501
        """Creates a tournament provider and returns its ID.  # noqa: E501

        Creates a tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_register_provider_data_with_http_info(provider_registration_parameters, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param TournamentV4ProviderRegistrationParameters provider_registration_parameters: The provider definition. (required)
        :return: int
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['provider_registration_parameters']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method tournament_v4_register_provider_data" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'provider_registration_parameters' is set
        if ('provider_registration_parameters' not in params or
                params['provider_registration_parameters'] is None):
            raise ValueError("Missing the required parameter `provider_registration_parameters` when calling `tournament_v4_register_provider_data`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'provider_registration_parameters' in params:
            body_params = params['provider_registration_parameters']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['X-Riot-Token', 'api_key']  # noqa: E501

        return self.api_client.call_api(
            '/lol/tournament/v4/providers', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='int',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def tournament_v4_register_tournament(self, tournament_registration_parameters, **kwargs):  # noqa: E501
        """Creates a tournament and returns its ID.  # noqa: E501

        Creates a tournament and returns its ID.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_register_tournament(tournament_registration_parameters, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param TournamentV4TournamentRegistrationParameters tournament_registration_parameters: The tournament definition. (required)
        :return: int
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.tournament_v4_register_tournament_with_http_info(tournament_registration_parameters, **kwargs)  # noqa: E501
        else:
            (data) = self.tournament_v4_register_tournament_with_http_info(tournament_registration_parameters, **kwargs)  # noqa: E501
            return data

    def tournament_v4_register_tournament_with_http_info(self, tournament_registration_parameters, **kwargs):  # noqa: E501
        """Creates a tournament and returns its ID.  # noqa: E501

        Creates a tournament and returns its ID.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_register_tournament_with_http_info(tournament_registration_parameters, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param TournamentV4TournamentRegistrationParameters tournament_registration_parameters: The tournament definition. (required)
        :return: int
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['tournament_registration_parameters']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method tournament_v4_register_tournament" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'tournament_registration_parameters' is set
        if ('tournament_registration_parameters' not in params or
                params['tournament_registration_parameters'] is None):
            raise ValueError("Missing the required parameter `tournament_registration_parameters` when calling `tournament_v4_register_tournament`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'tournament_registration_parameters' in params:
            body_params = params['tournament_registration_parameters']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['X-Riot-Token', 'api_key']  # noqa: E501

        return self.api_client.call_api(
            '/lol/tournament/v4/tournaments', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='int',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def tournament_v4_update_code(self, tournament_code, **kwargs):  # noqa: E501
        """Update the pick type, map, spectator type, or allowed summoners for a code.  # noqa: E501

        Update the pick type, map, spectator type, or allowed summoners for a code.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_update_code(tournament_code, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str tournament_code: The tournament code to update (required)
        :param TournamentV4TournamentCodeUpdateParameters tournament_code_update_parameters: The fields to update
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.tournament_v4_update_code_with_http_info(tournament_code, **kwargs)  # noqa: E501
        else:
            (data) = self.tournament_v4_update_code_with_http_info(tournament_code, **kwargs)  # noqa: E501
            return data

    def tournament_v4_update_code_with_http_info(self, tournament_code, **kwargs):  # noqa: E501
        """Update the pick type, map, spectator type, or allowed summoners for a code.  # noqa: E501

        Update the pick type, map, spectator type, or allowed summoners for a code.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.tournament_v4_update_code_with_http_info(tournament_code, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str tournament_code: The tournament code to update (required)
        :param TournamentV4TournamentCodeUpdateParameters tournament_code_update_parameters: The fields to update
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['tournament_code', 'tournament_code_update_parameters']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method tournament_v4_update_code" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'tournament_code' is set
        if ('tournament_code' not in params or
                params['tournament_code'] is None):
            raise ValueError("Missing the required parameter `tournament_code` when calling `tournament_v4_update_code`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'tournament_code' in params:
            path_params['tournamentCode'] = params['tournament_code']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'tournament_code_update_parameters' in params:
            body_params = params['tournament_code_update_parameters']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['X-Riot-Token', 'api_key']  # noqa: E501

        return self.api_client.call_api(
            '/lol/tournament/v4/codes/{tournamentCode}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
