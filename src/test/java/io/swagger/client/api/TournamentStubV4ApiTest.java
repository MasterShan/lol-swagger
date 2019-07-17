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
import io.swagger.client.model.TournamentStubV4LobbyEventDTOWrapper;
import io.swagger.client.model.TournamentStubV4ProviderRegistrationParameters;
import io.swagger.client.model.TournamentStubV4TournamentCodeParameters;
import io.swagger.client.model.TournamentStubV4TournamentRegistrationParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TournamentStubV4Api
 */
@Ignore
public class TournamentStubV4ApiTest {

    private final TournamentStubV4Api api = new TournamentStubV4Api();

    
    /**
     * Create a mock tournament code for the given tournament.
     *
     * Create a mock tournament code for the given tournament.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentStubV4CreateTournamentCodeTest() throws ApiException {
        Long tournamentId = null;
        TournamentStubV4TournamentCodeParameters tournamentCodeParameters = null;
        Integer count = null;
        List<String> response = api.tournamentStubV4CreateTournamentCode(tournamentId, tournamentCodeParameters, count);

        // TODO: test validations
    }
    
    /**
     * Gets a mock list of lobby events by tournament code.
     *
     * Gets a mock list of lobby events by tournament code.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentStubV4GetLobbyEventsByCodeTest() throws ApiException {
        String tournamentCode = null;
        TournamentStubV4LobbyEventDTOWrapper response = api.tournamentStubV4GetLobbyEventsByCode(tournamentCode);

        // TODO: test validations
    }
    
    /**
     * Creates a mock tournament provider and returns its ID.
     *
     * Creates a mock tournament provider and returns its ID. ## Implementation Notes Providers will need to call this endpoint first to register their callback URL and their API key with the tournament system before any other tournament provider endpoints will work.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentStubV4RegisterProviderDataTest() throws ApiException {
        TournamentStubV4ProviderRegistrationParameters providerRegistrationParameters = null;
        Integer response = api.tournamentStubV4RegisterProviderData(providerRegistrationParameters);

        // TODO: test validations
    }
    
    /**
     * Creates a mock tournament and returns its ID.
     *
     * Creates a mock tournament and returns its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tournamentStubV4RegisterTournamentTest() throws ApiException {
        TournamentStubV4TournamentRegistrationParameters tournamentRegistrationParameters = null;
        Integer response = api.tournamentStubV4RegisterTournament(tournamentRegistrationParameters);

        // TODO: test validations
    }
    
}
