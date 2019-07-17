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
    instance = new RiotApi.LeagueV4Api();
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

  describe('LeagueV4Api', function() {
    describe('leagueV4GetChallengerLeague', function() {
      it('should call leagueV4GetChallengerLeague successfully', function(done) {
        //uncomment below and update the code to test leagueV4GetChallengerLeague
        //instance.leagueV4GetChallengerLeague(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leagueV4GetGrandmasterLeague', function() {
      it('should call leagueV4GetGrandmasterLeague successfully', function(done) {
        //uncomment below and update the code to test leagueV4GetGrandmasterLeague
        //instance.leagueV4GetGrandmasterLeague(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leagueV4GetLeagueById', function() {
      it('should call leagueV4GetLeagueById successfully', function(done) {
        //uncomment below and update the code to test leagueV4GetLeagueById
        //instance.leagueV4GetLeagueById(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leagueV4GetLeagueEntries', function() {
      it('should call leagueV4GetLeagueEntries successfully', function(done) {
        //uncomment below and update the code to test leagueV4GetLeagueEntries
        //instance.leagueV4GetLeagueEntries(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leagueV4GetLeagueEntriesForSummoner', function() {
      it('should call leagueV4GetLeagueEntriesForSummoner successfully', function(done) {
        //uncomment below and update the code to test leagueV4GetLeagueEntriesForSummoner
        //instance.leagueV4GetLeagueEntriesForSummoner(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leagueV4GetMasterLeague', function() {
      it('should call leagueV4GetMasterLeague successfully', function(done) {
        //uncomment below and update the code to test leagueV4GetMasterLeague
        //instance.leagueV4GetMasterLeague(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));