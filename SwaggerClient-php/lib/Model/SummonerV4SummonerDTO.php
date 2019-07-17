<?php
/**
 * SummonerV4SummonerDTO
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
 * SummonerV4SummonerDTO Class Doc Comment
 *
 * @category Class
 * @description represents a summoner
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SummonerV4SummonerDTO implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'summoner-v4.SummonerDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'profile_icon_id' => 'int',
        'name' => 'string',
        'puuid' => 'string',
        'summoner_level' => 'int',
        'revision_date' => 'int',
        'id' => 'string',
        'account_id' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'profile_icon_id' => 'int32',
        'name' => null,
        'puuid' => null,
        'summoner_level' => 'int64',
        'revision_date' => 'int64',
        'id' => null,
        'account_id' => null
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
        'name' => 'name',
        'puuid' => 'puuid',
        'summoner_level' => 'summonerLevel',
        'revision_date' => 'revisionDate',
        'id' => 'id',
        'account_id' => 'accountId'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'profile_icon_id' => 'setProfileIconId',
        'name' => 'setName',
        'puuid' => 'setPuuid',
        'summoner_level' => 'setSummonerLevel',
        'revision_date' => 'setRevisionDate',
        'id' => 'setId',
        'account_id' => 'setAccountId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'profile_icon_id' => 'getProfileIconId',
        'name' => 'getName',
        'puuid' => 'getPuuid',
        'summoner_level' => 'getSummonerLevel',
        'revision_date' => 'getRevisionDate',
        'id' => 'getId',
        'account_id' => 'getAccountId'
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
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['puuid'] = isset($data['puuid']) ? $data['puuid'] : null;
        $this->container['summoner_level'] = isset($data['summoner_level']) ? $data['summoner_level'] : null;
        $this->container['revision_date'] = isset($data['revision_date']) ? $data['revision_date'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
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
     * @param int $profile_icon_id ID of the summoner icon associated with the summoner.
     *
     * @return $this
     */
    public function setProfileIconId($profile_icon_id)
    {
        $this->container['profile_icon_id'] = $profile_icon_id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name Summoner name.
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets puuid
     *
     * @return string
     */
    public function getPuuid()
    {
        return $this->container['puuid'];
    }

    /**
     * Sets puuid
     *
     * @param string $puuid Encrypted PUUID. Exact length of 78 characters.
     *
     * @return $this
     */
    public function setPuuid($puuid)
    {
        $this->container['puuid'] = $puuid;

        return $this;
    }

    /**
     * Gets summoner_level
     *
     * @return int
     */
    public function getSummonerLevel()
    {
        return $this->container['summoner_level'];
    }

    /**
     * Sets summoner_level
     *
     * @param int $summoner_level Summoner level associated with the summoner.
     *
     * @return $this
     */
    public function setSummonerLevel($summoner_level)
    {
        $this->container['summoner_level'] = $summoner_level;

        return $this;
    }

    /**
     * Gets revision_date
     *
     * @return int
     */
    public function getRevisionDate()
    {
        return $this->container['revision_date'];
    }

    /**
     * Sets revision_date
     *
     * @param int $revision_date Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
     *
     * @return $this
     */
    public function setRevisionDate($revision_date)
    {
        $this->container['revision_date'] = $revision_date;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id Encrypted summoner ID. Max length 63 characters.
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets account_id
     *
     * @return string
     */
    public function getAccountId()
    {
        return $this->container['account_id'];
    }

    /**
     * Sets account_id
     *
     * @param string $account_id Encrypted account ID. Max length 56 characters.
     *
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

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

