@question
Feature: question
  Question related tasks

  Background:
    Given A user with username test exists

  @create @disabled
  Scenario: Create a new question
    Given I am an authenticated user
    And My username is test
    And I have been assigned the QUESTION_CREATOR role
    When I request to create a question
    Then The request should be successful
    And A question is created

  @create @disabled
  Scenario: Create a new question, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create a question
    Then A unauthorized request exception should be thrown

  @create
  Scenario: Create a new question, unauthenticated
    Given I am an unauthenticated user
    When I request to create a question
    Then A unauthorized request exception should be thrown

  @get
  Scenario: Get a question, unauthenticated
    Given I am an unauthenticated user
    When I request a question
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a question
    Given I am an authenticated user
    And My username is test
    And A question exists
    When I request a question
    Then The request should be successful
    And I should receive the question details

  @getAll
  Scenario: Get all questions, unauthenticated
    Given I am an unauthenticated user
    When I request all questions
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all questions
    Given I am an authenticated user
    And My username is test
    And More than 1 questions exist
    When I request all questions
    Then The request should be successful
    And I should receive a list of questions

  @update
  Scenario: Update a question, unauthenticated
    Given I am an unauthenticated user
    When I request to update a question
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update a question
    Given I am an authenticated user
    And My username is test
    And I have been assigned the QUESTION_UPDATER role
    When I request to update a question
    Then The request should be successful
    And The question should be updated

  @update @disabled
  Scenario: Update a question, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update a question
    Then A unauthorized request exception should be thrown

  @update
  Scenario: Delete a question, unauthenticated
    Given I am an unauthenticated user
    When I request to delete a question
    Then A unauthorized request exception should be thrown

  @delete @disabled
  Scenario: Delete a question
    Given I am an authenticated user
    And My username is test
    And I have been assigned the QUESTION_DELETER role
    When I request to delete a question
    Then The question should be deleted

  @answer @disabled
  Scenario: User answers a question, unauthenticated
    Given I am an unauthenticated user
    When I answer a question
    Then A unauthorized request exception should be thrown

  @answer @disabled
  Scenario: User answers a question
    Given I am an authenticated user
    And My username is test
    When I answer a question
    Then The request should be successful

  @skip @disabled
  Scenario: User skips a question, unauthenticated
    Given I am an unauthenticated user
    When I skip a question
    Then A unauthorized request exception should be thrown

  @skip @disabled
  Scenario: User skips a question
    Given I am an authenticated user
    And My username is test
    When I skip a question
    Then The request should be successful
