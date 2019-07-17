# MatchV4ParticipantDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stats** | [**MatchV4ParticipantStatsDto**](MatchV4ParticipantStatsDto.md) | Participant statistics. | [optional] 
**participant_id** | **int** |  | [optional] 
**runes** | [**list[MatchV4RuneDto]**](MatchV4RuneDto.md) | List of legacy Rune information. Not included for matches played with Runes Reforged. | [optional] 
**timeline** | [**MatchV4ParticipantTimelineDto**](MatchV4ParticipantTimelineDto.md) | Participant timeline data. | [optional] 
**team_id** | **int** | 100 for blue side. 200 for red side. | [optional] 
**spell2_id** | **int** | Second Summoner Spell id. | [optional] 
**masteries** | [**list[MatchV4MasteryDto]**](MatchV4MasteryDto.md) | List of legacy Mastery information. Not included for matches played with Runes Reforged. | [optional] 
**highest_achieved_season_tier** | **str** | Highest ranked tier achieved for the previous season in a specific subset of queueIds, if any, otherwise null. Used to display border in game loading screen. Please refer to the Ranked Info documentation.              (Legal values:  CHALLENGER,  MASTER,  DIAMOND,  PLATINUM,  GOLD,  SILVER,  BRONZE,  UNRANKED) | [optional] 
**spell1_id** | **int** | First Summoner Spell id. | [optional] 
**champion_id** | **int** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


