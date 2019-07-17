
# MatchMinusv4ParticipantTimelineDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lane** | [**inline**](#LaneEnum) | Participant&#39;s calculated lane. MID and BOT are legacy values.              (Legal values:  MID,  MIDDLE,  TOP,  JUNGLE,  BOT,  BOTTOM) |  [optional]
**participantId** | **kotlin.Int** |  |  [optional]
**csDiffPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Creep score difference versus the calculated lane opponent(s) for a specified period. |  [optional]
**goldPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Gold for a specified period. |  [optional]
**xpDiffPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Experience difference versus the calculated lane opponent(s) for a specified period. |  [optional]
**creepsPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Creeps for a specified period. |  [optional]
**xpPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Experience change for a specified period. |  [optional]
**role** | [**inline**](#RoleEnum) | Participant&#39;s calculated role.              (Legal values:  DUO,  NONE,  SOLO,  DUO_CARRY,  DUO_SUPPORT) |  [optional]
**damageTakenDiffPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Damage taken difference versus the calculated lane opponent(s) for a specified period. |  [optional]
**damageTakenPerMinDeltas** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | Damage taken for a specified period. |  [optional]


<a name="LaneEnum"></a>
## Enum: lane
Name | Value
---- | -----
lane | MID, MIDDLE, TOP, JUNGLE, BOT, BOTTOM


<a name="RoleEnum"></a>
## Enum: role
Name | Value
---- | -----
role | DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT



