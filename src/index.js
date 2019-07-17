/**
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.7
 *
 * Do not edit the class manually.
 *
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/ChampionMasteryV4ChampionMasteryDTO', 'model/ChampionV3ChampionInfo', 'model/Error', 'model/ErrorStatus', 'model/LeagueV4LeagueEntryDTO', 'model/LeagueV4LeagueItemDTO', 'model/LeagueV4LeagueListDTO', 'model/LeagueV4MiniSeriesDTO', 'model/LolStatusV3Incident', 'model/LolStatusV3Message', 'model/LolStatusV3Service', 'model/LolStatusV3ShardStatus', 'model/LolStatusV3Translation', 'model/MatchV4MasteryDto', 'model/MatchV4MatchDto', 'model/MatchV4MatchEventDto', 'model/MatchV4MatchFrameDto', 'model/MatchV4MatchParticipantFrameDto', 'model/MatchV4MatchPositionDto', 'model/MatchV4MatchReferenceDto', 'model/MatchV4MatchTimelineDto', 'model/MatchV4MatchlistDto', 'model/MatchV4ParticipantDto', 'model/MatchV4ParticipantIdentityDto', 'model/MatchV4ParticipantStatsDto', 'model/MatchV4ParticipantTimelineDto', 'model/MatchV4PlayerDto', 'model/MatchV4RuneDto', 'model/MatchV4TeamBansDto', 'model/MatchV4TeamStatsDto', 'model/SpectatorV4BannedChampion', 'model/SpectatorV4CurrentGameInfo', 'model/SpectatorV4CurrentGameParticipant', 'model/SpectatorV4FeaturedGameInfo', 'model/SpectatorV4FeaturedGames', 'model/SpectatorV4GameCustomizationObject', 'model/SpectatorV4Observer', 'model/SpectatorV4Participant', 'model/SpectatorV4Perks', 'model/SummonerV4SummonerDTO', 'model/TournamentStubV4LobbyEventDTO', 'model/TournamentStubV4LobbyEventDTOWrapper', 'model/TournamentStubV4ProviderRegistrationParameters', 'model/TournamentStubV4TournamentCodeParameters', 'model/TournamentStubV4TournamentRegistrationParameters', 'model/TournamentV4LobbyEventDTO', 'model/TournamentV4LobbyEventDTOWrapper', 'model/TournamentV4ProviderRegistrationParameters', 'model/TournamentV4TournamentCodeDTO', 'model/TournamentV4TournamentCodeParameters', 'model/TournamentV4TournamentCodeUpdateParameters', 'model/TournamentV4TournamentRegistrationParameters', 'api/ChampionMasteryV4Api', 'api/ChampionV3Api', 'api/LeagueV4Api', 'api/LolStatusV3Api', 'api/MatchV4Api', 'api/SpectatorV4Api', 'api/SummonerV4Api', 'api/ThirdPartyCodeV4Api', 'api/TournamentStubV4Api', 'api/TournamentV4Api'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/ChampionMasteryV4ChampionMasteryDTO'), require('./model/ChampionV3ChampionInfo'), require('./model/Error'), require('./model/ErrorStatus'), require('./model/LeagueV4LeagueEntryDTO'), require('./model/LeagueV4LeagueItemDTO'), require('./model/LeagueV4LeagueListDTO'), require('./model/LeagueV4MiniSeriesDTO'), require('./model/LolStatusV3Incident'), require('./model/LolStatusV3Message'), require('./model/LolStatusV3Service'), require('./model/LolStatusV3ShardStatus'), require('./model/LolStatusV3Translation'), require('./model/MatchV4MasteryDto'), require('./model/MatchV4MatchDto'), require('./model/MatchV4MatchEventDto'), require('./model/MatchV4MatchFrameDto'), require('./model/MatchV4MatchParticipantFrameDto'), require('./model/MatchV4MatchPositionDto'), require('./model/MatchV4MatchReferenceDto'), require('./model/MatchV4MatchTimelineDto'), require('./model/MatchV4MatchlistDto'), require('./model/MatchV4ParticipantDto'), require('./model/MatchV4ParticipantIdentityDto'), require('./model/MatchV4ParticipantStatsDto'), require('./model/MatchV4ParticipantTimelineDto'), require('./model/MatchV4PlayerDto'), require('./model/MatchV4RuneDto'), require('./model/MatchV4TeamBansDto'), require('./model/MatchV4TeamStatsDto'), require('./model/SpectatorV4BannedChampion'), require('./model/SpectatorV4CurrentGameInfo'), require('./model/SpectatorV4CurrentGameParticipant'), require('./model/SpectatorV4FeaturedGameInfo'), require('./model/SpectatorV4FeaturedGames'), require('./model/SpectatorV4GameCustomizationObject'), require('./model/SpectatorV4Observer'), require('./model/SpectatorV4Participant'), require('./model/SpectatorV4Perks'), require('./model/SummonerV4SummonerDTO'), require('./model/TournamentStubV4LobbyEventDTO'), require('./model/TournamentStubV4LobbyEventDTOWrapper'), require('./model/TournamentStubV4ProviderRegistrationParameters'), require('./model/TournamentStubV4TournamentCodeParameters'), require('./model/TournamentStubV4TournamentRegistrationParameters'), require('./model/TournamentV4LobbyEventDTO'), require('./model/TournamentV4LobbyEventDTOWrapper'), require('./model/TournamentV4ProviderRegistrationParameters'), require('./model/TournamentV4TournamentCodeDTO'), require('./model/TournamentV4TournamentCodeParameters'), require('./model/TournamentV4TournamentCodeUpdateParameters'), require('./model/TournamentV4TournamentRegistrationParameters'), require('./api/ChampionMasteryV4Api'), require('./api/ChampionV3Api'), require('./api/LeagueV4Api'), require('./api/LolStatusV3Api'), require('./api/MatchV4Api'), require('./api/SpectatorV4Api'), require('./api/SummonerV4Api'), require('./api/ThirdPartyCodeV4Api'), require('./api/TournamentStubV4Api'), require('./api/TournamentV4Api'));
  }
}(function(ApiClient, ChampionMasteryV4ChampionMasteryDTO, ChampionV3ChampionInfo, Error, ErrorStatus, LeagueV4LeagueEntryDTO, LeagueV4LeagueItemDTO, LeagueV4LeagueListDTO, LeagueV4MiniSeriesDTO, LolStatusV3Incident, LolStatusV3Message, LolStatusV3Service, LolStatusV3ShardStatus, LolStatusV3Translation, MatchV4MasteryDto, MatchV4MatchDto, MatchV4MatchEventDto, MatchV4MatchFrameDto, MatchV4MatchParticipantFrameDto, MatchV4MatchPositionDto, MatchV4MatchReferenceDto, MatchV4MatchTimelineDto, MatchV4MatchlistDto, MatchV4ParticipantDto, MatchV4ParticipantIdentityDto, MatchV4ParticipantStatsDto, MatchV4ParticipantTimelineDto, MatchV4PlayerDto, MatchV4RuneDto, MatchV4TeamBansDto, MatchV4TeamStatsDto, SpectatorV4BannedChampion, SpectatorV4CurrentGameInfo, SpectatorV4CurrentGameParticipant, SpectatorV4FeaturedGameInfo, SpectatorV4FeaturedGames, SpectatorV4GameCustomizationObject, SpectatorV4Observer, SpectatorV4Participant, SpectatorV4Perks, SummonerV4SummonerDTO, TournamentStubV4LobbyEventDTO, TournamentStubV4LobbyEventDTOWrapper, TournamentStubV4ProviderRegistrationParameters, TournamentStubV4TournamentCodeParameters, TournamentStubV4TournamentRegistrationParameters, TournamentV4LobbyEventDTO, TournamentV4LobbyEventDTOWrapper, TournamentV4ProviderRegistrationParameters, TournamentV4TournamentCodeDTO, TournamentV4TournamentCodeParameters, TournamentV4TournamentCodeUpdateParameters, TournamentV4TournamentRegistrationParameters, ChampionMasteryV4Api, ChampionV3Api, LeagueV4Api, LolStatusV3Api, MatchV4Api, SpectatorV4Api, SummonerV4Api, ThirdPartyCodeV4Api, TournamentStubV4Api, TournamentV4Api) {
  'use strict';

  /**
   * OpenAPISwagger_version_of_the__Riot_API_httpsdeveloper_riotgames_com__Automatically_generated_daily__Download_OpenAPI_Spec_FileThe_following_versions_of_the_Riot_API_spec_file_are_available__openapi_3_0_0_json___download_file___openapi_3_0_0_json__view_ui_openapi_3_0_0_json__openapi_3_0_0_min_json___download_file___openapi_3_0_0_min_json__view_ui_openapi_3_0_0_min_json__openapi_3_0_0_yml___download_file___openapi_3_0_0_yml__view_ui_openapi_3_0_0_yml__openapi_3_0_0_min_yml___download_file___openapi_3_0_0_min_yml__view_ui_openapi_3_0_0_min_yml__swaggerspec_2_0_json___download_file___swaggerspec_2_0_json__view_ui_swaggerspec_2_0_json__swaggerspec_2_0_min_json___download_file___swaggerspec_2_0_min_json__view_ui_swaggerspec_2_0_min_json__swaggerspec_2_0_yml___download_file___swaggerspec_2_0_yml__view_ui_swaggerspec_2_0_yml__swaggerspec_2_0_min_yml___download_file___swaggerspec_2_0_min_yml__view_ui_swaggerspec_2_0_min_yml_Source_CodeSource_code_on__GitHub_httpsgithub_comMingweiSamuelriotapi_schema__Pull_requests_welcome_Automatically_GeneratedRebuilt_on__Travis_CI_httpstravis_ci_orgMingweiSamuelriotapi_schemabuilds_daily_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var RiotApi = require('index'); // See note below*.
   * var xxxSvc = new RiotApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new RiotApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new RiotApi.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new RiotApi.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The ChampionMasteryV4ChampionMasteryDTO model constructor.
     * @property {module:model/ChampionMasteryV4ChampionMasteryDTO}
     */
    ChampionMasteryV4ChampionMasteryDTO: ChampionMasteryV4ChampionMasteryDTO,
    /**
     * The ChampionV3ChampionInfo model constructor.
     * @property {module:model/ChampionV3ChampionInfo}
     */
    ChampionV3ChampionInfo: ChampionV3ChampionInfo,
    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error: Error,
    /**
     * The ErrorStatus model constructor.
     * @property {module:model/ErrorStatus}
     */
    ErrorStatus: ErrorStatus,
    /**
     * The LeagueV4LeagueEntryDTO model constructor.
     * @property {module:model/LeagueV4LeagueEntryDTO}
     */
    LeagueV4LeagueEntryDTO: LeagueV4LeagueEntryDTO,
    /**
     * The LeagueV4LeagueItemDTO model constructor.
     * @property {module:model/LeagueV4LeagueItemDTO}
     */
    LeagueV4LeagueItemDTO: LeagueV4LeagueItemDTO,
    /**
     * The LeagueV4LeagueListDTO model constructor.
     * @property {module:model/LeagueV4LeagueListDTO}
     */
    LeagueV4LeagueListDTO: LeagueV4LeagueListDTO,
    /**
     * The LeagueV4MiniSeriesDTO model constructor.
     * @property {module:model/LeagueV4MiniSeriesDTO}
     */
    LeagueV4MiniSeriesDTO: LeagueV4MiniSeriesDTO,
    /**
     * The LolStatusV3Incident model constructor.
     * @property {module:model/LolStatusV3Incident}
     */
    LolStatusV3Incident: LolStatusV3Incident,
    /**
     * The LolStatusV3Message model constructor.
     * @property {module:model/LolStatusV3Message}
     */
    LolStatusV3Message: LolStatusV3Message,
    /**
     * The LolStatusV3Service model constructor.
     * @property {module:model/LolStatusV3Service}
     */
    LolStatusV3Service: LolStatusV3Service,
    /**
     * The LolStatusV3ShardStatus model constructor.
     * @property {module:model/LolStatusV3ShardStatus}
     */
    LolStatusV3ShardStatus: LolStatusV3ShardStatus,
    /**
     * The LolStatusV3Translation model constructor.
     * @property {module:model/LolStatusV3Translation}
     */
    LolStatusV3Translation: LolStatusV3Translation,
    /**
     * The MatchV4MasteryDto model constructor.
     * @property {module:model/MatchV4MasteryDto}
     */
    MatchV4MasteryDto: MatchV4MasteryDto,
    /**
     * The MatchV4MatchDto model constructor.
     * @property {module:model/MatchV4MatchDto}
     */
    MatchV4MatchDto: MatchV4MatchDto,
    /**
     * The MatchV4MatchEventDto model constructor.
     * @property {module:model/MatchV4MatchEventDto}
     */
    MatchV4MatchEventDto: MatchV4MatchEventDto,
    /**
     * The MatchV4MatchFrameDto model constructor.
     * @property {module:model/MatchV4MatchFrameDto}
     */
    MatchV4MatchFrameDto: MatchV4MatchFrameDto,
    /**
     * The MatchV4MatchParticipantFrameDto model constructor.
     * @property {module:model/MatchV4MatchParticipantFrameDto}
     */
    MatchV4MatchParticipantFrameDto: MatchV4MatchParticipantFrameDto,
    /**
     * The MatchV4MatchPositionDto model constructor.
     * @property {module:model/MatchV4MatchPositionDto}
     */
    MatchV4MatchPositionDto: MatchV4MatchPositionDto,
    /**
     * The MatchV4MatchReferenceDto model constructor.
     * @property {module:model/MatchV4MatchReferenceDto}
     */
    MatchV4MatchReferenceDto: MatchV4MatchReferenceDto,
    /**
     * The MatchV4MatchTimelineDto model constructor.
     * @property {module:model/MatchV4MatchTimelineDto}
     */
    MatchV4MatchTimelineDto: MatchV4MatchTimelineDto,
    /**
     * The MatchV4MatchlistDto model constructor.
     * @property {module:model/MatchV4MatchlistDto}
     */
    MatchV4MatchlistDto: MatchV4MatchlistDto,
    /**
     * The MatchV4ParticipantDto model constructor.
     * @property {module:model/MatchV4ParticipantDto}
     */
    MatchV4ParticipantDto: MatchV4ParticipantDto,
    /**
     * The MatchV4ParticipantIdentityDto model constructor.
     * @property {module:model/MatchV4ParticipantIdentityDto}
     */
    MatchV4ParticipantIdentityDto: MatchV4ParticipantIdentityDto,
    /**
     * The MatchV4ParticipantStatsDto model constructor.
     * @property {module:model/MatchV4ParticipantStatsDto}
     */
    MatchV4ParticipantStatsDto: MatchV4ParticipantStatsDto,
    /**
     * The MatchV4ParticipantTimelineDto model constructor.
     * @property {module:model/MatchV4ParticipantTimelineDto}
     */
    MatchV4ParticipantTimelineDto: MatchV4ParticipantTimelineDto,
    /**
     * The MatchV4PlayerDto model constructor.
     * @property {module:model/MatchV4PlayerDto}
     */
    MatchV4PlayerDto: MatchV4PlayerDto,
    /**
     * The MatchV4RuneDto model constructor.
     * @property {module:model/MatchV4RuneDto}
     */
    MatchV4RuneDto: MatchV4RuneDto,
    /**
     * The MatchV4TeamBansDto model constructor.
     * @property {module:model/MatchV4TeamBansDto}
     */
    MatchV4TeamBansDto: MatchV4TeamBansDto,
    /**
     * The MatchV4TeamStatsDto model constructor.
     * @property {module:model/MatchV4TeamStatsDto}
     */
    MatchV4TeamStatsDto: MatchV4TeamStatsDto,
    /**
     * The SpectatorV4BannedChampion model constructor.
     * @property {module:model/SpectatorV4BannedChampion}
     */
    SpectatorV4BannedChampion: SpectatorV4BannedChampion,
    /**
     * The SpectatorV4CurrentGameInfo model constructor.
     * @property {module:model/SpectatorV4CurrentGameInfo}
     */
    SpectatorV4CurrentGameInfo: SpectatorV4CurrentGameInfo,
    /**
     * The SpectatorV4CurrentGameParticipant model constructor.
     * @property {module:model/SpectatorV4CurrentGameParticipant}
     */
    SpectatorV4CurrentGameParticipant: SpectatorV4CurrentGameParticipant,
    /**
     * The SpectatorV4FeaturedGameInfo model constructor.
     * @property {module:model/SpectatorV4FeaturedGameInfo}
     */
    SpectatorV4FeaturedGameInfo: SpectatorV4FeaturedGameInfo,
    /**
     * The SpectatorV4FeaturedGames model constructor.
     * @property {module:model/SpectatorV4FeaturedGames}
     */
    SpectatorV4FeaturedGames: SpectatorV4FeaturedGames,
    /**
     * The SpectatorV4GameCustomizationObject model constructor.
     * @property {module:model/SpectatorV4GameCustomizationObject}
     */
    SpectatorV4GameCustomizationObject: SpectatorV4GameCustomizationObject,
    /**
     * The SpectatorV4Observer model constructor.
     * @property {module:model/SpectatorV4Observer}
     */
    SpectatorV4Observer: SpectatorV4Observer,
    /**
     * The SpectatorV4Participant model constructor.
     * @property {module:model/SpectatorV4Participant}
     */
    SpectatorV4Participant: SpectatorV4Participant,
    /**
     * The SpectatorV4Perks model constructor.
     * @property {module:model/SpectatorV4Perks}
     */
    SpectatorV4Perks: SpectatorV4Perks,
    /**
     * The SummonerV4SummonerDTO model constructor.
     * @property {module:model/SummonerV4SummonerDTO}
     */
    SummonerV4SummonerDTO: SummonerV4SummonerDTO,
    /**
     * The TournamentStubV4LobbyEventDTO model constructor.
     * @property {module:model/TournamentStubV4LobbyEventDTO}
     */
    TournamentStubV4LobbyEventDTO: TournamentStubV4LobbyEventDTO,
    /**
     * The TournamentStubV4LobbyEventDTOWrapper model constructor.
     * @property {module:model/TournamentStubV4LobbyEventDTOWrapper}
     */
    TournamentStubV4LobbyEventDTOWrapper: TournamentStubV4LobbyEventDTOWrapper,
    /**
     * The TournamentStubV4ProviderRegistrationParameters model constructor.
     * @property {module:model/TournamentStubV4ProviderRegistrationParameters}
     */
    TournamentStubV4ProviderRegistrationParameters: TournamentStubV4ProviderRegistrationParameters,
    /**
     * The TournamentStubV4TournamentCodeParameters model constructor.
     * @property {module:model/TournamentStubV4TournamentCodeParameters}
     */
    TournamentStubV4TournamentCodeParameters: TournamentStubV4TournamentCodeParameters,
    /**
     * The TournamentStubV4TournamentRegistrationParameters model constructor.
     * @property {module:model/TournamentStubV4TournamentRegistrationParameters}
     */
    TournamentStubV4TournamentRegistrationParameters: TournamentStubV4TournamentRegistrationParameters,
    /**
     * The TournamentV4LobbyEventDTO model constructor.
     * @property {module:model/TournamentV4LobbyEventDTO}
     */
    TournamentV4LobbyEventDTO: TournamentV4LobbyEventDTO,
    /**
     * The TournamentV4LobbyEventDTOWrapper model constructor.
     * @property {module:model/TournamentV4LobbyEventDTOWrapper}
     */
    TournamentV4LobbyEventDTOWrapper: TournamentV4LobbyEventDTOWrapper,
    /**
     * The TournamentV4ProviderRegistrationParameters model constructor.
     * @property {module:model/TournamentV4ProviderRegistrationParameters}
     */
    TournamentV4ProviderRegistrationParameters: TournamentV4ProviderRegistrationParameters,
    /**
     * The TournamentV4TournamentCodeDTO model constructor.
     * @property {module:model/TournamentV4TournamentCodeDTO}
     */
    TournamentV4TournamentCodeDTO: TournamentV4TournamentCodeDTO,
    /**
     * The TournamentV4TournamentCodeParameters model constructor.
     * @property {module:model/TournamentV4TournamentCodeParameters}
     */
    TournamentV4TournamentCodeParameters: TournamentV4TournamentCodeParameters,
    /**
     * The TournamentV4TournamentCodeUpdateParameters model constructor.
     * @property {module:model/TournamentV4TournamentCodeUpdateParameters}
     */
    TournamentV4TournamentCodeUpdateParameters: TournamentV4TournamentCodeUpdateParameters,
    /**
     * The TournamentV4TournamentRegistrationParameters model constructor.
     * @property {module:model/TournamentV4TournamentRegistrationParameters}
     */
    TournamentV4TournamentRegistrationParameters: TournamentV4TournamentRegistrationParameters,
    /**
     * The ChampionMasteryV4Api service constructor.
     * @property {module:api/ChampionMasteryV4Api}
     */
    ChampionMasteryV4Api: ChampionMasteryV4Api,
    /**
     * The ChampionV3Api service constructor.
     * @property {module:api/ChampionV3Api}
     */
    ChampionV3Api: ChampionV3Api,
    /**
     * The LeagueV4Api service constructor.
     * @property {module:api/LeagueV4Api}
     */
    LeagueV4Api: LeagueV4Api,
    /**
     * The LolStatusV3Api service constructor.
     * @property {module:api/LolStatusV3Api}
     */
    LolStatusV3Api: LolStatusV3Api,
    /**
     * The MatchV4Api service constructor.
     * @property {module:api/MatchV4Api}
     */
    MatchV4Api: MatchV4Api,
    /**
     * The SpectatorV4Api service constructor.
     * @property {module:api/SpectatorV4Api}
     */
    SpectatorV4Api: SpectatorV4Api,
    /**
     * The SummonerV4Api service constructor.
     * @property {module:api/SummonerV4Api}
     */
    SummonerV4Api: SummonerV4Api,
    /**
     * The ThirdPartyCodeV4Api service constructor.
     * @property {module:api/ThirdPartyCodeV4Api}
     */
    ThirdPartyCodeV4Api: ThirdPartyCodeV4Api,
    /**
     * The TournamentStubV4Api service constructor.
     * @property {module:api/TournamentStubV4Api}
     */
    TournamentStubV4Api: TournamentStubV4Api,
    /**
     * The TournamentV4Api service constructor.
     * @property {module:api/TournamentV4Api}
     */
    TournamentV4Api: TournamentV4Api
  };

  return exports;
}));