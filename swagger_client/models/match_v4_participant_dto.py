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

from swagger_client.models.match_v4_mastery_dto import MatchV4MasteryDto  # noqa: F401,E501
from swagger_client.models.match_v4_participant_stats_dto import MatchV4ParticipantStatsDto  # noqa: F401,E501
from swagger_client.models.match_v4_participant_timeline_dto import MatchV4ParticipantTimelineDto  # noqa: F401,E501
from swagger_client.models.match_v4_rune_dto import MatchV4RuneDto  # noqa: F401,E501


class MatchV4ParticipantDto(object):
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
        'stats': 'MatchV4ParticipantStatsDto',
        'participant_id': 'int',
        'runes': 'list[MatchV4RuneDto]',
        'timeline': 'MatchV4ParticipantTimelineDto',
        'team_id': 'int',
        'spell2_id': 'int',
        'masteries': 'list[MatchV4MasteryDto]',
        'highest_achieved_season_tier': 'str',
        'spell1_id': 'int',
        'champion_id': 'int'
    }

    attribute_map = {
        'stats': 'stats',
        'participant_id': 'participantId',
        'runes': 'runes',
        'timeline': 'timeline',
        'team_id': 'teamId',
        'spell2_id': 'spell2Id',
        'masteries': 'masteries',
        'highest_achieved_season_tier': 'highestAchievedSeasonTier',
        'spell1_id': 'spell1Id',
        'champion_id': 'championId'
    }

    def __init__(self, stats=None, participant_id=None, runes=None, timeline=None, team_id=None, spell2_id=None, masteries=None, highest_achieved_season_tier=None, spell1_id=None, champion_id=None):  # noqa: E501
        """MatchV4ParticipantDto - a model defined in Swagger"""  # noqa: E501

        self._stats = None
        self._participant_id = None
        self._runes = None
        self._timeline = None
        self._team_id = None
        self._spell2_id = None
        self._masteries = None
        self._highest_achieved_season_tier = None
        self._spell1_id = None
        self._champion_id = None
        self.discriminator = None

        if stats is not None:
            self.stats = stats
        if participant_id is not None:
            self.participant_id = participant_id
        if runes is not None:
            self.runes = runes
        if timeline is not None:
            self.timeline = timeline
        if team_id is not None:
            self.team_id = team_id
        if spell2_id is not None:
            self.spell2_id = spell2_id
        if masteries is not None:
            self.masteries = masteries
        if highest_achieved_season_tier is not None:
            self.highest_achieved_season_tier = highest_achieved_season_tier
        if spell1_id is not None:
            self.spell1_id = spell1_id
        if champion_id is not None:
            self.champion_id = champion_id

    @property
    def stats(self):
        """Gets the stats of this MatchV4ParticipantDto.  # noqa: E501

        Participant statistics.  # noqa: E501

        :return: The stats of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: MatchV4ParticipantStatsDto
        """
        return self._stats

    @stats.setter
    def stats(self, stats):
        """Sets the stats of this MatchV4ParticipantDto.

        Participant statistics.  # noqa: E501

        :param stats: The stats of this MatchV4ParticipantDto.  # noqa: E501
        :type: MatchV4ParticipantStatsDto
        """

        self._stats = stats

    @property
    def participant_id(self):
        """Gets the participant_id of this MatchV4ParticipantDto.  # noqa: E501


        :return: The participant_id of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: int
        """
        return self._participant_id

    @participant_id.setter
    def participant_id(self, participant_id):
        """Sets the participant_id of this MatchV4ParticipantDto.


        :param participant_id: The participant_id of this MatchV4ParticipantDto.  # noqa: E501
        :type: int
        """

        self._participant_id = participant_id

    @property
    def runes(self):
        """Gets the runes of this MatchV4ParticipantDto.  # noqa: E501

        List of legacy Rune information. Not included for matches played with Runes Reforged.  # noqa: E501

        :return: The runes of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: list[MatchV4RuneDto]
        """
        return self._runes

    @runes.setter
    def runes(self, runes):
        """Sets the runes of this MatchV4ParticipantDto.

        List of legacy Rune information. Not included for matches played with Runes Reforged.  # noqa: E501

        :param runes: The runes of this MatchV4ParticipantDto.  # noqa: E501
        :type: list[MatchV4RuneDto]
        """

        self._runes = runes

    @property
    def timeline(self):
        """Gets the timeline of this MatchV4ParticipantDto.  # noqa: E501

        Participant timeline data.  # noqa: E501

        :return: The timeline of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: MatchV4ParticipantTimelineDto
        """
        return self._timeline

    @timeline.setter
    def timeline(self, timeline):
        """Sets the timeline of this MatchV4ParticipantDto.

        Participant timeline data.  # noqa: E501

        :param timeline: The timeline of this MatchV4ParticipantDto.  # noqa: E501
        :type: MatchV4ParticipantTimelineDto
        """

        self._timeline = timeline

    @property
    def team_id(self):
        """Gets the team_id of this MatchV4ParticipantDto.  # noqa: E501

        100 for blue side. 200 for red side.  # noqa: E501

        :return: The team_id of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: int
        """
        return self._team_id

    @team_id.setter
    def team_id(self, team_id):
        """Sets the team_id of this MatchV4ParticipantDto.

        100 for blue side. 200 for red side.  # noqa: E501

        :param team_id: The team_id of this MatchV4ParticipantDto.  # noqa: E501
        :type: int
        """

        self._team_id = team_id

    @property
    def spell2_id(self):
        """Gets the spell2_id of this MatchV4ParticipantDto.  # noqa: E501

        Second Summoner Spell id.  # noqa: E501

        :return: The spell2_id of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: int
        """
        return self._spell2_id

    @spell2_id.setter
    def spell2_id(self, spell2_id):
        """Sets the spell2_id of this MatchV4ParticipantDto.

        Second Summoner Spell id.  # noqa: E501

        :param spell2_id: The spell2_id of this MatchV4ParticipantDto.  # noqa: E501
        :type: int
        """

        self._spell2_id = spell2_id

    @property
    def masteries(self):
        """Gets the masteries of this MatchV4ParticipantDto.  # noqa: E501

        List of legacy Mastery information. Not included for matches played with Runes Reforged.  # noqa: E501

        :return: The masteries of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: list[MatchV4MasteryDto]
        """
        return self._masteries

    @masteries.setter
    def masteries(self, masteries):
        """Sets the masteries of this MatchV4ParticipantDto.

        List of legacy Mastery information. Not included for matches played with Runes Reforged.  # noqa: E501

        :param masteries: The masteries of this MatchV4ParticipantDto.  # noqa: E501
        :type: list[MatchV4MasteryDto]
        """

        self._masteries = masteries

    @property
    def highest_achieved_season_tier(self):
        """Gets the highest_achieved_season_tier of this MatchV4ParticipantDto.  # noqa: E501

        Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation.              (Legal values:  CHALLENGER,  MASTER,  DIAMOND,  PLATINUM,  GOLD,  SILVER,  BRONZE,  UNRANKED)  # noqa: E501

        :return: The highest_achieved_season_tier of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: str
        """
        return self._highest_achieved_season_tier

    @highest_achieved_season_tier.setter
    def highest_achieved_season_tier(self, highest_achieved_season_tier):
        """Sets the highest_achieved_season_tier of this MatchV4ParticipantDto.

        Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation.              (Legal values:  CHALLENGER,  MASTER,  DIAMOND,  PLATINUM,  GOLD,  SILVER,  BRONZE,  UNRANKED)  # noqa: E501

        :param highest_achieved_season_tier: The highest_achieved_season_tier of this MatchV4ParticipantDto.  # noqa: E501
        :type: str
        """
        allowed_values = ["CHALLENGER", "MASTER", "DIAMOND", "PLATINUM", "GOLD", "SILVER", "BRONZE", "UNRANKED"]  # noqa: E501
        if highest_achieved_season_tier not in allowed_values:
            raise ValueError(
                "Invalid value for `highest_achieved_season_tier` ({0}), must be one of {1}"  # noqa: E501
                .format(highest_achieved_season_tier, allowed_values)
            )

        self._highest_achieved_season_tier = highest_achieved_season_tier

    @property
    def spell1_id(self):
        """Gets the spell1_id of this MatchV4ParticipantDto.  # noqa: E501

        First Summoner Spell id.  # noqa: E501

        :return: The spell1_id of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: int
        """
        return self._spell1_id

    @spell1_id.setter
    def spell1_id(self, spell1_id):
        """Sets the spell1_id of this MatchV4ParticipantDto.

        First Summoner Spell id.  # noqa: E501

        :param spell1_id: The spell1_id of this MatchV4ParticipantDto.  # noqa: E501
        :type: int
        """

        self._spell1_id = spell1_id

    @property
    def champion_id(self):
        """Gets the champion_id of this MatchV4ParticipantDto.  # noqa: E501


        :return: The champion_id of this MatchV4ParticipantDto.  # noqa: E501
        :rtype: int
        """
        return self._champion_id

    @champion_id.setter
    def champion_id(self, champion_id):
        """Sets the champion_id of this MatchV4ParticipantDto.


        :param champion_id: The champion_id of this MatchV4ParticipantDto.  # noqa: E501
        :type: int
        """

        self._champion_id = champion_id

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
        if issubclass(MatchV4ParticipantDto, dict):
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
        if not isinstance(other, MatchV4ParticipantDto):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other