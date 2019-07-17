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
 * @param url The provider's callback URL to which tournament game results in this region should be posted. The URL must be well-formed, use the http or https protocol, and use the default port for the protocol (http URLs must use port 80, https URLs must use port 443).
 * @param region The region in which the provider will be running tournaments.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR)
 */
data class TournamentMinusv4ProviderRegistrationParameters (
    /* The provider's callback URL to which tournament game results in this region should be posted. The URL must be well-formed, use the http or https protocol, and use the default port for the protocol (http URLs must use port 80, https URLs must use port 443). */
    val url: kotlin.String,
    /* The region in which the provider will be running tournaments.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR) */
    val region: TournamentMinusv4ProviderRegistrationParameters.Region
) {

    /**
    * The region in which the provider will be running tournaments.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR)
    * Values: bR,eUNE,eUW,jP,lAN,lAS,nA,oCE,pBE,rU,tR
    */
    enum class Region(val value: kotlin.String){
    
        @Json(name = "BR") bR("BR"),
    
        @Json(name = "EUNE") eUNE("EUNE"),
    
        @Json(name = "EUW") eUW("EUW"),
    
        @Json(name = "JP") jP("JP"),
    
        @Json(name = "LAN") lAN("LAN"),
    
        @Json(name = "LAS") lAS("LAS"),
    
        @Json(name = "NA") nA("NA"),
    
        @Json(name = "OCE") oCE("OCE"),
    
        @Json(name = "PBE") pBE("PBE"),
    
        @Json(name = "RU") rU("RU"),
    
        @Json(name = "TR") tR("TR");
    
    }

}

