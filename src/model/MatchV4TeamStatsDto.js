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
    define(['ApiClient', 'model/MatchV4TeamBansDto'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MatchV4TeamBansDto'));
  } else {
    // Browser globals (root is window)
    if (!root.RiotApi) {
      root.RiotApi = {};
    }
    root.RiotApi.MatchV4TeamStatsDto = factory(root.RiotApi.ApiClient, root.RiotApi.MatchV4TeamBansDto);
  }
}(this, function(ApiClient, MatchV4TeamBansDto) {
  'use strict';




  /**
   * The MatchV4TeamStatsDto model module.
   * @module model/MatchV4TeamStatsDto
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */

  /**
   * Constructs a new <code>MatchV4TeamStatsDto</code>.
   * @alias module:model/MatchV4TeamStatsDto
   * @class
   */
  var exports = function() {
    var _this = this;

















  };

  /**
   * Constructs a <code>MatchV4TeamStatsDto</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MatchV4TeamStatsDto} obj Optional instance to populate.
   * @return {module:model/MatchV4TeamStatsDto} The populated <code>MatchV4TeamStatsDto</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('firstDragon')) {
        obj['firstDragon'] = ApiClient.convertToType(data['firstDragon'], 'Boolean');
      }
      if (data.hasOwnProperty('firstInhibitor')) {
        obj['firstInhibitor'] = ApiClient.convertToType(data['firstInhibitor'], 'Boolean');
      }
      if (data.hasOwnProperty('bans')) {
        obj['bans'] = ApiClient.convertToType(data['bans'], [MatchV4TeamBansDto]);
      }
      if (data.hasOwnProperty('baronKills')) {
        obj['baronKills'] = ApiClient.convertToType(data['baronKills'], 'Number');
      }
      if (data.hasOwnProperty('firstRiftHerald')) {
        obj['firstRiftHerald'] = ApiClient.convertToType(data['firstRiftHerald'], 'Boolean');
      }
      if (data.hasOwnProperty('firstBaron')) {
        obj['firstBaron'] = ApiClient.convertToType(data['firstBaron'], 'Boolean');
      }
      if (data.hasOwnProperty('riftHeraldKills')) {
        obj['riftHeraldKills'] = ApiClient.convertToType(data['riftHeraldKills'], 'Number');
      }
      if (data.hasOwnProperty('firstBlood')) {
        obj['firstBlood'] = ApiClient.convertToType(data['firstBlood'], 'Boolean');
      }
      if (data.hasOwnProperty('teamId')) {
        obj['teamId'] = ApiClient.convertToType(data['teamId'], 'Number');
      }
      if (data.hasOwnProperty('firstTower')) {
        obj['firstTower'] = ApiClient.convertToType(data['firstTower'], 'Boolean');
      }
      if (data.hasOwnProperty('vilemawKills')) {
        obj['vilemawKills'] = ApiClient.convertToType(data['vilemawKills'], 'Number');
      }
      if (data.hasOwnProperty('inhibitorKills')) {
        obj['inhibitorKills'] = ApiClient.convertToType(data['inhibitorKills'], 'Number');
      }
      if (data.hasOwnProperty('towerKills')) {
        obj['towerKills'] = ApiClient.convertToType(data['towerKills'], 'Number');
      }
      if (data.hasOwnProperty('dominionVictoryScore')) {
        obj['dominionVictoryScore'] = ApiClient.convertToType(data['dominionVictoryScore'], 'Number');
      }
      if (data.hasOwnProperty('win')) {
        obj['win'] = ApiClient.convertToType(data['win'], 'String');
      }
      if (data.hasOwnProperty('dragonKills')) {
        obj['dragonKills'] = ApiClient.convertToType(data['dragonKills'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Flag indicating whether or not the team scored the first Dragon kill.
   * @member {Boolean} firstDragon
   */
  exports.prototype['firstDragon'] = undefined;
  /**
   * Flag indicating whether or not the team destroyed the first inhibitor.
   * @member {Boolean} firstInhibitor
   */
  exports.prototype['firstInhibitor'] = undefined;
  /**
   * If match queueId has a draft, contains banned champion data, otherwise empty.
   * @member {Array.<module:model/MatchV4TeamBansDto>} bans
   */
  exports.prototype['bans'] = undefined;
  /**
   * Number of times the team killed Baron.
   * @member {Number} baronKills
   */
  exports.prototype['baronKills'] = undefined;
  /**
   * Flag indicating whether or not the team scored the first Rift Herald kill.
   * @member {Boolean} firstRiftHerald
   */
  exports.prototype['firstRiftHerald'] = undefined;
  /**
   * Flag indicating whether or not the team scored the first Baron kill.
   * @member {Boolean} firstBaron
   */
  exports.prototype['firstBaron'] = undefined;
  /**
   * Number of times the team killed Rift Herald.
   * @member {Number} riftHeraldKills
   */
  exports.prototype['riftHeraldKills'] = undefined;
  /**
   * Flag indicating whether or not the team scored the first blood.
   * @member {Boolean} firstBlood
   */
  exports.prototype['firstBlood'] = undefined;
  /**
   * 100 for blue side. 200 for red side.
   * @member {Number} teamId
   */
  exports.prototype['teamId'] = undefined;
  /**
   * Flag indicating whether or not the team destroyed the first tower.
   * @member {Boolean} firstTower
   */
  exports.prototype['firstTower'] = undefined;
  /**
   * Number of times the team killed Vilemaw.
   * @member {Number} vilemawKills
   */
  exports.prototype['vilemawKills'] = undefined;
  /**
   * Number of inhibitors the team destroyed.
   * @member {Number} inhibitorKills
   */
  exports.prototype['inhibitorKills'] = undefined;
  /**
   * Number of towers the team destroyed.
   * @member {Number} towerKills
   */
  exports.prototype['towerKills'] = undefined;
  /**
   * For Dominion matches, specifies the points the team had at game end.
   * @member {Number} dominionVictoryScore
   */
  exports.prototype['dominionVictoryScore'] = undefined;
  /**
   * String indicating whether or not the team won. There are only two values visibile in public match history.              (Legal values:  Fail,  Win)
   * @member {module:model/MatchV4TeamStatsDto.WinEnum} win
   */
  exports.prototype['win'] = undefined;
  /**
   * Number of times the team killed Dragon.
   * @member {Number} dragonKills
   */
  exports.prototype['dragonKills'] = undefined;


  /**
   * Allowed values for the <code>win</code> property.
   * @enum {String}
   * @readonly
   */
  exports.WinEnum = {
    /**
     * value: "Fail"
     * @const
     */
    "Fail": "Fail",
    /**
     * value: "Win"
     * @const
     */
    "Win": "Win"  };


  return exports;
}));


