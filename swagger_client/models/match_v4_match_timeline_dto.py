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

from swagger_client.models.match_v4_match_frame_dto import MatchV4MatchFrameDto  # noqa: F401,E501


class MatchV4MatchTimelineDto(object):
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
        'frames': 'list[MatchV4MatchFrameDto]',
        'frame_interval': 'int'
    }

    attribute_map = {
        'frames': 'frames',
        'frame_interval': 'frameInterval'
    }

    def __init__(self, frames=None, frame_interval=None):  # noqa: E501
        """MatchV4MatchTimelineDto - a model defined in Swagger"""  # noqa: E501

        self._frames = None
        self._frame_interval = None
        self.discriminator = None

        if frames is not None:
            self.frames = frames
        if frame_interval is not None:
            self.frame_interval = frame_interval

    @property
    def frames(self):
        """Gets the frames of this MatchV4MatchTimelineDto.  # noqa: E501


        :return: The frames of this MatchV4MatchTimelineDto.  # noqa: E501
        :rtype: list[MatchV4MatchFrameDto]
        """
        return self._frames

    @frames.setter
    def frames(self, frames):
        """Sets the frames of this MatchV4MatchTimelineDto.


        :param frames: The frames of this MatchV4MatchTimelineDto.  # noqa: E501
        :type: list[MatchV4MatchFrameDto]
        """

        self._frames = frames

    @property
    def frame_interval(self):
        """Gets the frame_interval of this MatchV4MatchTimelineDto.  # noqa: E501


        :return: The frame_interval of this MatchV4MatchTimelineDto.  # noqa: E501
        :rtype: int
        """
        return self._frame_interval

    @frame_interval.setter
    def frame_interval(self, frame_interval):
        """Sets the frame_interval of this MatchV4MatchTimelineDto.


        :param frame_interval: The frame_interval of this MatchV4MatchTimelineDto.  # noqa: E501
        :type: int
        """

        self._frame_interval = frame_interval

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
        if issubclass(MatchV4MatchTimelineDto, dict):
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
        if not isinstance(other, MatchV4MatchTimelineDto):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
