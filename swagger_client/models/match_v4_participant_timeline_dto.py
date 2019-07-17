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


class MatchV4ParticipantTimelineDto(object):
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
        'lane': 'str',
        'participant_id': 'int',
        'cs_diff_per_min_deltas': 'dict(str, float)',
        'gold_per_min_deltas': 'dict(str, float)',
        'xp_diff_per_min_deltas': 'dict(str, float)',
        'creeps_per_min_deltas': 'dict(str, float)',
        'xp_per_min_deltas': 'dict(str, float)',
        'role': 'str',
        'damage_taken_diff_per_min_deltas': 'dict(str, float)',
        'damage_taken_per_min_deltas': 'dict(str, float)'
    }

    attribute_map = {
        'lane': 'lane',
        'participant_id': 'participantId',
        'cs_diff_per_min_deltas': 'csDiffPerMinDeltas',
        'gold_per_min_deltas': 'goldPerMinDeltas',
        'xp_diff_per_min_deltas': 'xpDiffPerMinDeltas',
        'creeps_per_min_deltas': 'creepsPerMinDeltas',
        'xp_per_min_deltas': 'xpPerMinDeltas',
        'role': 'role',
        'damage_taken_diff_per_min_deltas': 'damageTakenDiffPerMinDeltas',
        'damage_taken_per_min_deltas': 'damageTakenPerMinDeltas'
    }

    def __init__(self, lane=None, participant_id=None, cs_diff_per_min_deltas=None, gold_per_min_deltas=None, xp_diff_per_min_deltas=None, creeps_per_min_deltas=None, xp_per_min_deltas=None, role=None, damage_taken_diff_per_min_deltas=None, damage_taken_per_min_deltas=None):  # noqa: E501
        """MatchV4ParticipantTimelineDto - a model defined in Swagger"""  # noqa: E501

        self._lane = None
        self._participant_id = None
        self._cs_diff_per_min_deltas = None
        self._gold_per_min_deltas = None
        self._xp_diff_per_min_deltas = None
        self._creeps_per_min_deltas = None
        self._xp_per_min_deltas = None
        self._role = None
        self._damage_taken_diff_per_min_deltas = None
        self._damage_taken_per_min_deltas = None
        self.discriminator = None

        if lane is not None:
            self.lane = lane
        if participant_id is not None:
            self.participant_id = participant_id
        if cs_diff_per_min_deltas is not None:
            self.cs_diff_per_min_deltas = cs_diff_per_min_deltas
        if gold_per_min_deltas is not None:
            self.gold_per_min_deltas = gold_per_min_deltas
        if xp_diff_per_min_deltas is not None:
            self.xp_diff_per_min_deltas = xp_diff_per_min_deltas
        if creeps_per_min_deltas is not None:
            self.creeps_per_min_deltas = creeps_per_min_deltas
        if xp_per_min_deltas is not None:
            self.xp_per_min_deltas = xp_per_min_deltas
        if role is not None:
            self.role = role
        if damage_taken_diff_per_min_deltas is not None:
            self.damage_taken_diff_per_min_deltas = damage_taken_diff_per_min_deltas
        if damage_taken_per_min_deltas is not None:
            self.damage_taken_per_min_deltas = damage_taken_per_min_deltas

    @property
    def lane(self):
        """Gets the lane of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Participant's calculated lane. MID and BOT are legacy values.              (Legal values:  MID,  MIDDLE,  TOP,  JUNGLE,  BOT,  BOTTOM)  # noqa: E501

        :return: The lane of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: str
        """
        return self._lane

    @lane.setter
    def lane(self, lane):
        """Sets the lane of this MatchV4ParticipantTimelineDto.

        Participant's calculated lane. MID and BOT are legacy values.              (Legal values:  MID,  MIDDLE,  TOP,  JUNGLE,  BOT,  BOTTOM)  # noqa: E501

        :param lane: The lane of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: str
        """
        allowed_values = ["MID", "MIDDLE", "TOP", "JUNGLE", "BOT", "BOTTOM"]  # noqa: E501
        if lane not in allowed_values:
            raise ValueError(
                "Invalid value for `lane` ({0}), must be one of {1}"  # noqa: E501
                .format(lane, allowed_values)
            )

        self._lane = lane

    @property
    def participant_id(self):
        """Gets the participant_id of this MatchV4ParticipantTimelineDto.  # noqa: E501


        :return: The participant_id of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: int
        """
        return self._participant_id

    @participant_id.setter
    def participant_id(self, participant_id):
        """Sets the participant_id of this MatchV4ParticipantTimelineDto.


        :param participant_id: The participant_id of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: int
        """

        self._participant_id = participant_id

    @property
    def cs_diff_per_min_deltas(self):
        """Gets the cs_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Creep score difference versus the calculated lane opponent(s) for a specified period.  # noqa: E501

        :return: The cs_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._cs_diff_per_min_deltas

    @cs_diff_per_min_deltas.setter
    def cs_diff_per_min_deltas(self, cs_diff_per_min_deltas):
        """Sets the cs_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Creep score difference versus the calculated lane opponent(s) for a specified period.  # noqa: E501

        :param cs_diff_per_min_deltas: The cs_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._cs_diff_per_min_deltas = cs_diff_per_min_deltas

    @property
    def gold_per_min_deltas(self):
        """Gets the gold_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Gold for a specified period.  # noqa: E501

        :return: The gold_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._gold_per_min_deltas

    @gold_per_min_deltas.setter
    def gold_per_min_deltas(self, gold_per_min_deltas):
        """Sets the gold_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Gold for a specified period.  # noqa: E501

        :param gold_per_min_deltas: The gold_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._gold_per_min_deltas = gold_per_min_deltas

    @property
    def xp_diff_per_min_deltas(self):
        """Gets the xp_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Experience difference versus the calculated lane opponent(s) for a specified period.  # noqa: E501

        :return: The xp_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._xp_diff_per_min_deltas

    @xp_diff_per_min_deltas.setter
    def xp_diff_per_min_deltas(self, xp_diff_per_min_deltas):
        """Sets the xp_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Experience difference versus the calculated lane opponent(s) for a specified period.  # noqa: E501

        :param xp_diff_per_min_deltas: The xp_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._xp_diff_per_min_deltas = xp_diff_per_min_deltas

    @property
    def creeps_per_min_deltas(self):
        """Gets the creeps_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Creeps for a specified period.  # noqa: E501

        :return: The creeps_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._creeps_per_min_deltas

    @creeps_per_min_deltas.setter
    def creeps_per_min_deltas(self, creeps_per_min_deltas):
        """Sets the creeps_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Creeps for a specified period.  # noqa: E501

        :param creeps_per_min_deltas: The creeps_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._creeps_per_min_deltas = creeps_per_min_deltas

    @property
    def xp_per_min_deltas(self):
        """Gets the xp_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Experience change for a specified period.  # noqa: E501

        :return: The xp_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._xp_per_min_deltas

    @xp_per_min_deltas.setter
    def xp_per_min_deltas(self, xp_per_min_deltas):
        """Sets the xp_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Experience change for a specified period.  # noqa: E501

        :param xp_per_min_deltas: The xp_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._xp_per_min_deltas = xp_per_min_deltas

    @property
    def role(self):
        """Gets the role of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Participant's calculated role.              (Legal values:  DUO,  NONE,  SOLO,  DUO_CARRY,  DUO_SUPPORT)  # noqa: E501

        :return: The role of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this MatchV4ParticipantTimelineDto.

        Participant's calculated role.              (Legal values:  DUO,  NONE,  SOLO,  DUO_CARRY,  DUO_SUPPORT)  # noqa: E501

        :param role: The role of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: str
        """
        allowed_values = ["DUO", "NONE", "SOLO", "DUO_CARRY", "DUO_SUPPORT"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"  # noqa: E501
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def damage_taken_diff_per_min_deltas(self):
        """Gets the damage_taken_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Damage taken difference versus the calculated lane opponent(s) for a specified period.  # noqa: E501

        :return: The damage_taken_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._damage_taken_diff_per_min_deltas

    @damage_taken_diff_per_min_deltas.setter
    def damage_taken_diff_per_min_deltas(self, damage_taken_diff_per_min_deltas):
        """Sets the damage_taken_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Damage taken difference versus the calculated lane opponent(s) for a specified period.  # noqa: E501

        :param damage_taken_diff_per_min_deltas: The damage_taken_diff_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._damage_taken_diff_per_min_deltas = damage_taken_diff_per_min_deltas

    @property
    def damage_taken_per_min_deltas(self):
        """Gets the damage_taken_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501

        Damage taken for a specified period.  # noqa: E501

        :return: The damage_taken_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :rtype: dict(str, float)
        """
        return self._damage_taken_per_min_deltas

    @damage_taken_per_min_deltas.setter
    def damage_taken_per_min_deltas(self, damage_taken_per_min_deltas):
        """Sets the damage_taken_per_min_deltas of this MatchV4ParticipantTimelineDto.

        Damage taken for a specified period.  # noqa: E501

        :param damage_taken_per_min_deltas: The damage_taken_per_min_deltas of this MatchV4ParticipantTimelineDto.  # noqa: E501
        :type: dict(str, float)
        """

        self._damage_taken_per_min_deltas = damage_taken_per_min_deltas

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
        if issubclass(MatchV4ParticipantTimelineDto, dict):
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
        if not isinstance(other, MatchV4ParticipantTimelineDto):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other