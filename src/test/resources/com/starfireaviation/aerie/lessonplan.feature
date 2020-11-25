@lesson
Feature: lessonplan
  LessonPlan related tasks

  Background:
    Given A user with username test exists

  @create @disabled
  Scenario: Create a new lessonplan
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSONPLAN_CREATOR role
    When I request to create a lessonplan
    Then The request should be successful
    And A lessonplan is created

  @create @disabled
  Scenario: Create a new lessonplan, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create a lessonplan
    Then A unauthorized request exception should be thrown

  @create
  Scenario: Create a new lessonplan, unauthenticated
    Given I am an unauthenticated user
    When I request to create a lessonplan
    Then A unauthorized request exception should be thrown

  @get
  Scenario: Get a lessonplan, unauthenticated
    Given I am an unauthenticated user
    When I request a lessonplan
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a lessonplan
    Given I am an authenticated user
    And My username is test
    And A lessonplan exists
    And I have been assigned the LESSONPLAN_VIEWER role
    When I request a lessonplan
    Then The request should be successful
    And I should receive the lessonplan details

  @getAll
  Scenario: Get all lessonplans, unauthenticated
    Given I am an unauthenticated user
    When I request all lessonplans
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all lessonplans, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request all lessonplans
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all lessonplans
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSONPLAN_VIEWER role
    And More than 1 lessonplans exist
    When I request all lessonplans
    Then The request should be successful
    And I should receive a list of lessonplans

  @update
  Scenario: Update a lessonplan, unauthenticated
    Given I am an unauthenticated user
    When I request to update a lessonplan
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update a lessonplan
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSONPLAN_UPDATER role
    When I request to update a lessonplan
    Then The request should be successful
    And The lessonplan should be updated

  @update @disabled
  Scenario: Update a lessonplan, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update a lessonplan
    Then A unauthorized request exception should be thrown

  @update
  Scenario: Delete a lessonplan, unauthenticated
    Given I am an unauthenticated user
    When I request to delete a lessonplan
    Then A unauthorized request exception should be thrown

  @delete @disabled
  Scenario: Delete a lessonplan
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSONPLAN_DELETER role
    When I request to delete a lessonplan
    Then The lessonplan should be deleted
