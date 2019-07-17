/*
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.LeagueV4LeagueEntryDTO;
import io.swagger.client.model.LeagueV4LeagueListDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeagueV4Api
 */
@Ignore
public class LeagueV4ApiTest {

    private final LeagueV4Api api = new LeagueV4Api();

    
    /**
     * Get the challenger league for given queue.
     *
     * Get the challenger league for given queue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leagueV4GetChallengerLeagueTest() throws ApiException {
        String queue = null;
        LeagueV4LeagueListDTO response = api.leagueV4GetChallengerLeague(queue);

        // TODO: test validations
    }
    
    /**
     * Get the grandmaster league of a specific queue.
     *
     * Get the grandmaster league of a specific queue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leagueV4GetGrandmasterLeagueTest() throws ApiException {
        String queue = null;
        LeagueV4LeagueListDTO response = api.leagueV4GetGrandmasterLeague(queue);

        // TODO: test validations
    }
    
    /**
     * Get league with given ID, including inactive entries.
     *
     * Get league with given ID, including inactive entries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leagueV4GetLeagueByIdTest() throws ApiException {
        String leagueId = null;
        LeagueV4LeagueListDTO response = api.leagueV4GetLeagueById(leagueId);

        // TODO: test validations
    }
    
    /**
     * Get all the league entries.
     *
     * Get all the league entries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leagueV4GetLeagueEntriesTest() throws ApiException {
        String division = null;
        String tier = null;
        String queue = null;
        Integer page = null;
        List<LeagueV4LeagueEntryDTO> response = api.leagueV4GetLeagueEntries(division, tier, queue, page);

        // TODO: test validations
    }
    
    /**
     * Get league entries in all queues for a given summoner ID.
     *
     * Get league entries in all queues for a given summoner ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leagueV4GetLeagueEntriesForSummonerTest() throws ApiException {
        String encryptedSummonerId = null;
        List<LeagueV4LeagueEntryDTO> response = api.leagueV4GetLeagueEntriesForSummoner(encryptedSummonerId);

        // TODO: test validations
    }
    
    /**
     * Get the master league for given queue.
     *
     * Get the master league for given queue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void leagueV4GetMasterLeagueTest() throws ApiException {
        String queue = null;
        LeagueV4LeagueListDTO response = api.leagueV4GetMasterLeague(queue);

        // TODO: test validations
    }
    
}
