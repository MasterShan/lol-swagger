
# TournamentV4TournamentCodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**map** | **String** | The game map for the tournament code game |  [optional]
**code** | **String** | The tournament code. |  [optional]
**spectators** | **String** | The spectator mode for the tournament code game. |  [optional]
**region** | [**RegionEnum**](#RegionEnum) | The tournament code&#39;s region.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR) |  [optional]
**providerId** | **Integer** | The provider&#39;s ID. |  [optional]
**teamSize** | **Integer** | The team size for the tournament code game. |  [optional]
**participants** | **List&lt;String&gt;** | The summonerIds of the participants (Encrypted) |  [optional]
**pickType** | **String** | The pick mode for tournament code game. |  [optional]
**tournamentId** | **Integer** | The tournament&#39;s ID. |  [optional]
**lobbyName** | **String** | The lobby name for the tournament code game. |  [optional]
**password** | **String** | The password for the tournament code game. |  [optional]
**id** | **Integer** | The tournament code&#39;s ID. |  [optional]
**metaData** | **String** | The metadata for tournament code. |  [optional]


<a name="RegionEnum"></a>
## Enum: RegionEnum
Name | Value
---- | -----
BR | &quot;BR&quot;
EUNE | &quot;EUNE&quot;
EUW | &quot;EUW&quot;
JP | &quot;JP&quot;
LAN | &quot;LAN&quot;
LAS | &quot;LAS&quot;
NA | &quot;NA&quot;
OCE | &quot;OCE&quot;
PBE | &quot;PBE&quot;
RU | &quot;RU&quot;
TR | &quot;TR&quot;



