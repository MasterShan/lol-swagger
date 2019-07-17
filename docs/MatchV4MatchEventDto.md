
# MatchV4MatchEventDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** |  |  [optional]
**towerType** | **String** |  |  [optional]
**teamId** | **Integer** |  |  [optional]
**ascendedType** | **String** |  |  [optional]
**killerId** | **Integer** |  |  [optional]
**levelUpType** | **String** |  |  [optional]
**pointCaptured** | **String** |  |  [optional]
**assistingParticipantIds** | **List&lt;Integer&gt;** |  |  [optional]
**wardType** | **String** |  |  [optional]
**monsterType** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | (Legal values:  CHAMPION_KILL,  WARD_PLACED,  WARD_KILL,  BUILDING_KILL,  ELITE_MONSTER_KILL,  ITEM_PURCHASED,  ITEM_SOLD,  ITEM_DESTROYED,  ITEM_UNDO,  SKILL_LEVEL_UP,  ASCENDED_EVENT,  CAPTURE_POINT,  PORO_KING_SUMMON) |  [optional]
**skillSlot** | **Integer** |  |  [optional]
**victimId** | **Integer** |  |  [optional]
**timestamp** | **Long** |  |  [optional]
**afterId** | **Integer** |  |  [optional]
**monsterSubType** | **String** |  |  [optional]
**laneType** | **String** |  |  [optional]
**itemId** | **Integer** |  |  [optional]
**participantId** | **Integer** |  |  [optional]
**buildingType** | **String** |  |  [optional]
**creatorId** | **Integer** |  |  [optional]
**position** | [**MatchV4MatchPositionDto**](MatchV4MatchPositionDto.md) |  |  [optional]
**beforeId** | **Integer** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CHAMPION_KILL | &quot;CHAMPION_KILL&quot;
WARD_PLACED | &quot;WARD_PLACED&quot;
WARD_KILL | &quot;WARD_KILL&quot;
BUILDING_KILL | &quot;BUILDING_KILL&quot;
ELITE_MONSTER_KILL | &quot;ELITE_MONSTER_KILL&quot;
ITEM_PURCHASED | &quot;ITEM_PURCHASED&quot;
ITEM_SOLD | &quot;ITEM_SOLD&quot;
ITEM_DESTROYED | &quot;ITEM_DESTROYED&quot;
ITEM_UNDO | &quot;ITEM_UNDO&quot;
SKILL_LEVEL_UP | &quot;SKILL_LEVEL_UP&quot;
ASCENDED_EVENT | &quot;ASCENDED_EVENT&quot;
CAPTURE_POINT | &quot;CAPTURE_POINT&quot;
PORO_KING_SUMMON | &quot;PORO_KING_SUMMON&quot;



