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
package io.swagger.client.apis

import io.swagger.client.models.LeagueMinusv4LeagueEntryDTO
import io.swagger.client.models.LeagueMinusv4LeagueListDTO

import io.swagger.client.infrastructure.*

class LeagueV4Api(basePath: kotlin.String = "https://na1.api.riotgames.com") : ApiClient(basePath) {

    /**
    * Get the challenger league for given queue.
    * Get the challenger league for given queue.
    * @param queue  
    * @return LeagueMinusv4LeagueListDTO
    */
    @Suppress("UNCHECKED_CAST")
    fun leagueV4.getChallengerLeague(queue: kotlin.String) : LeagueMinusv4LeagueListDTO {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/lol/league/v4/challengerleagues/by-queue/{queue}".replace("{"+"queue"+"}", "$queue"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LeagueMinusv4LeagueListDTO>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LeagueMinusv4LeagueListDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get the grandmaster league of a specific queue.
    * Get the grandmaster league of a specific queue.
    * @param queue  
    * @return LeagueMinusv4LeagueListDTO
    */
    @Suppress("UNCHECKED_CAST")
    fun leagueV4.getGrandmasterLeague(queue: kotlin.String) : LeagueMinusv4LeagueListDTO {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/lol/league/v4/grandmasterleagues/by-queue/{queue}".replace("{"+"queue"+"}", "$queue"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LeagueMinusv4LeagueListDTO>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LeagueMinusv4LeagueListDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get league with given ID, including inactive entries.
    * Get league with given ID, including inactive entries.
    * @param leagueId The UUID of the league. 
    * @return LeagueMinusv4LeagueListDTO
    */
    @Suppress("UNCHECKED_CAST")
    fun leagueV4.getLeagueById(leagueId: kotlin.String) : LeagueMinusv4LeagueListDTO {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/lol/league/v4/leagues/{leagueId}".replace("{"+"leagueId"+"}", "$leagueId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LeagueMinusv4LeagueListDTO>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LeagueMinusv4LeagueListDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get all the league entries.
    * Get all the league entries.
    * @param division  
    * @param tier  
    * @param queue Note that the queue value must be a valid ranked queue. 
    * @param page Starts with page 1. (optional)
    * @return kotlin.Array<LeagueMinusv4LeagueEntryDTO>
    */
    @Suppress("UNCHECKED_CAST")
    fun leagueV4.getLeagueEntries(division: kotlin.String, tier: kotlin.String, queue: kotlin.String, page: kotlin.Int) : kotlin.Array<LeagueMinusv4LeagueEntryDTO> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("page" to listOf("$page"))
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/lol/league/v4/entries/{queue}/{tier}/{division}".replace("{"+"division"+"}", "$division").replace("{"+"tier"+"}", "$tier").replace("{"+"queue"+"}", "$queue"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<LeagueMinusv4LeagueEntryDTO>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<LeagueMinusv4LeagueEntryDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get league entries in all queues for a given summoner ID.
    * Get league entries in all queues for a given summoner ID.
    * @param encryptedSummonerId  
    * @return kotlin.Array<LeagueMinusv4LeagueEntryDTO>
    */
    @Suppress("UNCHECKED_CAST")
    fun leagueV4.getLeagueEntriesForSummoner(encryptedSummonerId: kotlin.String) : kotlin.Array<LeagueMinusv4LeagueEntryDTO> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/lol/league/v4/entries/by-summoner/{encryptedSummonerId}".replace("{"+"encryptedSummonerId"+"}", "$encryptedSummonerId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<LeagueMinusv4LeagueEntryDTO>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<LeagueMinusv4LeagueEntryDTO>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get the master league for given queue.
    * Get the master league for given queue.
    * @param queue  
    * @return LeagueMinusv4LeagueListDTO
    */
    @Suppress("UNCHECKED_CAST")
    fun leagueV4.getMasterLeague(queue: kotlin.String) : LeagueMinusv4LeagueListDTO {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        
        val contentHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val acceptsHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Accept" to "application/json")
        val localVariableHeaders: kotlin.collections.MutableMap<kotlin.String,kotlin.String> = mutableMapOf()
        localVariableHeaders.putAll(contentHeaders)
        localVariableHeaders.putAll(acceptsHeaders)
        
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/lol/league/v4/masterleagues/by-queue/{queue}".replace("{"+"queue"+"}", "$queue"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<LeagueMinusv4LeagueListDTO>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as LeagueMinusv4LeagueListDTO
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}