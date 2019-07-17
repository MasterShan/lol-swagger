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
    root.RiotApi.TournamentV4TournamentRegistrationParameters = factory(root.RiotApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TournamentV4TournamentRegistrationParameters model module.
   * @module model/TournamentV4TournamentRegistrationParameters
   * @version dfa1c0f97b9cc62a43c9fb91daa1b91b3e9485c2
   */

  /**
   * Constructs a new <code>TournamentV4TournamentRegistrationParameters</code>.
   * @alias module:model/TournamentV4TournamentRegistrationParameters
   * @class
   * @param providerId {Number} The provider ID to specify the regional registered provider data to associate this tournament.
   */
  var exports = function(providerId) {
    var _this = this;

    _this['providerId'] = providerId;

  };

  /**
   * Constructs a <code>TournamentV4TournamentRegistrationParameters</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TournamentV4TournamentRegistrationParameters} obj Optional instance to populate.
   * @return {module:model/TournamentV4TournamentRegistrationParameters} The populated <code>TournamentV4TournamentRegistrationParameters</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('providerId')) {
        obj['providerId'] = ApiClient.convertToType(data['providerId'], 'Number');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
    }
    return obj;
  }

  /**
   * The provider ID to specify the regional registered provider data to associate this tournament.
   * @member {Number} providerId
   */
  exports.prototype['providerId'] = undefined;
  /**
   * The optional name of the tournament.
   * @member {String} name
   */
  exports.prototype['name'] = undefined;



  return exports;
}));

