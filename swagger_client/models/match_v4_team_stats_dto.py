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

from swagger_client.models.match_v4_team_bans_dto import MatchV4TeamBansDto  # noqa: F401,E501


class MatchV4TeamStatsDto(object):
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
        'first_dragon': 'bool',
        'first_inhibitor': 'bool',
        'bans': 'list[MatchV4TeamBansDto]',
        'baron_kills': 'int',
        'first_rift_herald': 'bool',
        'first_baron': 'bool',
        'rift_herald_kills': 'int',
        'first_blood': 'bool',
        'team_id': 'int',
        'first_tower': 'bool',
        'vilemaw_kills': 'int',
        'inhibitor_kills': 'int',
        'tower_kills': 'int',
        'dominion_victory_score': 'int',
        'win': 'str',
        'dragon_kills': 'int'
    }

    attribute_map = {
        'first_dragon': 'firstDragon',
        'first_inhibitor': 'firstInhibitor',
        'bans': 'bans',
        'baron_kills': 'baronKills',
        'first_rift_herald': 'firstRiftHerald',
        'first_baron': 'firstBaron',
        'rift_herald_kills': 'riftHeraldKills',
        'first_blood': 'firstBlood',
        'team_id': 'teamId',
        'first_tower': 'firstTower',
        'vilemaw_kills': 'vilemawKills',
        'inhibitor_kills': 'inhibitorKills',
        'tower_kills': 'towerKills',
        'dominion_victory_score': 'dominionVictoryScore',
        'win': 'win',
        'dragon_kills': 'dragonKills'
    }

    def __init__(self, first_dragon=None, first_inhibitor=None, bans=None, baron_kills=None, first_rift_herald=None, first_baron=None, rift_herald_kills=None, first_blood=None, team_id=None, first_tower=None, vilemaw_kills=None, inhibitor_kills=None, tower_kills=None, dominion_victory_score=None, win=None, dragon_kills=None):  # noqa: E501
        """MatchV4TeamStatsDto - a model defined in Swagger"""  # noqa: E501

        self._first_dragon = None
        self._first_inhibitor = None
        self._bans = None
        self._baron_kills = None
        self._first_rift_herald = None
        self._first_baron = None
        self._rift_herald_kills = None
        self._first_blood = None
        self._team_id = None
        self._first_tower = None
        self._vilemaw_kills = None
        self._inhibitor_kills = None
        self._tower_kills = None
        self._dominion_victory_score = None
        self._win = None
        self._dragon_kills = None
        self.discriminator = None

        if first_dragon is not None:
            self.first_dragon = first_dragon
        if first_inhibitor is not None:
            self.first_inhibitor = first_inhibitor
        if bans is not None:
            self.bans = bans
        if baron_kills is not None:
            self.baron_kills = baron_kills
        if first_rift_herald is not None:
            self.first_rift_herald = first_rift_herald
        if first_baron is not None:
            self.first_baron = first_baron
        if rift_herald_kills is not None:
            self.rift_herald_kills = rift_herald_kills
        if first_blood is not None:
            self.first_blood = first_blood
        if team_id is not None:
            self.team_id = team_id
        if first_tower is not None:
            self.first_tower = first_tower
        if vilemaw_kills is not None:
            self.vilemaw_kills = vilemaw_kills
        if inhibitor_kills is not None:
            self.inhibitor_kills = inhibitor_kills
        if tower_kills is not None:
            self.tower_kills = tower_kills
        if dominion_victory_score is not None:
            self.dominion_victory_score = dominion_victory_score
        if win is not None:
            self.win = win
        if dragon_kills is not None:
            self.dragon_kills = dragon_kills

    @property
    def first_dragon(self):
        """Gets the first_dragon of this MatchV4TeamStatsDto.  # noqa: E501

        Flag indicating whether or not the team scored the first Dragon kill.  # noqa: E501

        :return: The first_dragon of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: bool
        """
        return self._first_dragon

    @first_dragon.setter
    def first_dragon(self, first_dragon):
        """Sets the first_dragon of this MatchV4TeamStatsDto.

        Flag indicating whether or not the team scored the first Dragon kill.  # noqa: E501

        :param first_dragon: The first_dragon of this MatchV4TeamStatsDto.  # noqa: E501
        :type: bool
        """

        self._first_dragon = first_dragon

    @property
    def first_inhibitor(self):
        """Gets the first_inhibitor of this MatchV4TeamStatsDto.  # noqa: E501

        Flag indicating whether or not the team destroyed the first inhibitor.  # noqa: E501

        :return: The first_inhibitor of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: bool
        """
        return self._first_inhibitor

    @first_inhibitor.setter
    def first_inhibitor(self, first_inhibitor):
        """Sets the first_inhibitor of this MatchV4TeamStatsDto.

        Flag indicating whether or not the team destroyed the first inhibitor.  # noqa: E501

        :param first_inhibitor: The first_inhibitor of this MatchV4TeamStatsDto.  # noqa: E501
        :type: bool
        """

        self._first_inhibitor = first_inhibitor

    @property
    def bans(self):
        """Gets the bans of this MatchV4TeamStatsDto.  # noqa: E501

        If match queueId has a draft, contains banned champion data, otherwise empty.  # noqa: E501

        :return: The bans of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: list[MatchV4TeamBansDto]
        """
        return self._bans

    @bans.setter
    def bans(self, bans):
        """Sets the bans of this MatchV4TeamStatsDto.

        If match queueId has a draft, contains banned champion data, otherwise empty.  # noqa: E501

        :param bans: The bans of this MatchV4TeamStatsDto.  # noqa: E501
        :type: list[MatchV4TeamBansDto]
        """

        self._bans = bans

    @property
    def baron_kills(self):
        """Gets the baron_kills of this MatchV4TeamStatsDto.  # noqa: E501

        Number of times the team killed Baron.  # noqa: E501

        :return: The baron_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._baron_kills

    @baron_kills.setter
    def baron_kills(self, baron_kills):
        """Sets the baron_kills of this MatchV4TeamStatsDto.

        Number of times the team killed Baron.  # noqa: E501

        :param baron_kills: The baron_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._baron_kills = baron_kills

    @property
    def first_rift_herald(self):
        """Gets the first_rift_herald of this MatchV4TeamStatsDto.  # noqa: E501

        Flag indicating whether or not the team scored the first Rift Herald kill.  # noqa: E501

        :return: The first_rift_herald of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: bool
        """
        return self._first_rift_herald

    @first_rift_herald.setter
    def first_rift_herald(self, first_rift_herald):
        """Sets the first_rift_herald of this MatchV4TeamStatsDto.

        Flag indicating whether or not the team scored the first Rift Herald kill.  # noqa: E501

        :param first_rift_herald: The first_rift_herald of this MatchV4TeamStatsDto.  # noqa: E501
        :type: bool
        """

        self._first_rift_herald = first_rift_herald

    @property
    def first_baron(self):
        """Gets the first_baron of this MatchV4TeamStatsDto.  # noqa: E501

        Flag indicating whether or not the team scored the first Baron kill.  # noqa: E501

        :return: The first_baron of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: bool
        """
        return self._first_baron

    @first_baron.setter
    def first_baron(self, first_baron):
        """Sets the first_baron of this MatchV4TeamStatsDto.

        Flag indicating whether or not the team scored the first Baron kill.  # noqa: E501

        :param first_baron: The first_baron of this MatchV4TeamStatsDto.  # noqa: E501
        :type: bool
        """

        self._first_baron = first_baron

    @property
    def rift_herald_kills(self):
        """Gets the rift_herald_kills of this MatchV4TeamStatsDto.  # noqa: E501

        Number of times the team killed Rift Herald.  # noqa: E501

        :return: The rift_herald_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._rift_herald_kills

    @rift_herald_kills.setter
    def rift_herald_kills(self, rift_herald_kills):
        """Sets the rift_herald_kills of this MatchV4TeamStatsDto.

        Number of times the team killed Rift Herald.  # noqa: E501

        :param rift_herald_kills: The rift_herald_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._rift_herald_kills = rift_herald_kills

    @property
    def first_blood(self):
        """Gets the first_blood of this MatchV4TeamStatsDto.  # noqa: E501

        Flag indicating whether or not the team scored the first blood.  # noqa: E501

        :return: The first_blood of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: bool
        """
        return self._first_blood

    @first_blood.setter
    def first_blood(self, first_blood):
        """Sets the first_blood of this MatchV4TeamStatsDto.

        Flag indicating whether or not the team scored the first blood.  # noqa: E501

        :param first_blood: The first_blood of this MatchV4TeamStatsDto.  # noqa: E501
        :type: bool
        """

        self._first_blood = first_blood

    @property
    def team_id(self):
        """Gets the team_id of this MatchV4TeamStatsDto.  # noqa: E501

        100 for blue side. 200 for red side.  # noqa: E501

        :return: The team_id of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._team_id

    @team_id.setter
    def team_id(self, team_id):
        """Sets the team_id of this MatchV4TeamStatsDto.

        100 for blue side. 200 for red side.  # noqa: E501

        :param team_id: The team_id of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._team_id = team_id

    @property
    def first_tower(self):
        """Gets the first_tower of this MatchV4TeamStatsDto.  # noqa: E501

        Flag indicating whether or not the team destroyed the first tower.  # noqa: E501

        :return: The first_tower of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: bool
        """
        return self._first_tower

    @first_tower.setter
    def first_tower(self, first_tower):
        """Sets the first_tower of this MatchV4TeamStatsDto.

        Flag indicating whether or not the team destroyed the first tower.  # noqa: E501

        :param first_tower: The first_tower of this MatchV4TeamStatsDto.  # noqa: E501
        :type: bool
        """

        self._first_tower = first_tower

    @property
    def vilemaw_kills(self):
        """Gets the vilemaw_kills of this MatchV4TeamStatsDto.  # noqa: E501

        Number of times the team killed Vilemaw.  # noqa: E501

        :return: The vilemaw_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._vilemaw_kills

    @vilemaw_kills.setter
    def vilemaw_kills(self, vilemaw_kills):
        """Sets the vilemaw_kills of this MatchV4TeamStatsDto.

        Number of times the team killed Vilemaw.  # noqa: E501

        :param vilemaw_kills: The vilemaw_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._vilemaw_kills = vilemaw_kills

    @property
    def inhibitor_kills(self):
        """Gets the inhibitor_kills of this MatchV4TeamStatsDto.  # noqa: E501

        Number of inhibitors the team destroyed.  # noqa: E501

        :return: The inhibitor_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._inhibitor_kills

    @inhibitor_kills.setter
    def inhibitor_kills(self, inhibitor_kills):
        """Sets the inhibitor_kills of this MatchV4TeamStatsDto.

        Number of inhibitors the team destroyed.  # noqa: E501

        :param inhibitor_kills: The inhibitor_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._inhibitor_kills = inhibitor_kills

    @property
    def tower_kills(self):
        """Gets the tower_kills of this MatchV4TeamStatsDto.  # noqa: E501

        Number of towers the team destroyed.  # noqa: E501

        :return: The tower_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._tower_kills

    @tower_kills.setter
    def tower_kills(self, tower_kills):
        """Sets the tower_kills of this MatchV4TeamStatsDto.

        Number of towers the team destroyed.  # noqa: E501

        :param tower_kills: The tower_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._tower_kills = tower_kills

    @property
    def dominion_victory_score(self):
        """Gets the dominion_victory_score of this MatchV4TeamStatsDto.  # noqa: E501

        For Dominion matches, specifies the points the team had at game end.  # noqa: E501

        :return: The dominion_victory_score of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._dominion_victory_score

    @dominion_victory_score.setter
    def dominion_victory_score(self, dominion_victory_score):
        """Sets the dominion_victory_score of this MatchV4TeamStatsDto.

        For Dominion matches, specifies the points the team had at game end.  # noqa: E501

        :param dominion_victory_score: The dominion_victory_score of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._dominion_victory_score = dominion_victory_score

    @property
    def win(self):
        """Gets the win of this MatchV4TeamStatsDto.  # noqa: E501

        String indicating whether or not the team won. There are only two values visibile in public match history.              (Legal values:  Fail,  Win)  # noqa: E501

        :return: The win of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: str
        """
        return self._win

    @win.setter
    def win(self, win):
        """Sets the win of this MatchV4TeamStatsDto.

        String indicating whether or not the team won. There are only two values visibile in public match history.              (Legal values:  Fail,  Win)  # noqa: E501

        :param win: The win of this MatchV4TeamStatsDto.  # noqa: E501
        :type: str
        """
        allowed_values = ["Fail", "Win"]  # noqa: E501
        if win not in allowed_values:
            raise ValueError(
                "Invalid value for `win` ({0}), must be one of {1}"  # noqa: E501
                .format(win, allowed_values)
            )

        self._win = win

    @property
    def dragon_kills(self):
        """Gets the dragon_kills of this MatchV4TeamStatsDto.  # noqa: E501

        Number of times the team killed Dragon.  # noqa: E501

        :return: The dragon_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :rtype: int
        """
        return self._dragon_kills

    @dragon_kills.setter
    def dragon_kills(self, dragon_kills):
        """Sets the dragon_kills of this MatchV4TeamStatsDto.

        Number of times the team killed Dragon.  # noqa: E501

        :param dragon_kills: The dragon_kills of this MatchV4TeamStatsDto.  # noqa: E501
        :type: int
        """

        self._dragon_kills = dragon_kills

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
        if issubclass(MatchV4TeamStatsDto, dict):
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
        if not isinstance(other, MatchV4TeamStatsDto):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
