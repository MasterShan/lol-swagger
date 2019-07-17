# io.swagger.client - Kotlin client library for Riot API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://na1.api.riotgames.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChampionMasteryV4Api* | [**championMasteryV4.getAllChampionMasteries**](docs/ChampionMasteryV4Api.md#championmasteryv4.getallchampionmasteries) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId} | Get all champion mastery entries sorted by number of champion points descending,
*ChampionMasteryV4Api* | [**championMasteryV4.getChampionMastery**](docs/ChampionMasteryV4Api.md#championmasteryv4.getchampionmastery) | **GET** /lol/champion-mastery/v4/champion-masteries/by-summoner/{encryptedSummonerId}/by-champion/{championId} | Get a champion mastery by player ID and champion ID.
*ChampionMasteryV4Api* | [**championMasteryV4.getChampionMasteryScore**](docs/ChampionMasteryV4Api.md#championmasteryv4.getchampionmasteryscore) | **GET** /lol/champion-mastery/v4/scores/by-summoner/{encryptedSummonerId} | Get a player's total champion mastery score, which is the sum of individual champion mastery levels.
*ChampionV3Api* | [**championV3.getChampionInfo**](docs/ChampionV3Api.md#championv3.getchampioninfo) | **GET** /lol/platform/v3/champion-rotations | Returns champion rotations, including free-to-play and low-level free-to-play rotations (REST)
*LeagueV4Api* | [**leagueV4.getChallengerLeague**](docs/LeagueV4Api.md#leaguev4.getchallengerleague) | **GET** /lol/league/v4/challengerleagues/by-queue/{queue} | Get the challenger league for given queue.
*LeagueV4Api* | [**leagueV4.getGrandmasterLeague**](docs/LeagueV4Api.md#leaguev4.getgrandmasterleague) | **GET** /lol/league/v4/grandmasterleagues/by-queue/{queue} | Get the grandmaster league of a specific queue.
*LeagueV4Api* | [**leagueV4.getLeagueById**](docs/LeagueV4Api.md#leaguev4.getleaguebyid) | **GET** /lol/league/v4/leagues/{leagueId} | Get league with given ID, including inactive entries.
*LeagueV4Api* | [**leagueV4.getLeagueEntries**](docs/LeagueV4Api.md#leaguev4.getleagueentries) | **GET** /lol/league/v4/entries/{queue}/{tier}/{division} | Get all the league entries.
*LeagueV4Api* | [**leagueV4.getLeagueEntriesForSummoner**](docs/LeagueV4Api.md#leaguev4.getleagueentriesforsummoner) | **GET** /lol/league/v4/entries/by-summoner/{encryptedSummonerId} | Get league entries in all queues for a given summoner ID.
*LeagueV4Api* | [**leagueV4.getMasterLeague**](docs/LeagueV4Api.md#leaguev4.getmasterleague) | **GET** /lol/league/v4/masterleagues/by-queue/{queue} | Get the master league for given queue.
*LolStatusV3Api* | [**lolStatusV3.getShardData**](docs/LolStatusV3Api.md#lolstatusv3.getsharddata) | **GET** /lol/status/v3/shard-data | Get League of Legends status for the given shard.
*MatchV4Api* | [**matchV4.getMatch**](docs/MatchV4Api.md#matchv4.getmatch) | **GET** /lol/match/v4/matches/{matchId} | Get match by match ID.
*MatchV4Api* | [**matchV4.getMatchByTournamentCode**](docs/MatchV4Api.md#matchv4.getmatchbytournamentcode) | **GET** /lol/match/v4/matches/{matchId}/by-tournament-code/{tournamentCode} | Get match by match ID and tournament code.
*MatchV4Api* | [**matchV4.getMatchIdsByTournamentCode**](docs/MatchV4Api.md#matchv4.getmatchidsbytournamentcode) | **GET** /lol/match/v4/matches/by-tournament-code/{tournamentCode}/ids | Get match IDs by tournament code.
*MatchV4Api* | [**matchV4.getMatchTimeline**](docs/MatchV4Api.md#matchv4.getmatchtimeline) | **GET** /lol/match/v4/timelines/by-match/{matchId} | Get match timeline by match ID.
*MatchV4Api* | [**matchV4.getMatchlist**](docs/MatchV4Api.md#matchv4.getmatchlist) | **GET** /lol/match/v4/matchlists/by-account/{encryptedAccountId} | Get matchlist for games played on given account ID and platform ID and filtered using given filter parameters, if any.
*SpectatorV4Api* | [**spectatorV4.getCurrentGameInfoBySummoner**](docs/SpectatorV4Api.md#spectatorv4.getcurrentgameinfobysummoner) | **GET** /lol/spectator/v4/active-games/by-summoner/{encryptedSummonerId} | Get current game information for the given summoner ID.
*SpectatorV4Api* | [**spectatorV4.getFeaturedGames**](docs/SpectatorV4Api.md#spectatorv4.getfeaturedgames) | **GET** /lol/spectator/v4/featured-games | Get list of featured games.
*SummonerV4Api* | [**summonerV4.getByAccountId**](docs/SummonerV4Api.md#summonerv4.getbyaccountid) | **GET** /lol/summoner/v4/summoners/by-account/{encryptedAccountId} | Get a summoner by account ID.
*SummonerV4Api* | [**summonerV4.getByPUUID**](docs/SummonerV4Api.md#summonerv4.getbypuuid) | **GET** /lol/summoner/v4/summoners/by-puuid/{encryptedPUUID} | Get a summoner by PUUID.
*SummonerV4Api* | [**summonerV4.getBySummonerId**](docs/SummonerV4Api.md#summonerv4.getbysummonerid) | **GET** /lol/summoner/v4/summoners/{encryptedSummonerId} | Get a summoner by summoner ID.
*SummonerV4Api* | [**summonerV4.getBySummonerName**](docs/SummonerV4Api.md#summonerv4.getbysummonername) | **GET** /lol/summoner/v4/summoners/by-name/{summonerName} | Get a summoner by summoner name.
*ThirdPartyCodeV4Api* | [**thirdPartyCodeV4.getThirdPartyCodeBySummonerId**](docs/ThirdPartyCodeV4Api.md#thirdpartycodev4.getthirdpartycodebysummonerid) | **GET** /lol/platform/v4/third-party-code/by-summoner/{encryptedSummonerId} | Get third party code for a given summoner ID.
*TournamentStubV4Api* | [**tournamentStubV4.createTournamentCode**](docs/TournamentStubV4Api.md#tournamentstubv4.createtournamentcode) | **POST** /lol/tournament-stub/v4/codes | Create a mock tournament code for the given tournament.
*TournamentStubV4Api* | [**tournamentStubV4.getLobbyEventsByCode**](docs/TournamentStubV4Api.md#tournamentstubv4.getlobbyeventsbycode) | **GET** /lol/tournament-stub/v4/lobby-events/by-code/{tournamentCode} | Gets a mock list of lobby events by tournament code.
*TournamentStubV4Api* | [**tournamentStubV4.registerProviderData**](docs/TournamentStubV4Api.md#tournamentstubv4.registerproviderdata) | **POST** /lol/tournament-stub/v4/providers | Creates a mock tournament provider and returns its ID.
*TournamentStubV4Api* | [**tournamentStubV4.registerTournament**](docs/TournamentStubV4Api.md#tournamentstubv4.registertournament) | **POST** /lol/tournament-stub/v4/tournaments | Creates a mock tournament and returns its ID.
*TournamentV4Api* | [**tournamentV4.createTournamentCode**](docs/TournamentV4Api.md#tournamentv4.createtournamentcode) | **POST** /lol/tournament/v4/codes | Create a tournament code for the given tournament.
*TournamentV4Api* | [**tournamentV4.getLobbyEventsByCode**](docs/TournamentV4Api.md#tournamentv4.getlobbyeventsbycode) | **GET** /lol/tournament/v4/lobby-events/by-code/{tournamentCode} | Gets a list of lobby events by tournament code.
*TournamentV4Api* | [**tournamentV4.getTournamentCode**](docs/TournamentV4Api.md#tournamentv4.gettournamentcode) | **GET** /lol/tournament/v4/codes/{tournamentCode} | Returns the tournament code DTO associated with a tournament code string.
*TournamentV4Api* | [**tournamentV4.registerProviderData**](docs/TournamentV4Api.md#tournamentv4.registerproviderdata) | **POST** /lol/tournament/v4/providers | Creates a tournament provider and returns its ID.
*TournamentV4Api* | [**tournamentV4.registerTournament**](docs/TournamentV4Api.md#tournamentv4.registertournament) | **POST** /lol/tournament/v4/tournaments | Creates a tournament and returns its ID.
*TournamentV4Api* | [**tournamentV4.updateCode**](docs/TournamentV4Api.md#tournamentv4.updatecode) | **PUT** /lol/tournament/v4/codes/{tournamentCode} | Update the pick type, map, spectator type, or allowed summoners for a code.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.ChampionMinusmasteryMinusv4ChampionMasteryDTO](docs/ChampionMinusmasteryMinusv4ChampionMasteryDTO.md)
 - [io.swagger.client.models.ChampionMinusv3ChampionInfo](docs/ChampionMinusv3ChampionInfo.md)
 - [io.swagger.client.models.Error](docs/Error.md)
 - [io.swagger.client.models.ErrorStatus](docs/ErrorStatus.md)
 - [io.swagger.client.models.LeagueMinusv4LeagueEntryDTO](docs/LeagueMinusv4LeagueEntryDTO.md)
 - [io.swagger.client.models.LeagueMinusv4LeagueItemDTO](docs/LeagueMinusv4LeagueItemDTO.md)
 - [io.swagger.client.models.LeagueMinusv4LeagueListDTO](docs/LeagueMinusv4LeagueListDTO.md)
 - [io.swagger.client.models.LeagueMinusv4MiniSeriesDTO](docs/LeagueMinusv4MiniSeriesDTO.md)
 - [io.swagger.client.models.LolMinusstatusMinusv3Incident](docs/LolMinusstatusMinusv3Incident.md)
 - [io.swagger.client.models.LolMinusstatusMinusv3Message](docs/LolMinusstatusMinusv3Message.md)
 - [io.swagger.client.models.LolMinusstatusMinusv3Service](docs/LolMinusstatusMinusv3Service.md)
 - [io.swagger.client.models.LolMinusstatusMinusv3ShardStatus](docs/LolMinusstatusMinusv3ShardStatus.md)
 - [io.swagger.client.models.LolMinusstatusMinusv3Translation](docs/LolMinusstatusMinusv3Translation.md)
 - [io.swagger.client.models.MatchMinusv4MasteryDto](docs/MatchMinusv4MasteryDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchDto](docs/MatchMinusv4MatchDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchEventDto](docs/MatchMinusv4MatchEventDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchFrameDto](docs/MatchMinusv4MatchFrameDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchParticipantFrameDto](docs/MatchMinusv4MatchParticipantFrameDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchPositionDto](docs/MatchMinusv4MatchPositionDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchReferenceDto](docs/MatchMinusv4MatchReferenceDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchTimelineDto](docs/MatchMinusv4MatchTimelineDto.md)
 - [io.swagger.client.models.MatchMinusv4MatchlistDto](docs/MatchMinusv4MatchlistDto.md)
 - [io.swagger.client.models.MatchMinusv4ParticipantDto](docs/MatchMinusv4ParticipantDto.md)
 - [io.swagger.client.models.MatchMinusv4ParticipantIdentityDto](docs/MatchMinusv4ParticipantIdentityDto.md)
 - [io.swagger.client.models.MatchMinusv4ParticipantStatsDto](docs/MatchMinusv4ParticipantStatsDto.md)
 - [io.swagger.client.models.MatchMinusv4ParticipantTimelineDto](docs/MatchMinusv4ParticipantTimelineDto.md)
 - [io.swagger.client.models.MatchMinusv4PlayerDto](docs/MatchMinusv4PlayerDto.md)
 - [io.swagger.client.models.MatchMinusv4RuneDto](docs/MatchMinusv4RuneDto.md)
 - [io.swagger.client.models.MatchMinusv4TeamBansDto](docs/MatchMinusv4TeamBansDto.md)
 - [io.swagger.client.models.MatchMinusv4TeamStatsDto](docs/MatchMinusv4TeamStatsDto.md)
 - [io.swagger.client.models.SpectatorMinusv4BannedChampion](docs/SpectatorMinusv4BannedChampion.md)
 - [io.swagger.client.models.SpectatorMinusv4CurrentGameInfo](docs/SpectatorMinusv4CurrentGameInfo.md)
 - [io.swagger.client.models.SpectatorMinusv4CurrentGameParticipant](docs/SpectatorMinusv4CurrentGameParticipant.md)
 - [io.swagger.client.models.SpectatorMinusv4FeaturedGameInfo](docs/SpectatorMinusv4FeaturedGameInfo.md)
 - [io.swagger.client.models.SpectatorMinusv4FeaturedGames](docs/SpectatorMinusv4FeaturedGames.md)
 - [io.swagger.client.models.SpectatorMinusv4GameCustomizationObject](docs/SpectatorMinusv4GameCustomizationObject.md)
 - [io.swagger.client.models.SpectatorMinusv4Observer](docs/SpectatorMinusv4Observer.md)
 - [io.swagger.client.models.SpectatorMinusv4Participant](docs/SpectatorMinusv4Participant.md)
 - [io.swagger.client.models.SpectatorMinusv4Perks](docs/SpectatorMinusv4Perks.md)
 - [io.swagger.client.models.SummonerMinusv4SummonerDTO](docs/SummonerMinusv4SummonerDTO.md)
 - [io.swagger.client.models.TournamentMinusstubMinusv4LobbyEventDTO](docs/TournamentMinusstubMinusv4LobbyEventDTO.md)
 - [io.swagger.client.models.TournamentMinusstubMinusv4LobbyEventDTOWrapper](docs/TournamentMinusstubMinusv4LobbyEventDTOWrapper.md)
 - [io.swagger.client.models.TournamentMinusstubMinusv4ProviderRegistrationParameters](docs/TournamentMinusstubMinusv4ProviderRegistrationParameters.md)
 - [io.swagger.client.models.TournamentMinusstubMinusv4TournamentCodeParameters](docs/TournamentMinusstubMinusv4TournamentCodeParameters.md)
 - [io.swagger.client.models.TournamentMinusstubMinusv4TournamentRegistrationParameters](docs/TournamentMinusstubMinusv4TournamentRegistrationParameters.md)
 - [io.swagger.client.models.TournamentMinusv4LobbyEventDTO](docs/TournamentMinusv4LobbyEventDTO.md)
 - [io.swagger.client.models.TournamentMinusv4LobbyEventDTOWrapper](docs/TournamentMinusv4LobbyEventDTOWrapper.md)
 - [io.swagger.client.models.TournamentMinusv4ProviderRegistrationParameters](docs/TournamentMinusv4ProviderRegistrationParameters.md)
 - [io.swagger.client.models.TournamentMinusv4TournamentCodeDTO](docs/TournamentMinusv4TournamentCodeDTO.md)
 - [io.swagger.client.models.TournamentMinusv4TournamentCodeParameters](docs/TournamentMinusv4TournamentCodeParameters.md)
 - [io.swagger.client.models.TournamentMinusv4TournamentCodeUpdateParameters](docs/TournamentMinusv4TournamentCodeUpdateParameters.md)
 - [io.swagger.client.models.TournamentMinusv4TournamentRegistrationParameters](docs/TournamentMinusv4TournamentRegistrationParameters.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="X-Riot-Token"></a>
### X-Riot-Token

- **Type**: API key
- **API key parameter name**: X-Riot-Token
- **Location**: HTTP header

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string

