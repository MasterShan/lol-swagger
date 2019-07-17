# coding: utf-8

"""
    Riot API

     OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. ***   # noqa: E501

    OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.league_v4_api import LeagueV4Api  # noqa: E501
from swagger_client.rest import ApiException


class TestLeagueV4Api(unittest.TestCase):
    """LeagueV4Api unit test stubs"""

    def setUp(self):
        self.api = swagger_client.api.league_v4_api.LeagueV4Api()  # noqa: E501

    def tearDown(self):
        pass

    def test_league_v4_get_challenger_league(self):
        """Test case for league_v4_get_challenger_league

        Get the challenger league for given queue.  # noqa: E501
        """
        pass

    def test_league_v4_get_grandmaster_league(self):
        """Test case for league_v4_get_grandmaster_league

        Get the grandmaster league of a specific queue.  # noqa: E501
        """
        pass

    def test_league_v4_get_league_by_id(self):
        """Test case for league_v4_get_league_by_id

        Get league with given ID, including inactive entries.  # noqa: E501
        """
        pass

    def test_league_v4_get_league_entries(self):
        """Test case for league_v4_get_league_entries

        Get all the league entries.  # noqa: E501
        """
        pass

    def test_league_v4_get_league_entries_for_summoner(self):
        """Test case for league_v4_get_league_entries_for_summoner

        Get league entries in all queues for a given summoner ID.  # noqa: E501
        """
        pass

    def test_league_v4_get_master_league(self):
        """Test case for league_v4_get_master_league

        Get the master league for given queue.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()