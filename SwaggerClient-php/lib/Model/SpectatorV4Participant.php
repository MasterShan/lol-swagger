<?php
/**
 * SpectatorV4Participant
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
 * SpectatorV4Participant Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SpectatorV4Participant implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'spectator-v4.Participant';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'profile_icon_id' => 'int',
        'champion_id' => 'int',
        'summoner_name' => 'string',
        'bot' => 'bool',
        'spell2_id' => 'int',
        'team_id' => 'int',
        'spell1_id' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'profile_icon_id' => 'int64',
        'champion_id' => 'int64',
        'summoner_name' => null,
        'bot' => null,
        'spell2_id' => 'int64',
        'team_id' => 'int64',
        'spell1_id' => 'int64'
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
        'profile_icon_id' => 'profileIconId',
        'champion_id' => 'championId',
        'summoner_name' => 'summonerName',
        'bot' => 'bot',
        'spell2_id' => 'spell2Id',
        'team_id' => 'teamId',
        'spell1_id' => 'spell1Id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'profile_icon_id' => 'setProfileIconId',
        'champion_id' => 'setChampionId',
        'summoner_name' => 'setSummonerName',
        'bot' => 'setBot',
        'spell2_id' => 'setSpell2Id',
        'team_id' => 'setTeamId',
        'spell1_id' => 'setSpell1Id'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'profile_icon_id' => 'getProfileIconId',
        'champion_id' => 'getChampionId',
        'summoner_name' => 'getSummonerName',
        'bot' => 'getBot',
        'spell2_id' => 'getSpell2Id',
        'team_id' => 'getTeamId',
        'spell1_id' => 'getSpell1Id'
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
        $this->container['profile_icon_id'] = isset($data['profile_icon_id']) ? $data['profile_icon_id'] : null;
        $this->container['champion_id'] = isset($data['champion_id']) ? $data['champion_id'] : null;
        $this->container['summoner_name'] = isset($data['summoner_name']) ? $data['summoner_name'] : null;
        $this->container['bot'] = isset($data['bot']) ? $data['bot'] : null;
        $this->container['spell2_id'] = isset($data['spell2_id']) ? $data['spell2_id'] : null;
        $this->container['team_id'] = isset($data['team_id']) ? $data['team_id'] : null;
        $this->container['spell1_id'] = isset($data['spell1_id']) ? $data['spell1_id'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

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
     * Gets profile_icon_id
     *
     * @return int
     */
    public function getProfileIconId()
    {
        return $this->container['profile_icon_id'];
    }

    /**
     * Sets profile_icon_id
     *
     * @param int $profile_icon_id The ID of the profile icon used by this participant
     *
     * @return $this
     */
    public function setProfileIconId($profile_icon_id)
    {
        $this->container['profile_icon_id'] = $profile_icon_id;

        return $this;
    }

    /**
     * Gets champion_id
     *
     * @return int
     */
    public function getChampionId()
    {
        return $this->container['champion_id'];
    }

    /**
     * Sets champion_id
     *
     * @param int $champion_id The ID of the champion played by this participant
     *
     * @return $this
     */
    public function setChampionId($champion_id)
    {
        $this->container['champion_id'] = $champion_id;

        return $this;
    }

    /**
     * Gets summoner_name
     *
     * @return string
     */
    public function getSummonerName()
    {
        return $this->container['summoner_name'];
    }

    /**
     * Sets summoner_name
     *
     * @param string $summoner_name The summoner name of this participant
     *
     * @return $this
     */
    public function setSummonerName($summoner_name)
    {
        $this->container['summoner_name'] = $summoner_name;

        return $this;
    }

    /**
     * Gets bot
     *
     * @return bool
     */
    public function getBot()
    {
        return $this->container['bot'];
    }

    /**
     * Sets bot
     *
     * @param bool $bot Flag indicating whether or not this participant is a bot
     *
     * @return $this
     */
    public function setBot($bot)
    {
        $this->container['bot'] = $bot;

        return $this;
    }

    /**
     * Gets spell2_id
     *
     * @return int
     */
    public function getSpell2Id()
    {
        return $this->container['spell2_id'];
    }

    /**
     * Sets spell2_id
     *
     * @param int $spell2_id The ID of the second summoner spell used by this participant
     *
     * @return $this
     */
    public function setSpell2Id($spell2_id)
    {
        $this->container['spell2_id'] = $spell2_id;

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
     * @param int $team_id The team ID of this participant, indicating the participant's team
     *
     * @return $this
     */
    public function setTeamId($team_id)
    {
        $this->container['team_id'] = $team_id;

        return $this;
    }

    /**
     * Gets spell1_id
     *
     * @return int
     */
    public function getSpell1Id()
    {
        return $this->container['spell1_id'];
    }

    /**
     * Sets spell1_id
     *
     * @param int $spell1_id The ID of the first summoner spell used by this participant
     *
     * @return $this
     */
    public function setSpell1Id($spell1_id)
    {
        $this->container['spell1_id'] = $spell1_id;

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


