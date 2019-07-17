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
    define(['ApiClient', 'model/LeagueV4MiniSeriesDTO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LeagueV4MiniSeriesDTO'));
  } else {
    // Browser globals (root is window)
    if (!root.RiotApi) {
      root.RiotApi = {};
    }
    root.RiotApi.LeagueV4LeagueEntryDTO = factory(root.RiotApi.ApiClient, root.RiotApi.LeagueV4MiniSeriesDTO);
  }
}(this, function(ApiClient, LeagueV4MiniSeriesDTO) {
  'use strict';




  /**
   * The LeagueV4LeagueEntryDTO model module.
   * @module model/LeagueV4LeagueEntryDTO
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */

  /**
   * Constructs a new <code>LeagueV4LeagueEntryDTO</code>.
   * @alias module:model/LeagueV4LeagueEntryDTO
   * @class
   */
  var exports = function() {
    var _this = this;















  };

  /**
   * Constructs a <code>LeagueV4LeagueEntryDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LeagueV4LeagueEntryDTO} obj Optional instance to populate.
   * @return {module:model/LeagueV4LeagueEntryDTO} The populated <code>LeagueV4LeagueEntryDTO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('queueType')) {
        obj['queueType'] = ApiClient.convertToType(data['queueType'], 'String');
      }
      if (data.hasOwnProperty('summonerName')) {
        obj['summonerName'] = ApiClient.convertToType(data['summonerName'], 'String');
      }
      if (data.hasOwnProperty('hotStreak')) {
        obj['hotStreak'] = ApiClient.convertToType(data['hotStreak'], 'Boolean');
      }
      if (data.hasOwnProperty('miniSeries')) {
        obj['miniSeries'] = LeagueV4MiniSeriesDTO.constructFromObject(data['miniSeries']);
      }
      if (data.hasOwnProperty('wins')) {
        obj['wins'] = ApiClient.convertToType(data['wins'], 'Number');
      }
      if (data.hasOwnProperty('veteran')) {
        obj['veteran'] = ApiClient.convertToType(data['veteran'], 'Boolean');
      }
      if (data.hasOwnProperty('losses')) {
        obj['losses'] = ApiClient.convertToType(data['losses'], 'Number');
      }
      if (data.hasOwnProperty('rank')) {
        obj['rank'] = ApiClient.convertToType(data['rank'], 'String');
      }
      if (data.hasOwnProperty('leagueId')) {
        obj['leagueId'] = ApiClient.convertToType(data['leagueId'], 'String');
      }
      if (data.hasOwnProperty('inactive')) {
        obj['inactive'] = ApiClient.convertToType(data['inactive'], 'Boolean');
      }
      if (data.hasOwnProperty('freshBlood')) {
        obj['freshBlood'] = ApiClient.convertToType(data['freshBlood'], 'Boolean');
      }
      if (data.hasOwnProperty('tier')) {
        obj['tier'] = ApiClient.convertToType(data['tier'], 'String');
      }
      if (data.hasOwnProperty('summonerId')) {
        obj['summonerId'] = ApiClient.convertToType(data['summonerId'], 'String');
      }
      if (data.hasOwnProperty('leaguePoints')) {
        obj['leaguePoints'] = ApiClient.convertToType(data['leaguePoints'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {String} queueType
   */
  exports.prototype['queueType'] = undefined;
  /**
   * @member {String} summonerName
   */
  exports.prototype['summonerName'] = undefined;
  /**
   * @member {Boolean} hotStreak
   */
  exports.prototype['hotStreak'] = undefined;
  /**
   * @member {module:model/LeagueV4MiniSeriesDTO} miniSeries
   */
  exports.prototype['miniSeries'] = undefined;
  /**
   * @member {Number} wins
   */
  exports.prototype['wins'] = undefined;
  /**
   * @member {Boolean} veteran
   */
  exports.prototype['veteran'] = undefined;
  /**
   * @member {Number} losses
   */
  exports.prototype['losses'] = undefined;
  /**
   * @member {String} rank
   */
  exports.prototype['rank'] = undefined;
  /**
   * @member {String} leagueId
   */
  exports.prototype['leagueId'] = undefined;
  /**
   * @member {Boolean} inactive
   */
  exports.prototype['inactive'] = undefined;
  /**
   * @member {Boolean} freshBlood
   */
  exports.prototype['freshBlood'] = undefined;
  /**
   * @member {String} tier
   */
  exports.prototype['tier'] = undefined;
  /**
   * Player's summonerId (Encrypted)
   * @member {String} summonerId
   */
  exports.prototype['summonerId'] = undefined;
  /**
   * @member {Number} leaguePoints
   */
  exports.prototype['leaguePoints'] = undefined;



  return exports;
}));

