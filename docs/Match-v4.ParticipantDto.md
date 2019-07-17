
# MatchMinusv4ParticipantDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stats** | [**MatchMinusv4ParticipantStatsDto**](MatchMinusv4ParticipantStatsDto.md) | Participant statistics. |  [optional]
**participantId** | **kotlin.Int** |  |  [optional]
**runes** | [**kotlin.Array&lt;MatchMinusv4RuneDto&gt;**](MatchMinusv4RuneDto.md) | List of legacy Rune information. Not included for matches played with Runes Reforged. |  [optional]
**timeline** | [**MatchMinusv4ParticipantTimelineDto**](MatchMinusv4ParticipantTimelineDto.md) | Participant timeline data. |  [optional]
**teamId** | **kotlin.Int** | 100 for blue side. 200 for red side. |  [optional]
**spell2Id** | **kotlin.Int** | Second Summoner Spell id. |  [optional]
**masteries** | [**kotlin.Array&lt;MatchMinusv4MasteryDto&gt;**](MatchMinusv4MasteryDto.md) | List of legacy Mastery information. Not included for matches played with Runes Reforged. |  [optional]
**highestAchievedSeasonTier** | [**inline**](#HighestAchievedSeasonTierEnum) | Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation.              (Legal values:  CHALLENGER,  MASTER,  DIAMOND,  PLATINUM,  GOLD,  SILVER,  BRONZE,  UNRANKED) |  [optional]
**spell1Id** | **kotlin.Int** | First Summoner Spell id. |  [optional]
**championId** | **kotlin.Int** |  |  [optional]


<a name="HighestAchievedSeasonTierEnum"></a>
## Enum: highestAchievedSeasonTier
Name | Value
---- | -----
highestAchievedSeasonTier | CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, UNRANKED



