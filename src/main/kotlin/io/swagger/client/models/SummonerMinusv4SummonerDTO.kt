/**
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
package io.swagger.client.models


/**
 * represents a summoner
 * @param profileIconId ID of the summoner icon associated with the summoner.
 * @param name Summoner name.
 * @param puuid Encrypted PUUID. Exact length of 78 characters.
 * @param summonerLevel Summoner level associated with the summoner.
 * @param revisionDate Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
 * @param id Encrypted summoner ID. Max length 63 characters.
 * @param accountId Encrypted account ID. Max length 56 characters.
 */
data class SummonerMinusv4SummonerDTO (
    /* ID of the summoner icon associated with the summoner. */
    val profileIconId: kotlin.Int? = null,
    /* Summoner name. */
    val name: kotlin.String? = null,
    /* Encrypted PUUID. Exact length of 78 characters. */
    val puuid: kotlin.String? = null,
    /* Summoner level associated with the summoner. */
    val summonerLevel: kotlin.Long? = null,
    /* Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change */
    val revisionDate: kotlin.Long? = null,
    /* Encrypted summoner ID. Max length 63 characters. */
    val id: kotlin.String? = null,
    /* Encrypted account ID. Max length 56 characters. */
    val accountId: kotlin.String? = null
) {

}
