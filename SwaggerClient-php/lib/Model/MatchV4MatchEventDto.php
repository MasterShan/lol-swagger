<?php
/**
 * MatchV4MatchEventDto
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Riot API
 *
 * OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. ***
 *
 * OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.7
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * MatchV4MatchEventDto Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class MatchV4MatchEventDto implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'match-v4.MatchEventDto';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'event_type' => 'string',
        'tower_type' => 'string',
        'team_id' => 'int',
        'ascended_type' => 'string',
        'killer_id' => 'int',
        'level_up_type' => 'string',
        'point_captured' => 'string',
        'assisting_participant_ids' => 'int[]',
        'ward_type' => 'string',
        'monster_type' => 'string',
        'type' => 'string',
        'skill_slot' => 'int',
        'victim_id' => 'int',
        'timestamp' => 'int',
        'after_id' => 'int',
        'monster_sub_type' => 'string',
        'lane_type' => 'string',
        'item_id' => 'int',
        'participant_id' => 'int',
        'building_type' => 'string',
        'creator_id' => 'int',
        'position' => '\Swagger\Client\Model\MatchV4MatchPositionDto',
        'before_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'event_type' => null,
        'tower_type' => null,
        'team_id' => 'int32',
        'ascended_type' => null,
        'killer_id' => 'int32',
        'level_up_type' => null,
        'point_captured' => null,
        'assisting_participant_ids' => 'int32',
        'ward_type' => null,
        'monster_type' => null,
        'type' => null,
        'skill_slot' => 'int32',
        'victim_id' => 'int32',
        'timestamp' => 'int64',
        'after_id' => 'int32',
        'monster_sub_type' => null,
        'lane_type' => null,
        'item_id' => 'int32',
        'participant_id' => 'int32',
        'building_type' => null,
        'creator_id' => 'int32',
        'position' => null,
        'before_id' => 'int32'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'event_type' => 'eventType',
        'tower_type' => 'towerType',
        'team_id' => 'teamId',
        'ascended_type' => 'ascendedType',
        'killer_id' => 'killerId',
        'level_up_type' => 'levelUpType',
        'point_captured' => 'pointCaptured',
        'assisting_participant_ids' => 'assistingParticipantIds',
        'ward_type' => 'wardType',
        'monster_type' => 'monsterType',
        'type' => 'type',
        'skill_slot' => 'skillSlot',
        'victim_id' => 'victimId',
        'timestamp' => 'timestamp',
        'after_id' => 'afterId',
        'monster_sub_type' => 'monsterSubType',
        'lane_type' => 'laneType',
        'item_id' => 'itemId',
        'participant_id' => 'participantId',
        'building_type' => 'buildingType',
        'creator_id' => 'creatorId',
        'position' => 'position',
        'before_id' => 'beforeId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'event_type' => 'setEventType',
        'tower_type' => 'setTowerType',
        'team_id' => 'setTeamId',
        'ascended_type' => 'setAscendedType',
        'killer_id' => 'setKillerId',
        'level_up_type' => 'setLevelUpType',
        'point_captured' => 'setPointCaptured',
        'assisting_participant_ids' => 'setAssistingParticipantIds',
        'ward_type' => 'setWardType',
        'monster_type' => 'setMonsterType',
        'type' => 'setType',
        'skill_slot' => 'setSkillSlot',
        'victim_id' => 'setVictimId',
        'timestamp' => 'setTimestamp',
        'after_id' => 'setAfterId',
        'monster_sub_type' => 'setMonsterSubType',
        'lane_type' => 'setLaneType',
        'item_id' => 'setItemId',
        'participant_id' => 'setParticipantId',
        'building_type' => 'setBuildingType',
        'creator_id' => 'setCreatorId',
        'position' => 'setPosition',
        'before_id' => 'setBeforeId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'event_type' => 'getEventType',
        'tower_type' => 'getTowerType',
        'team_id' => 'getTeamId',
        'ascended_type' => 'getAscendedType',
        'killer_id' => 'getKillerId',
        'level_up_type' => 'getLevelUpType',
        'point_captured' => 'getPointCaptured',
        'assisting_participant_ids' => 'getAssistingParticipantIds',
        'ward_type' => 'getWardType',
        'monster_type' => 'getMonsterType',
        'type' => 'getType',
        'skill_slot' => 'getSkillSlot',
        'victim_id' => 'getVictimId',
        'timestamp' => 'getTimestamp',
        'after_id' => 'getAfterId',
        'monster_sub_type' => 'getMonsterSubType',
        'lane_type' => 'getLaneType',
        'item_id' => 'getItemId',
        'participant_id' => 'getParticipantId',
        'building_type' => 'getBuildingType',
        'creator_id' => 'getCreatorId',
        'position' => 'getPosition',
        'before_id' => 'getBeforeId'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    const TYPE_CHAMPION_KILL = 'CHAMPION_KILL';
    const TYPE_WARD_PLACED = 'WARD_PLACED';
    const TYPE_WARD_KILL = 'WARD_KILL';
    const TYPE_BUILDING_KILL = 'BUILDING_KILL';
    const TYPE_ELITE_MONSTER_KILL = 'ELITE_MONSTER_KILL';
    const TYPE_ITEM_PURCHASED = 'ITEM_PURCHASED';
    const TYPE_ITEM_SOLD = 'ITEM_SOLD';
    const TYPE_ITEM_DESTROYED = 'ITEM_DESTROYED';
    const TYPE_ITEM_UNDO = 'ITEM_UNDO';
    const TYPE_SKILL_LEVEL_UP = 'SKILL_LEVEL_UP';
    const TYPE_ASCENDED_EVENT = 'ASCENDED_EVENT';
    const TYPE_CAPTURE_POINT = 'CAPTURE_POINT';
    const TYPE_PORO_KING_SUMMON = 'PORO_KING_SUMMON';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getTypeAllowableValues()
    {
        return [
            self::TYPE_CHAMPION_KILL,
            self::TYPE_WARD_PLACED,
            self::TYPE_WARD_KILL,
            self::TYPE_BUILDING_KILL,
            self::TYPE_ELITE_MONSTER_KILL,
            self::TYPE_ITEM_PURCHASED,
            self::TYPE_ITEM_SOLD,
            self::TYPE_ITEM_DESTROYED,
            self::TYPE_ITEM_UNDO,
            self::TYPE_SKILL_LEVEL_UP,
            self::TYPE_ASCENDED_EVENT,
            self::TYPE_CAPTURE_POINT,
            self::TYPE_PORO_KING_SUMMON,
        ];
    }
    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['event_type'] = isset($data['event_type']) ? $data['event_type'] : null;
        $this->container['tower_type'] = isset($data['tower_type']) ? $data['tower_type'] : null;
        $this->container['team_id'] = isset($data['team_id']) ? $data['team_id'] : null;
        $this->container['ascended_type'] = isset($data['ascended_type']) ? $data['ascended_type'] : null;
        $this->container['killer_id'] = isset($data['killer_id']) ? $data['killer_id'] : null;
        $this->container['level_up_type'] = isset($data['level_up_type']) ? $data['level_up_type'] : null;
        $this->container['point_captured'] = isset($data['point_captured']) ? $data['point_captured'] : null;
        $this->container['assisting_participant_ids'] = isset($data['assisting_participant_ids']) ? $data['assisting_participant_ids'] : null;
        $this->container['ward_type'] = isset($data['ward_type']) ? $data['ward_type'] : null;
        $this->container['monster_type'] = isset($data['monster_type']) ? $data['monster_type'] : null;
        $this->container['type'] = isset($data['type']) ? $data['type'] : null;
        $this->container['skill_slot'] = isset($data['skill_slot']) ? $data['skill_slot'] : null;
        $this->container['victim_id'] = isset($data['victim_id']) ? $data['victim_id'] : null;
        $this->container['timestamp'] = isset($data['timestamp']) ? $data['timestamp'] : null;
        $this->container['after_id'] = isset($data['after_id']) ? $data['after_id'] : null;
        $this->container['monster_sub_type'] = isset($data['monster_sub_type']) ? $data['monster_sub_type'] : null;
        $this->container['lane_type'] = isset($data['lane_type']) ? $data['lane_type'] : null;
        $this->container['item_id'] = isset($data['item_id']) ? $data['item_id'] : null;
        $this->container['participant_id'] = isset($data['participant_id']) ? $data['participant_id'] : null;
        $this->container['building_type'] = isset($data['building_type']) ? $data['building_type'] : null;
        $this->container['creator_id'] = isset($data['creator_id']) ? $data['creator_id'] : null;
        $this->container['position'] = isset($data['position']) ? $data['position'] : null;
        $this->container['before_id'] = isset($data['before_id']) ? $data['before_id'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getTypeAllowableValues();
        if (!is_null($this->container['type']) && !in_array($this->container['type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets event_type
     *
     * @return string
     */
    public function getEventType()
    {
        return $this->container['event_type'];
    }

    /**
     * Sets event_type
     *
     * @param string $event_type event_type
     *
     * @return $this
     */
    public function setEventType($event_type)
    {
        $this->container['event_type'] = $event_type;

        return $this;
    }

    /**
     * Gets tower_type
     *
     * @return string
     */
    public function getTowerType()
    {
        return $this->container['tower_type'];
    }

    /**
     * Sets tower_type
     *
     * @param string $tower_type tower_type
     *
     * @return $this
     */
    public function setTowerType($tower_type)
    {
        $this->container['tower_type'] = $tower_type;

        return $this;
    }

    /**
     * Gets team_id
     *
     * @return int
     */
    public function getTeamId()
    {
        return $this->container['team_id'];
    }

    /**
     * Sets team_id
     *
     * @param int $team_id team_id
     *
     * @return $this
     */
    public function setTeamId($team_id)
    {
        $this->container['team_id'] = $team_id;

        return $this;
    }

    /**
     * Gets ascended_type
     *
     * @return string
     */
    public function getAscendedType()
    {
        return $this->container['ascended_type'];
    }

    /**
     * Sets ascended_type
     *
     * @param string $ascended_type ascended_type
     *
     * @return $this
     */
    public function setAscendedType($ascended_type)
    {
        $this->container['ascended_type'] = $ascended_type;

        return $this;
    }

    /**
     * Gets killer_id
     *
     * @return int
     */
    public function getKillerId()
    {
        return $this->container['killer_id'];
    }

    /**
     * Sets killer_id
     *
     * @param int $killer_id killer_id
     *
     * @return $this
     */
    public function setKillerId($killer_id)
    {
        $this->container['killer_id'] = $killer_id;

        return $this;
    }

    /**
     * Gets level_up_type
     *
     * @return string
     */
    public function getLevelUpType()
    {
        return $this->container['level_up_type'];
    }

    /**
     * Sets level_up_type
     *
     * @param string $level_up_type level_up_type
     *
     * @return $this
     */
    public function setLevelUpType($level_up_type)
    {
        $this->container['level_up_type'] = $level_up_type;

        return $this;
    }

    /**
     * Gets point_captured
     *
     * @return string
     */
    public function getPointCaptured()
    {
        return $this->container['point_captured'];
    }

    /**
     * Sets point_captured
     *
     * @param string $point_captured point_captured
     *
     * @return $this
     */
    public function setPointCaptured($point_captured)
    {
        $this->container['point_captured'] = $point_captured;

        return $this;
    }

    /**
     * Gets assisting_participant_ids
     *
     * @return int[]
     */
    public function getAssistingParticipantIds()
    {
        return $this->container['assisting_participant_ids'];
    }

    /**
     * Sets assisting_participant_ids
     *
     * @param int[] $assisting_participant_ids assisting_participant_ids
     *
     * @return $this
     */
    public function setAssistingParticipantIds($assisting_participant_ids)
    {
        $this->container['assisting_participant_ids'] = $assisting_participant_ids;

        return $this;
    }

    /**
     * Gets ward_type
     *
     * @return string
     */
    public function getWardType()
    {
        return $this->container['ward_type'];
    }

    /**
     * Sets ward_type
     *
     * @param string $ward_type ward_type
     *
     * @return $this
     */
    public function setWardType($ward_type)
    {
        $this->container['ward_type'] = $ward_type;

        return $this;
    }

    /**
     * Gets monster_type
     *
     * @return string
     */
    public function getMonsterType()
    {
        return $this->container['monster_type'];
    }

    /**
     * Sets monster_type
     *
     * @param string $monster_type monster_type
     *
     * @return $this
     */
    public function setMonsterType($monster_type)
    {
        $this->container['monster_type'] = $monster_type;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type (Legal values:  CHAMPION_KILL,  WARD_PLACED,  WARD_KILL,  BUILDING_KILL,  ELITE_MONSTER_KILL,  ITEM_PURCHASED,  ITEM_SOLD,  ITEM_DESTROYED,  ITEM_UNDO,  SKILL_LEVEL_UP,  ASCENDED_EVENT,  CAPTURE_POINT,  PORO_KING_SUMMON)
     *
     * @return $this
     */
    public function setType($type)
    {
        $allowedValues = $this->getTypeAllowableValues();
        if (!is_null($type) && !in_array($type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets skill_slot
     *
     * @return int
     */
    public function getSkillSlot()
    {
        return $this->container['skill_slot'];
    }

    /**
     * Sets skill_slot
     *
     * @param int $skill_slot skill_slot
     *
     * @return $this
     */
    public function setSkillSlot($skill_slot)
    {
        $this->container['skill_slot'] = $skill_slot;

        return $this;
    }

    /**
     * Gets victim_id
     *
     * @return int
     */
    public function getVictimId()
    {
        return $this->container['victim_id'];
    }

    /**
     * Sets victim_id
     *
     * @param int $victim_id victim_id
     *
     * @return $this
     */
    public function setVictimId($victim_id)
    {
        $this->container['victim_id'] = $victim_id;

        return $this;
    }

    /**
     * Gets timestamp
     *
     * @return int
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param int $timestamp timestamp
     *
     * @return $this
     */
    public function setTimestamp($timestamp)
    {
        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets after_id
     *
     * @return int
     */
    public function getAfterId()
    {
        return $this->container['after_id'];
    }

    /**
     * Sets after_id
     *
     * @param int $after_id after_id
     *
     * @return $this
     */
    public function setAfterId($after_id)
    {
        $this->container['after_id'] = $after_id;

        return $this;
    }

    /**
     * Gets monster_sub_type
     *
     * @return string
     */
    public function getMonsterSubType()
    {
        return $this->container['monster_sub_type'];
    }

    /**
     * Sets monster_sub_type
     *
     * @param string $monster_sub_type monster_sub_type
     *
     * @return $this
     */
    public function setMonsterSubType($monster_sub_type)
    {
        $this->container['monster_sub_type'] = $monster_sub_type;

        return $this;
    }

    /**
     * Gets lane_type
     *
     * @return string
     */
    public function getLaneType()
    {
        return $this->container['lane_type'];
    }

    /**
     * Sets lane_type
     *
     * @param string $lane_type lane_type
     *
     * @return $this
     */
    public function setLaneType($lane_type)
    {
        $this->container['lane_type'] = $lane_type;

        return $this;
    }

    /**
     * Gets item_id
     *
     * @return int
     */
    public function getItemId()
    {
        return $this->container['item_id'];
    }

    /**
     * Sets item_id
     *
     * @param int $item_id item_id
     *
     * @return $this
     */
    public function setItemId($item_id)
    {
        $this->container['item_id'] = $item_id;

        return $this;
    }

    /**
     * Gets participant_id
     *
     * @return int
     */
    public function getParticipantId()
    {
        return $this->container['participant_id'];
    }

    /**
     * Sets participant_id
     *
     * @param int $participant_id participant_id
     *
     * @return $this
     */
    public function setParticipantId($participant_id)
    {
        $this->container['participant_id'] = $participant_id;

        return $this;
    }

    /**
     * Gets building_type
     *
     * @return string
     */
    public function getBuildingType()
    {
        return $this->container['building_type'];
    }

    /**
     * Sets building_type
     *
     * @param string $building_type building_type
     *
     * @return $this
     */
    public function setBuildingType($building_type)
    {
        $this->container['building_type'] = $building_type;

        return $this;
    }

    /**
     * Gets creator_id
     *
     * @return int
     */
    public function getCreatorId()
    {
        return $this->container['creator_id'];
    }

    /**
     * Sets creator_id
     *
     * @param int $creator_id creator_id
     *
     * @return $this
     */
    public function setCreatorId($creator_id)
    {
        $this->container['creator_id'] = $creator_id;

        return $this;
    }

    /**
     * Gets position
     *
     * @return \Swagger\Client\Model\MatchV4MatchPositionDto
     */
    public function getPosition()
    {
        return $this->container['position'];
    }

    /**
     * Sets position
     *
     * @param \Swagger\Client\Model\MatchV4MatchPositionDto $position position
     *
     * @return $this
     */
    public function setPosition($position)
    {
        $this->container['position'] = $position;

        return $this;
    }

    /**
     * Gets before_id
     *
     * @return int
     */
    public function getBeforeId()
    {
        return $this->container['before_id'];
    }

    /**
     * Sets before_id
     *
     * @param int $before_id before_id
     *
     * @return $this
     */
    public function setBeforeId($before_id)
    {
        $this->container['before_id'] = $before_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


