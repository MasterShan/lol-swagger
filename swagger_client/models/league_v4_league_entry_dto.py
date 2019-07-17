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

from swagger_client.models.league_v4_mini_series_dto import LeagueV4MiniSeriesDTO  # noqa: F401,E501


class LeagueV4LeagueEntryDTO(object):
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
        'queue_type': 'str',
        'summoner_name': 'str',
        'hot_streak': 'bool',
        'mini_series': 'LeagueV4MiniSeriesDTO',
        'wins': 'int',
        'veteran': 'bool',
        'losses': 'int',
        'rank': 'str',
        'league_id': 'str',
        'inactive': 'bool',
        'fresh_blood': 'bool',
        'tier': 'str',
        'summoner_id': 'str',
        'league_points': 'int'
    }

    attribute_map = {
        'queue_type': 'queueType',
        'summoner_name': 'summonerName',
        'hot_streak': 'hotStreak',
        'mini_series': 'miniSeries',
        'wins': 'wins',
        'veteran': 'veteran',
        'losses': 'losses',
        'rank': 'rank',
        'league_id': 'leagueId',
        'inactive': 'inactive',
        'fresh_blood': 'freshBlood',
        'tier': 'tier',
        'summoner_id': 'summonerId',
        'league_points': 'leaguePoints'
    }

    def __init__(self, queue_type=None, summoner_name=None, hot_streak=None, mini_series=None, wins=None, veteran=None, losses=None, rank=None, league_id=None, inactive=None, fresh_blood=None, tier=None, summoner_id=None, league_points=None):  # noqa: E501
        """LeagueV4LeagueEntryDTO - a model defined in Swagger"""  # noqa: E501

        self._queue_type = None
        self._summoner_name = None
        self._hot_streak = None
        self._mini_series = None
        self._wins = None
        self._veteran = None
        self._losses = None
        self._rank = None
        self._league_id = None
        self._inactive = None
        self._fresh_blood = None
        self._tier = None
        self._summoner_id = None
        self._league_points = None
        self.discriminator = None

        if queue_type is not None:
            self.queue_type = queue_type
        if summoner_name is not None:
            self.summoner_name = summoner_name
        if hot_streak is not None:
            self.hot_streak = hot_streak
        if mini_series is not None:
            self.mini_series = mini_series
        if wins is not None:
            self.wins = wins
        if veteran is not None:
            self.veteran = veteran
        if losses is not None:
            self.losses = losses
        if rank is not None:
            self.rank = rank
        if league_id is not None:
            self.league_id = league_id
        if inactive is not None:
            self.inactive = inactive
        if fresh_blood is not None:
            self.fresh_blood = fresh_blood
        if tier is not None:
            self.tier = tier
        if summoner_id is not None:
            self.summoner_id = summoner_id
        if league_points is not None:
            self.league_points = league_points

    @property
    def queue_type(self):
        """Gets the queue_type of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The queue_type of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: str
        """
        return self._queue_type

    @queue_type.setter
    def queue_type(self, queue_type):
        """Sets the queue_type of this LeagueV4LeagueEntryDTO.


        :param queue_type: The queue_type of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: str
        """

        self._queue_type = queue_type

    @property
    def summoner_name(self):
        """Gets the summoner_name of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The summoner_name of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: str
        """
        return self._summoner_name

    @summoner_name.setter
    def summoner_name(self, summoner_name):
        """Sets the summoner_name of this LeagueV4LeagueEntryDTO.


        :param summoner_name: The summoner_name of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: str
        """

        self._summoner_name = summoner_name

    @property
    def hot_streak(self):
        """Gets the hot_streak of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The hot_streak of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: bool
        """
        return self._hot_streak

    @hot_streak.setter
    def hot_streak(self, hot_streak):
        """Sets the hot_streak of this LeagueV4LeagueEntryDTO.


        :param hot_streak: The hot_streak of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: bool
        """

        self._hot_streak = hot_streak

    @property
    def mini_series(self):
        """Gets the mini_series of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The mini_series of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: LeagueV4MiniSeriesDTO
        """
        return self._mini_series

    @mini_series.setter
    def mini_series(self, mini_series):
        """Sets the mini_series of this LeagueV4LeagueEntryDTO.


        :param mini_series: The mini_series of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: LeagueV4MiniSeriesDTO
        """

        self._mini_series = mini_series

    @property
    def wins(self):
        """Gets the wins of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The wins of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: int
        """
        return self._wins

    @wins.setter
    def wins(self, wins):
        """Sets the wins of this LeagueV4LeagueEntryDTO.


        :param wins: The wins of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: int
        """

        self._wins = wins

    @property
    def veteran(self):
        """Gets the veteran of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The veteran of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: bool
        """
        return self._veteran

    @veteran.setter
    def veteran(self, veteran):
        """Sets the veteran of this LeagueV4LeagueEntryDTO.


        :param veteran: The veteran of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: bool
        """

        self._veteran = veteran

    @property
    def losses(self):
        """Gets the losses of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The losses of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: int
        """
        return self._losses

    @losses.setter
    def losses(self, losses):
        """Sets the losses of this LeagueV4LeagueEntryDTO.


        :param losses: The losses of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: int
        """

        self._losses = losses

    @property
    def rank(self):
        """Gets the rank of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The rank of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: str
        """
        return self._rank

    @rank.setter
    def rank(self, rank):
        """Sets the rank of this LeagueV4LeagueEntryDTO.


        :param rank: The rank of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: str
        """

        self._rank = rank

    @property
    def league_id(self):
        """Gets the league_id of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The league_id of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: str
        """
        return self._league_id

    @league_id.setter
    def league_id(self, league_id):
        """Sets the league_id of this LeagueV4LeagueEntryDTO.


        :param league_id: The league_id of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: str
        """

        self._league_id = league_id

    @property
    def inactive(self):
        """Gets the inactive of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The inactive of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: bool
        """
        return self._inactive

    @inactive.setter
    def inactive(self, inactive):
        """Sets the inactive of this LeagueV4LeagueEntryDTO.


        :param inactive: The inactive of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: bool
        """

        self._inactive = inactive

    @property
    def fresh_blood(self):
        """Gets the fresh_blood of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The fresh_blood of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: bool
        """
        return self._fresh_blood

    @fresh_blood.setter
    def fresh_blood(self, fresh_blood):
        """Sets the fresh_blood of this LeagueV4LeagueEntryDTO.


        :param fresh_blood: The fresh_blood of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: bool
        """

        self._fresh_blood = fresh_blood

    @property
    def tier(self):
        """Gets the tier of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The tier of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: str
        """
        return self._tier

    @tier.setter
    def tier(self, tier):
        """Sets the tier of this LeagueV4LeagueEntryDTO.


        :param tier: The tier of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: str
        """

        self._tier = tier

    @property
    def summoner_id(self):
        """Gets the summoner_id of this LeagueV4LeagueEntryDTO.  # noqa: E501

        Player's summonerId (Encrypted)  # noqa: E501

        :return: The summoner_id of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: str
        """
        return self._summoner_id

    @summoner_id.setter
    def summoner_id(self, summoner_id):
        """Sets the summoner_id of this LeagueV4LeagueEntryDTO.

        Player's summonerId (Encrypted)  # noqa: E501

        :param summoner_id: The summoner_id of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: str
        """

        self._summoner_id = summoner_id

    @property
    def league_points(self):
        """Gets the league_points of this LeagueV4LeagueEntryDTO.  # noqa: E501


        :return: The league_points of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :rtype: int
        """
        return self._league_points

    @league_points.setter
    def league_points(self, league_points):
        """Sets the league_points of this LeagueV4LeagueEntryDTO.


        :param league_points: The league_points of this LeagueV4LeagueEntryDTO.  # noqa: E501
        :type: int
        """

        self._league_points = league_points

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
        if issubclass(LeagueV4LeagueEntryDTO, dict):
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
        if not isinstance(other, LeagueV4LeagueEntryDTO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
