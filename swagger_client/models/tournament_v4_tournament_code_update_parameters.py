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


class TournamentV4TournamentCodeUpdateParameters(object):
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
        'spectator_type': 'str',
        'pick_type': 'str',
        'allowed_summoner_ids': 'list[str]',
        'map_type': 'str'
    }

    attribute_map = {
        'spectator_type': 'spectatorType',
        'pick_type': 'pickType',
        'allowed_summoner_ids': 'allowedSummonerIds',
        'map_type': 'mapType'
    }

    def __init__(self, spectator_type=None, pick_type=None, allowed_summoner_ids=None, map_type=None):  # noqa: E501
        """TournamentV4TournamentCodeUpdateParameters - a model defined in Swagger"""  # noqa: E501

        self._spectator_type = None
        self._pick_type = None
        self._allowed_summoner_ids = None
        self._map_type = None
        self.discriminator = None

        self.spectator_type = spectator_type
        self.pick_type = pick_type
        if allowed_summoner_ids is not None:
            self.allowed_summoner_ids = allowed_summoner_ids
        self.map_type = map_type

    @property
    def spectator_type(self):
        """Gets the spectator_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501

        The spectator type              (Legal values:  NONE,  LOBBYONLY,  ALL)  # noqa: E501

        :return: The spectator_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :rtype: str
        """
        return self._spectator_type

    @spectator_type.setter
    def spectator_type(self, spectator_type):
        """Sets the spectator_type of this TournamentV4TournamentCodeUpdateParameters.

        The spectator type              (Legal values:  NONE,  LOBBYONLY,  ALL)  # noqa: E501

        :param spectator_type: The spectator_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :type: str
        """
        if spectator_type is None:
            raise ValueError("Invalid value for `spectator_type`, must not be `None`")  # noqa: E501
        allowed_values = ["NONE", "LOBBYONLY", "ALL"]  # noqa: E501
        if spectator_type not in allowed_values:
            raise ValueError(
                "Invalid value for `spectator_type` ({0}), must be one of {1}"  # noqa: E501
                .format(spectator_type, allowed_values)
            )

        self._spectator_type = spectator_type

    @property
    def pick_type(self):
        """Gets the pick_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501

        The pick type              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT)  # noqa: E501

        :return: The pick_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :rtype: str
        """
        return self._pick_type

    @pick_type.setter
    def pick_type(self, pick_type):
        """Sets the pick_type of this TournamentV4TournamentCodeUpdateParameters.

        The pick type              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT)  # noqa: E501

        :param pick_type: The pick_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :type: str
        """
        if pick_type is None:
            raise ValueError("Invalid value for `pick_type`, must not be `None`")  # noqa: E501
        allowed_values = ["BLIND_PICK", "DRAFT_MODE", "ALL_RANDOM", "TOURNAMENT_DRAFT"]  # noqa: E501
        if pick_type not in allowed_values:
            raise ValueError(
                "Invalid value for `pick_type` ({0}), must be one of {1}"  # noqa: E501
                .format(pick_type, allowed_values)
            )

        self._pick_type = pick_type

    @property
    def allowed_summoner_ids(self):
        """Gets the allowed_summoner_ids of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501

        Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future.  # noqa: E501

        :return: The allowed_summoner_ids of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :rtype: list[str]
        """
        return self._allowed_summoner_ids

    @allowed_summoner_ids.setter
    def allowed_summoner_ids(self, allowed_summoner_ids):
        """Sets the allowed_summoner_ids of this TournamentV4TournamentCodeUpdateParameters.

        Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future.  # noqa: E501

        :param allowed_summoner_ids: The allowed_summoner_ids of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :type: list[str]
        """

        self._allowed_summoner_ids = allowed_summoner_ids

    @property
    def map_type(self):
        """Gets the map_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501

        The map type              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS)  # noqa: E501

        :return: The map_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :rtype: str
        """
        return self._map_type

    @map_type.setter
    def map_type(self, map_type):
        """Sets the map_type of this TournamentV4TournamentCodeUpdateParameters.

        The map type              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS)  # noqa: E501

        :param map_type: The map_type of this TournamentV4TournamentCodeUpdateParameters.  # noqa: E501
        :type: str
        """
        if map_type is None:
            raise ValueError("Invalid value for `map_type`, must not be `None`")  # noqa: E501
        allowed_values = ["SUMMONERS_RIFT", "TWISTED_TREELINE", "HOWLING_ABYSS"]  # noqa: E501
        if map_type not in allowed_values:
            raise ValueError(
                "Invalid value for `map_type` ({0}), must be one of {1}"  # noqa: E501
                .format(map_type, allowed_values)
            )

        self._map_type = map_type

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
        if issubclass(TournamentV4TournamentCodeUpdateParameters, dict):
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
        if not isinstance(other, TournamentV4TournamentCodeUpdateParameters):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
