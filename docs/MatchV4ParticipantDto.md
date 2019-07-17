# RiotApi.MatchV4ParticipantDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stats** | [**MatchV4ParticipantStatsDto**](MatchV4ParticipantStatsDto.md) | Participant statistics. | [optional] 
**participantId** | **Number** |  | [optional] 
**runes** | [**[MatchV4RuneDto]**](MatchV4RuneDto.md) | List of legacy Rune information. Not included for matches played with Runes Reforged. | [optional] 
**timeline** | [**MatchV4ParticipantTimelineDto**](MatchV4ParticipantTimelineDto.md) | Participant timeline data. | [optional] 
**teamId** | **Number** | 100 for blue side. 200 for red side. | [optional] 
**spell2Id** | **Number** | Second Summoner Spell id. | [optional] 
**masteries** | [**[MatchV4MasteryDto]**](MatchV4MasteryDto.md) | List of legacy Mastery information. Not included for matches played with Runes Reforged. | [optional] 
**highestAchievedSeasonTier** | **String** | Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation.              (Legal values:  CHALLENGER,  MASTER,  DIAMOND,  PLATINUM,  GOLD,  SILVER,  BRONZE,  UNRANKED) | [optional] 
**spell1Id** | **Number** | First Summoner Spell id. | [optional] 
**championId** | **Number** |  | [optional] 


<a name="HighestAchievedSeasonTierEnum"></a>
## Enum: HighestAchievedSeasonTierEnum


* `CHALLENGER` (value: `"CHALLENGER"`)

* `MASTER` (value: `"MASTER"`)

* `DIAMOND` (value: `"DIAMOND"`)

* `PLATINUM` (value: `"PLATINUM"`)

* `GOLD` (value: `"GOLD"`)

* `SILVER` (value: `"SILVER"`)

* `BRONZE` (value: `"BRONZE"`)

* `UNRANKED` (value: `"UNRANKED"`)




