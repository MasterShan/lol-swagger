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


import com.squareup.moshi.Json
/**
 * 
 * @param spectatorType The spectator type of the game.              (Legal values:  NONE,  LOBBYONLY,  ALL)
 * @param teamSize The team size of the game. Valid values are 1-5.
 * @param pickType The pick type of the game.              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT)
 * @param allowedSummonerIds Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future.
 * @param mapType The map type of the game.              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS)
 * @param metadata Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game.
 */
data class TournamentMinusv4TournamentCodeParameters (
    /* The spectator type of the game.              (Legal values:  NONE,  LOBBYONLY,  ALL) */
    val spectatorType: TournamentMinusv4TournamentCodeParameters.SpectatorType,
    /* The team size of the game. Valid values are 1-5. */
    val teamSize: kotlin.Int,
    /* The pick type of the game.              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT) */
    val pickType: TournamentMinusv4TournamentCodeParameters.PickType,
    /* The map type of the game.              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS) */
    val mapType: TournamentMinusv4TournamentCodeParameters.MapType,
    /* Optional list of encrypted summonerIds in order to validate the players eligible to join the lobby. NOTE: We currently do not enforce participants at the team level, but rather the aggregate of teamOne and teamTwo. We may add the ability to enforce at the team level in the future. */
    val allowedSummonerIds: kotlin.Array<kotlin.String>? = null,
    /* Optional string that may contain any data in any format, if specified at all. Used to denote any custom information about the game. */
    val metadata: kotlin.String? = null
) {

    /**
    * The spectator type of the game.              (Legal values:  NONE,  LOBBYONLY,  ALL)
    * Values: nONE,lOBBYONLY,aLL
    */
    enum class SpectatorType(val value: kotlin.String){
    
        @Json(name = "NONE") nONE("NONE"),
    
        @Json(name = "LOBBYONLY") lOBBYONLY("LOBBYONLY"),
    
        @Json(name = "ALL") aLL("ALL");
    
    }

    /**
    * The pick type of the game.              (Legal values:  BLIND_PICK,  DRAFT_MODE,  ALL_RANDOM,  TOURNAMENT_DRAFT)
    * Values: bLINDPICK,dRAFTMODE,aLLRANDOM,tOURNAMENTDRAFT
    */
    enum class PickType(val value: kotlin.String){
    
        @Json(name = "BLIND_PICK") bLINDPICK("BLIND_PICK"),
    
        @Json(name = "DRAFT_MODE") dRAFTMODE("DRAFT_MODE"),
    
        @Json(name = "ALL_RANDOM") aLLRANDOM("ALL_RANDOM"),
    
        @Json(name = "TOURNAMENT_DRAFT") tOURNAMENTDRAFT("TOURNAMENT_DRAFT");
    
    }

    /**
    * The map type of the game.              (Legal values:  SUMMONERS_RIFT,  TWISTED_TREELINE,  HOWLING_ABYSS)
    * Values: sUMMONERSRIFT,tWISTEDTREELINE,hOWLINGABYSS
    */
    enum class MapType(val value: kotlin.String){
    
        @Json(name = "SUMMONERS_RIFT") sUMMONERSRIFT("SUMMONERS_RIFT"),
    
        @Json(name = "TWISTED_TREELINE") tWISTEDTREELINE("TWISTED_TREELINE"),
    
        @Json(name = "HOWLING_ABYSS") hOWLINGABYSS("HOWLING_ABYSS");
    
    }

}

