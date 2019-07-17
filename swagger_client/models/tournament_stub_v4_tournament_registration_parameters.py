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


class TournamentStubV4TournamentRegistrationParameters(object):
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
        'provider_id': 'int',
        'name': 'str'
    }

    attribute_map = {
        'provider_id': 'providerId',
        'name': 'name'
    }

    def __init__(self, provider_id=None, name=None):  # noqa: E501
        """TournamentStubV4TournamentRegistrationParameters - a model defined in Swagger"""  # noqa: E501

        self._provider_id = None
        self._name = None
        self.discriminator = None

        self.provider_id = provider_id
        if name is not None:
            self.name = name

    @property
    def provider_id(self):
        """Gets the provider_id of this TournamentStubV4TournamentRegistrationParameters.  # noqa: E501

        The provider ID to specify the regional registered provider data to associate this tournament.  # noqa: E501

        :return: The provider_id of this TournamentStubV4TournamentRegistrationParameters.  # noqa: E501
        :rtype: int
        """
        return self._provider_id

    @provider_id.setter
    def provider_id(self, provider_id):
        """Sets the provider_id of this TournamentStubV4TournamentRegistrationParameters.

        The provider ID to specify the regional registered provider data to associate this tournament.  # noqa: E501

        :param provider_id: The provider_id of this TournamentStubV4TournamentRegistrationParameters.  # noqa: E501
        :type: int
        """
        if provider_id is None:
            raise ValueError("Invalid value for `provider_id`, must not be `None`")  # noqa: E501

        self._provider_id = provider_id

    @property
    def name(self):
        """Gets the name of this TournamentStubV4TournamentRegistrationParameters.  # noqa: E501

        The optional name of the tournament.  # noqa: E501

        :return: The name of this TournamentStubV4TournamentRegistrationParameters.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TournamentStubV4TournamentRegistrationParameters.

        The optional name of the tournament.  # noqa: E501

        :param name: The name of this TournamentStubV4TournamentRegistrationParameters.  # noqa: E501
        :type: str
        """

        self._name = name

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
        if issubclass(TournamentStubV4TournamentRegistrationParameters, dict):
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
        if not isinstance(other, TournamentStubV4TournamentRegistrationParameters):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other