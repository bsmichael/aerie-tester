@lesson
Feature: lesson
  Lesson related tasks

  Background:
    Given A user with username test exists

  @create @disabled
  Scenario: Create a new lesson
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSON_CREATOR role
    When I request to create a lesson
    Then The request should be successful
    And A lesson is created

  @create @disabled
  Scenario: Create a new lesson, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create a lesson
    Then A unauthorized request exception should be thrown

  @create
  Scenario: Create a new lesson, unauthenticated
    Given I am an unauthenticated user
    When I request to create a lesson
    Then A forbidden exception should be thrown

  @get @disabled
  Scenario: Get a lesson, unauthenticated
    Given I am an unauthenticated user
    When I request a lesson
    Then A unauthorized exception should be thrown

  @get @disabled
  Scenario: Get a lesson
    Given I am an authenticated user
    And My username is test
    And A lesson exists
    And I have been assigned the LESSON_VIEWER role
    When I request a lesson
    Then The request should be successful
    And I should receive the lesson details

  @getAll @disabled
  Scenario: Get all lessons, unauthenticated
    Given I am an unauthenticated user
    When I request all lessons
    Then A unauthorized exception should be thrown

  @getAll @disabled
  Scenario: Get all lessons, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request all lessons
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all lessons
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSON_VIEWER role
    And More than 1 lessons exist
    When I request all lessons
    Then The request should be successful
    And I should receive a list of lessons

  @update
  Scenario: Update a lesson, unauthenticated
    Given I am an unauthenticated user
    When I request to update a lesson
    Then A forbidden exception should be thrown

  @update @disabled
  Scenario: Update a lesson
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSON_UPDATER role
    When I request to update a lesson
    Then The request should be successful
    And The lesson should be updated

  @update @disabled
  Scenario: Update a lesson, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update a lesson
    Then A unauthorized request exception should be thrown

  @delete
  Scenario: Delete a lesson, unauthenticated
    Given I am an unauthenticated user
    When I request to delete a lesson
    Then A forbidden exception should be thrown

  @delete @disabled
  Scenario: Delete a lesson
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSON_DELETER role
    When I request to delete a lesson
    Then The lesson should be deleted

  @getAllUser @disabled
  Scenario: Get all attended lessons for a user, unauthenticated
    Given I am an unauthenticated user
    When I request all attended lessons for user test
    Then A unauthorized request exception should be thrown

  @getAllUser @disabled
  Scenario: Get all attended lessons for my user
    Given I am an authenticated user
    And My username is test
    And More than 1 lessons exist
    When I request all attended lessons for user test
    Then The request should be successful
    And I should receive a list of comments

  @getAllUser @disabled
  Scenario: Get all attended lessons for another user
    Given I am an authenticated user
    And My username is test
    And I have been assigned the LESSON_VIEWER role
    And More than 1 lessons exist
    When I request all attended lessons for user other
    Then The request should be successful
    And I should receive a list of comments

  @getAllUser @disabled
  Scenario: Get all attended lessons for another user, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request all attended lessons for user other
    Then A unauthorized request exception should be thrown
