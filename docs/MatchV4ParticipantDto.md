
# MatchV4ParticipantDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stats** | [**MatchV4ParticipantStatsDto**](MatchV4ParticipantStatsDto.md) | Participant statistics. |  [optional]
**participantId** | **Integer** |  |  [optional]
**runes** | [**List&lt;MatchV4RuneDto&gt;**](MatchV4RuneDto.md) | List of legacy Rune information. Not included for matches played with Runes Reforged. |  [optional]
**timeline** | [**MatchV4ParticipantTimelineDto**](MatchV4ParticipantTimelineDto.md) | Participant timeline data. |  [optional]
**teamId** | **Integer** | 100 for blue side. 200 for red side. |  [optional]
**spell2Id** | **Integer** | Second Summoner Spell id. |  [optional]
**masteries** | [**List&lt;MatchV4MasteryDto&gt;**](MatchV4MasteryDto.md) | List of legacy Mastery information. Not included for matches played with Runes Reforged. |  [optional]
**highestAchievedSeasonTier** | [**HighestAchievedSeasonTierEnum**](#HighestAchievedSeasonTierEnum) | Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation.              (Legal values:  CHALLENGER,  MASTER,  DIAMOND,  PLATINUM,  GOLD,  SILVER,  BRONZE,  UNRANKED) |  [optional]
**spell1Id** | **Integer** | First Summoner Spell id. |  [optional]
**championId** | **Integer** |  |  [optional]


<a name="HighestAchievedSeasonTierEnum"></a>
## Enum: HighestAchievedSeasonTierEnum
Name | Value
---- | -----
CHALLENGER | &quot;CHALLENGER&quot;
MASTER | &quot;MASTER&quot;
DIAMOND | &quot;DIAMOND&quot;
PLATINUM | &quot;PLATINUM&quot;
GOLD | &quot;GOLD&quot;
SILVER | &quot;SILVER&quot;
BRONZE | &quot;BRONZE&quot;
UNRANKED | &quot;UNRANKED&quot;



