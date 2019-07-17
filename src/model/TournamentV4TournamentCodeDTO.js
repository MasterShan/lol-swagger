/**
 * Riot API
 *  OpenAPI/Swagger version of the [Riot API](https://developer.riotgames.com/). Automatically generated daily. ## Download OpenAPI Spec File The following versions of the Riot API spec file are available: - `openapi-3.0.0.json` ([download file](../openapi-3.0.0.json), [view ui](?openapi-3.0.0.json)) - `openapi-3.0.0.min.json` ([download file](../openapi-3.0.0.min.json), [view ui](?openapi-3.0.0.min.json)) - `openapi-3.0.0.yml` ([download file](../openapi-3.0.0.yml), [view ui](?openapi-3.0.0.yml)) - `openapi-3.0.0.min.yml` ([download file](../openapi-3.0.0.min.yml), [view ui](?openapi-3.0.0.min.yml)) - `swaggerspec-2.0.json` ([download file](../swaggerspec-2.0.json), [view ui](?swaggerspec-2.0.json)) - `swaggerspec-2.0.min.json` ([download file](../swaggerspec-2.0.min.json), [view ui](?swaggerspec-2.0.min.json)) - `swaggerspec-2.0.yml` ([download file](../swaggerspec-2.0.yml), [view ui](?swaggerspec-2.0.yml)) - `swaggerspec-2.0.min.yml` ([download file](../swaggerspec-2.0.min.yml), [view ui](?swaggerspec-2.0.min.yml)) ## Source Code Source code on [GitHub](https://github.com/MingweiSamuel/riotapi-schema). Pull requests welcome! ## Automatically Generated Rebuilt on [Travis CI](https://travis-ci.org/MingweiSamuel/riotapi-schema/builds) daily. *** 
 *
 * OpenAPI spec version: dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.7
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.RiotApi) {
      root.RiotApi = {};
    }
    root.RiotApi.TournamentV4TournamentCodeDTO = factory(root.RiotApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TournamentV4TournamentCodeDTO model module.
   * @module model/TournamentV4TournamentCodeDTO
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */

  /**
   * Constructs a new <code>TournamentV4TournamentCodeDTO</code>.
   * @alias module:model/TournamentV4TournamentCodeDTO
   * @class
   */
  var exports = function() {
    var _this = this;














  };

  /**
   * Constructs a <code>TournamentV4TournamentCodeDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TournamentV4TournamentCodeDTO} obj Optional instance to populate.
   * @return {module:model/TournamentV4TournamentCodeDTO} The populated <code>TournamentV4TournamentCodeDTO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('map')) {
        obj['map'] = ApiClient.convertToType(data['map'], 'String');
      }
      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('spectators')) {
        obj['spectators'] = ApiClient.convertToType(data['spectators'], 'String');
      }
      if (data.hasOwnProperty('region')) {
        obj['region'] = ApiClient.convertToType(data['region'], 'String');
      }
      if (data.hasOwnProperty('providerId')) {
        obj['providerId'] = ApiClient.convertToType(data['providerId'], 'Number');
      }
      if (data.hasOwnProperty('teamSize')) {
        obj['teamSize'] = ApiClient.convertToType(data['teamSize'], 'Number');
      }
      if (data.hasOwnProperty('participants')) {
        obj['participants'] = ApiClient.convertToType(data['participants'], ['String']);
      }
      if (data.hasOwnProperty('pickType')) {
        obj['pickType'] = ApiClient.convertToType(data['pickType'], 'String');
      }
      if (data.hasOwnProperty('tournamentId')) {
        obj['tournamentId'] = ApiClient.convertToType(data['tournamentId'], 'Number');
      }
      if (data.hasOwnProperty('lobbyName')) {
        obj['lobbyName'] = ApiClient.convertToType(data['lobbyName'], 'String');
      }
      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('metaData')) {
        obj['metaData'] = ApiClient.convertToType(data['metaData'], 'String');
      }
    }
    return obj;
  }

  /**
   * The game map for the tournament code game
   * @member {String} map
   */
  exports.prototype['map'] = undefined;
  /**
   * The tournament code.
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * The spectator mode for the tournament code game.
   * @member {String} spectators
   */
  exports.prototype['spectators'] = undefined;
  /**
   * The tournament code's region.              (Legal values:  BR,  EUNE,  EUW,  JP,  LAN,  LAS,  NA,  OCE,  PBE,  RU,  TR)
   * @member {module:model/TournamentV4TournamentCodeDTO.RegionEnum} region
   */
  exports.prototype['region'] = undefined;
  /**
   * The provider's ID.
   * @member {Number} providerId
   */
  exports.prototype['providerId'] = undefined;
  /**
   * The team size for the tournament code game.
   * @member {Number} teamSize
   */
  exports.prototype['teamSize'] = undefined;
  /**
   * The summonerIds of the participants (Encrypted)
   * @member {Array.<String>} participants
   */
  exports.prototype['participants'] = undefined;
  /**
   * The pick mode for tournament code game.
   * @member {String} pickType
   */
  exports.prototype['pickType'] = undefined;
  /**
   * The tournament's ID.
   * @member {Number} tournamentId
   */
  exports.prototype['tournamentId'] = undefined;
  /**
   * The lobby name for the tournament code game.
   * @member {String} lobbyName
   */
  exports.prototype['lobbyName'] = undefined;
  /**
   * The password for the tournament code game.
   * @member {String} password
   */
  exports.prototype['password'] = undefined;
  /**
   * The tournament code's ID.
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * The metadata for tournament code.
   * @member {String} metaData
   */
  exports.prototype['metaData'] = undefined;


  /**
   * Allowed values for the <code>region</code> property.
   * @enum {String}
   * @readonly
   */
  exports.RegionEnum = {
    /**
     * value: "BR"
     * @const
     */
    "BR": "BR",
    /**
     * value: "EUNE"
     * @const
     */
    "EUNE": "EUNE",
    /**
     * value: "EUW"
     * @const
     */
    "EUW": "EUW",
    /**
     * value: "JP"
     * @const
     */
    "JP": "JP",
    /**
     * value: "LAN"
     * @const
     */
    "LAN": "LAN",
    /**
     * value: "LAS"
     * @const
     */
    "LAS": "LAS",
    /**
     * value: "NA"
     * @const
     */
    "NA": "NA",
    /**
     * value: "OCE"
     * @const
     */
    "OCE": "OCE",
    /**
     * value: "PBE"
     * @const
     */
    "PBE": "PBE",
    /**
     * value: "RU"
     * @const
     */
    "RU": "RU",
    /**
     * value: "TR"
     * @const
     */
    "TR": "TR"  };


  return exports;
}));

