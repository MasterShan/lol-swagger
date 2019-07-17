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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.RiotApi);
  }
}(this, function(expect, RiotApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new RiotApi.SpectatorV4CurrentGameInfo();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('SpectatorV4CurrentGameInfo', function() {
    it('should create an instance of SpectatorV4CurrentGameInfo', function() {
      // uncomment below and update the code to test SpectatorV4CurrentGameInfo
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be.a(RiotApi.SpectatorV4CurrentGameInfo);
    });

    it('should have the property gameId (base name: "gameId")', function() {
      // uncomment below and update the code to test the property gameId
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property gameStartTime (base name: "gameStartTime")', function() {
      // uncomment below and update the code to test the property gameStartTime
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property platformId (base name: "platformId")', function() {
      // uncomment below and update the code to test the property platformId
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property gameMode (base name: "gameMode")', function() {
      // uncomment below and update the code to test the property gameMode
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property mapId (base name: "mapId")', function() {
      // uncomment below and update the code to test the property mapId
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property gameType (base name: "gameType")', function() {
      // uncomment below and update the code to test the property gameType
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property bannedChampions (base name: "bannedChampions")', function() {
      // uncomment below and update the code to test the property bannedChampions
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property observers (base name: "observers")', function() {
      // uncomment below and update the code to test the property observers
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property participants (base name: "participants")', function() {
      // uncomment below and update the code to test the property participants
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property gameLength (base name: "gameLength")', function() {
      // uncomment below and update the code to test the property gameLength
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

    it('should have the property gameQueueConfigId (base name: "gameQueueConfigId")', function() {
      // uncomment below and update the code to test the property gameQueueConfigId
      //var instance = new RiotApi.SpectatorV4CurrentGameInfo();
      //expect(instance).to.be();
    });

  });

}));
