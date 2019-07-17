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
    root.RiotApi.SpectatorV4Perks = factory(root.RiotApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SpectatorV4Perks model module.
   * @module model/SpectatorV4Perks
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */

  /**
   * Constructs a new <code>SpectatorV4Perks</code>.
   * @alias module:model/SpectatorV4Perks
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>SpectatorV4Perks</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SpectatorV4Perks} obj Optional instance to populate.
   * @return {module:model/SpectatorV4Perks} The populated <code>SpectatorV4Perks</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('perkStyle')) {
        obj['perkStyle'] = ApiClient.convertToType(data['perkStyle'], 'Number');
      }
      if (data.hasOwnProperty('perkIds')) {
        obj['perkIds'] = ApiClient.convertToType(data['perkIds'], ['Number']);
      }
      if (data.hasOwnProperty('perkSubStyle')) {
        obj['perkSubStyle'] = ApiClient.convertToType(data['perkSubStyle'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Primary runes path
   * @member {Number} perkStyle
   */
  exports.prototype['perkStyle'] = undefined;
  /**
   * IDs of the perks/runes assigned.
   * @member {Array.<Number>} perkIds
   */
  exports.prototype['perkIds'] = undefined;
  /**
   * Secondary runes path
   * @member {Number} perkSubStyle
   */
  exports.prototype['perkSubStyle'] = undefined;



  return exports;
}));

