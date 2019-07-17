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
    define(['ApiClient', 'model/LeagueV4LeagueItemDTO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LeagueV4LeagueItemDTO'));
  } else {
    // Browser globals (root is window)
    if (!root.RiotApi) {
      root.RiotApi = {};
    }
    root.RiotApi.LeagueV4LeagueListDTO = factory(root.RiotApi.ApiClient, root.RiotApi.LeagueV4LeagueItemDTO);
  }
}(this, function(ApiClient, LeagueV4LeagueItemDTO) {
  'use strict';




  /**
   * The LeagueV4LeagueListDTO model module.
   * @module model/LeagueV4LeagueListDTO
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */

  /**
   * Constructs a new <code>LeagueV4LeagueListDTO</code>.
   * @alias module:model/LeagueV4LeagueListDTO
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>LeagueV4LeagueListDTO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LeagueV4LeagueListDTO} obj Optional instance to populate.
   * @return {module:model/LeagueV4LeagueListDTO} The populated <code>LeagueV4LeagueListDTO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('leagueId')) {
        obj['leagueId'] = ApiClient.convertToType(data['leagueId'], 'String');
      }
      if (data.hasOwnProperty('tier')) {
        obj['tier'] = ApiClient.convertToType(data['tier'], 'String');
      }
      if (data.hasOwnProperty('entries')) {
        obj['entries'] = ApiClient.convertToType(data['entries'], [LeagueV4LeagueItemDTO]);
      }
      if (data.hasOwnProperty('queue')) {
        obj['queue'] = ApiClient.convertToType(data['queue'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} leagueId
   */
  exports.prototype['leagueId'] = undefined;
  /**
   * @member {String} tier
   */
  exports.prototype['tier'] = undefined;
  /**
   * @member {Array.<module:model/LeagueV4LeagueItemDTO>} entries
   */
  exports.prototype['entries'] = undefined;
  /**
   * @member {String} queue
   */
  exports.prototype['queue'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;



  return exports;
}));

