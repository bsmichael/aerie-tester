@event
Feature: event
  Event related tasks

  Background:
    Given A user with username test exists

  @create @disabled
  Scenario: Create a new event
    Given I am an authenticated user
    And My username is test
    And I have been assigned the EVENT_CREATOR role
    When I request to create an event
    Then The request should be successful
    And An event is created

  @create @disabled
  Scenario: Create a new event, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create an event
    Then A unauthorized request exception should be thrown

  @create
  Scenario: Create a new event, unauthenticated
    Given I am an unauthenticated user
    When I request to create an event
    Then A forbidden exception should be thrown

  @get
  Scenario: Get an event, unauthenticated
    Given I am an unauthenticated user
    When I request an event
    Then A unauthorized exception should be thrown

  @get @disabled
  Scenario: Get an event
    Given I am an authenticated user
    And My username is test
    And An event exists
    And I have been assigned the EVENT_VIEWER role
    When I request an event
    Then The request should be successful
    And I should receive the event details

  @getAll
  Scenario: Get all events, unauthenticated
    Given I am an unauthenticated user
    When I request all events
    Then A unauthorized exception should be thrown

  @getAll @disabled
  Scenario: Get all events, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request all events
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all events
    Given I am an authenticated user
    And My username is test
    And I have been assigned the EVENT_VIEWER role
    And More than 1 events exist
    When I request all events
    Then The request should be successful
    And I should receive a list of events

  @update
  Scenario: Update an event, unauthenticated
    Given I am an unauthenticated user
    When I request to update an event
    Then A forbidden exception should be thrown

  @update @disabled
  Scenario: Update an event
    Given I am an authenticated user
    And My username is test
    And I have been assigned the EVENT_UPDATER role
    When I request to update an event
    Then The request should be successful
    And The event should be updated

  @update @disabled
  Scenario: Update an event, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update an event
    Then A unauthorized request exception should be thrown

  @delete
  Scenario: Delete an event, unauthenticated
    Given I am an unauthenticated user
    When I request to delete an event
    Then A forbidden exception should be thrown

  @delete @disabled
  Scenario: Delete an event
    Given I am an authenticated user
    And My username is test
    And I have been assigned the EVENT_DELETER role
    When I request to delete an event
    Then The event should be deleted
