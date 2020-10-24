@quiz
Feature: quiz
  Quiz related tasks

  Background:
    Given A user with username test exists

  @create @disabled
  Scenario: Create a new quiz
    Given I am an authenticated user
    And My username is test
    And I have been assigned the QUIZ_CREATOR role
    When I request to create a quiz
    Then The request should be successful
    And A quiz is created

  @create @disabled
  Scenario: Create a new quiz, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create a quiz
    Then A unauthorized request exception should be thrown

  @create @disabled
  Scenario: Create a new quiz, unauthenticated
    Given I am an unauthenticated user
    When I request to create a quiz
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a quiz, unauthenticated
    Given I am an unauthenticated user
    When I request a quiz
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a quiz
    Given I am an authenticated user
    And My username is test
    And A quiz exists
    When I request a quiz
    Then The request should be successful
    And I should receive the quiz details

  @getAll @disabled
  Scenario: Get all quizzes, unauthenticated
    Given I am an unauthenticated user
    When I request all quizzes
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all quizzes
    Given I am an authenticated user
    And My username is test
    And More than 1 quizzes exist
    When I request all quizzes
    Then The request should be successful
    And I should receive a list of quizzes

  @update @disabled
  Scenario: Update a quiz, unauthenticated
    Given I am an unauthenticated user
    When I request to update a quiz
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update a quiz
    Given I am an authenticated user
    And My username is test
    And I have been assigned the QUIZ_UPDATER role
    When I request to update a quiz
    Then The request should be successful
    And The quiz should be updated

  @update @disabled
  Scenario: Update a quiz, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update a quiz
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Delete a quiz, unauthenticated
    Given I am an unauthenticated user
    When I request to delete a quiz
    Then A unauthorized request exception should be thrown

  @delete @disabled
  Scenario: Delete a quiz
    Given I am an authenticated user
    And My username is test
    And I have been assigned the QUIZ_DELETER role
    When I request to delete a quiz
    Then The quiz should be deleted

  @start @disabled
  Scenario: User starts a quiz, unauthenticated
    Given I am an unauthenticated user
    When I start a quiz
    Then A unauthorized request exception should be thrown

  @start @disabled
  Scenario: User starts a quiz
    Given I am an authenticated user
    And My username is test
    When I start a quiz
    Then The request should be successful

  @complete @disabled
  Scenario: User stops a quiz, unauthenticated
    Given I am an unauthenticated user
    When I stop a quiz
    Then A unauthorized request exception should be thrown

  @complete @disabled
  Scenario: User stops a quiz
    Given I am an authenticated user
    And My username is test
    When I stop a quiz
    Then The request should be successful

  @addQuestion @disabled
  Scenario: User adds a question to a quiz, unauthenticated
    Given I am an unauthenticated user
    When I add a question to a quiz
    Then A unauthorized request exception should be thrown

  @addQuestion @disabled
  Scenario: User add a question to a quiz
    Given I am an authenticated user
    And My username is test
    When I add a question to a quiz
    Then The request should be successful

  @removeQuestion @disabled
  Scenario: User removes a question from a quiz, unauthenticated
    Given I am an unauthenticated user
    When I remove a question from a quiz
    Then A unauthorized request exception should be thrown

  @removeQuestion @disabled
  Scenario: User removes a question from a quiz
    Given I am an authenticated user
    And My username is test
    When I remove a question from a quiz
    Then The request should be successful
