# coding: utf-8

"""
    Riot API

     OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. ***   # noqa: E501

    OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.spectator_v4_featured_game_info import SpectatorV4FeaturedGameInfo  # noqa: F401,E501


class SpectatorV4FeaturedGames(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'client_refresh_interval': 'int',
        'game_list': 'list[SpectatorV4FeaturedGameInfo]'
    }

    attribute_map = {
        'client_refresh_interval': 'clientRefreshInterval',
        'game_list': 'gameList'
    }

    def __init__(self, client_refresh_interval=None, game_list=None):  # noqa: E501
        """SpectatorV4FeaturedGames - a model defined in Swagger"""  # noqa: E501

        self._client_refresh_interval = None
        self._game_list = None
        self.discriminator = None

        if client_refresh_interval is not None:
            self.client_refresh_interval = client_refresh_interval
        if game_list is not None:
            self.game_list = game_list

    @property
    def client_refresh_interval(self):
        """Gets the client_refresh_interval of this SpectatorV4FeaturedGames.  # noqa: E501

        The suggested interval to wait before requesting FeaturedGames again  # noqa: E501

        :return: The client_refresh_interval of this SpectatorV4FeaturedGames.  # noqa: E501
        :rtype: int
        """
        return self._client_refresh_interval

    @client_refresh_interval.setter
    def client_refresh_interval(self, client_refresh_interval):
        """Sets the client_refresh_interval of this SpectatorV4FeaturedGames.

        The suggested interval to wait before requesting FeaturedGames again  # noqa: E501

        :param client_refresh_interval: The client_refresh_interval of this SpectatorV4FeaturedGames.  # noqa: E501
        :type: int
        """

        self._client_refresh_interval = client_refresh_interval

    @property
    def game_list(self):
        """Gets the game_list of this SpectatorV4FeaturedGames.  # noqa: E501

        The list of featured games  # noqa: E501

        :return: The game_list of this SpectatorV4FeaturedGames.  # noqa: E501
        :rtype: list[SpectatorV4FeaturedGameInfo]
        """
        return self._game_list

    @game_list.setter
    def game_list(self, game_list):
        """Sets the game_list of this SpectatorV4FeaturedGames.

        The list of featured games  # noqa: E501

        :param game_list: The game_list of this SpectatorV4FeaturedGames.  # noqa: E501
        :type: list[SpectatorV4FeaturedGameInfo]
        """

        self._game_list = game_list

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(SpectatorV4FeaturedGames, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, SpectatorV4FeaturedGames):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other