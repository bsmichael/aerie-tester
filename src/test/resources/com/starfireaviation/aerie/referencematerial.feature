@referencematerial
Feature: reference material
  ReferenceMaterial related tasks

  Background:
    Given A user with username test exists

  @create @disabled
  Scenario: Create a new reference material
    Given I am an authenticated user
    And My username is test
    And I have been assigned the REFERENCEMATERIAL_CREATOR role
    When I request to create a reference material
    Then The request should be successful
    And A reference material is created

  @create @disabled
  Scenario: Create a new reference material, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create a reference material
    Then A unauthorized request exception should be thrown

  @create @disabled
  Scenario: Create a new reference material, unauthenticated
    Given I am an unauthenticated user
    When I request to create a reference material
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a reference material, unauthenticated
    Given I am an unauthenticated user
    When I request a reference material
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a reference material
    Given I am an authenticated user
    And My username is test
    And A reference material exists
    When I request a reference material
    Then The request should be successful
    And I should receive the reference material details

  @getAll @disabled
  Scenario: Get all reference materials, unauthenticated
    Given I am an unauthenticated user
    When I request all reference materials
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all reference materials, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request all reference materials
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all reference materials
    Given I am an authenticated user
    And My username is test
    And More than 1 reference materials exist
    When I request all reference materials
    Then The request should be successful
    And I should receive a list of reference materials

  @update @disabled
  Scenario: Update a reference material, unauthenticated
    Given I am an unauthenticated user
    When I request to update a reference material
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update a reference material
    Given I am an authenticated user
    And My username is test
    And I have been assigned the REFERENCEMATERIAL_UPDATER role
    When I request to update a reference material
    Then The request should be successful
    And The reference material should be updated

  @update @disabled
  Scenario: Update a reference material, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update a reference material
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Delete a reference material, unauthenticated
    Given I am an unauthenticated user
    When I request to delete a reference material
    Then A unauthorized request exception should be thrown

  @delete @disabled
  Scenario: Delete a reference material
    Given I am an authenticated user
    And My username is test
    And I have been assigned the REFERENCEMATERIAL_DELETER role
    When I request to delete a reference material
    Then The reference material should be deleted
