@person
Feature: person
  Person related tasks

  Background:
    Given A user with username test exists
    And A user with username other exists

  @create @disabled
  Scenario: Create a new user
    Given I am an unauthenticated user
    And I want my username to be new
    When I request to create a user
    Then The request should be successful
    And A user is created

  @create @disabled
  Scenario: Create a new user, username already taken
    Given I am an unauthenticated user
    And I want my username to be test
    When I request to create a user
    Then A conflict exception should be thrown

  @get
  Scenario: Get a user's information, unauthenticated
    Given I am an unauthenticated user
    When I request information for the test user
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get another user's information
    Given I am an authenticated user
    And My username is test
    And I have been assigned the PERSON_VIEWER role
    When I request information for the other user
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get my user's information
    Given I am an authenticated user
    And My username is test
    And I have been assigned the PERSON_VIEWER role
    When I request information for the test user
    Then The request should be successful
    And I should receive my user data

  @get @disabled
  Scenario: Get my user's information, no view role assigned
    Given I am an authenticated user
    And My username is test
    When I request information for the test user
    Then A unauthorized request exception should be thrown

  @update
  Scenario: Update a user's information, unauthenticated
    Given I am an unauthenticated user
    When I request to update the user information for test
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update my user's information
    Given I am an authenticated user
    And My username is test
    And I have been assigned the PERSON_UPDATER role
    When I request to update the user information for test
    Then The request should be successful
    And The user information for test should be updated

  @update @disabled
  Scenario: Update other user's information
    Given I am an authenticated user
    And My username is test
    And I have been assigned the PERSON_UPDATER role
    When I request to update the user information for other
    Then The request should be successful
    And The user information for other should be updated

  @update @disabled
  Scenario: Update other user's information, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update the user information for other
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update my user's information, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update the user information for test
    Then The request should be successful
    And The user information for test should be updated

  @update
  Scenario: Delete a user's information, unauthenticated
    Given I am an unauthenticated user
    When I request to delete the user information for test
    Then A unauthorized request exception should be thrown

  @delete @disabled
  Scenario: Delete my user's information
    Given I am an authenticated user
    And My username is test
    And I have been assigned the PERSON_DELETER role
    When I request to delete the user information for test
    Then The user information for test should be deleted

  @delete @disabled
  Scenario: Delete my user's information, no delete role assigned
    Given I am an authenticated user
    And My username is test
    When I request to delete the user information for test
    Then The user information for test should be deleted

  @delete @disabled
  Scenario: Delete other user's information
    Given I am an authenticated user
    And My username is test
    And I have been assigned the PERSON_DELETER role
    When I request to delete the user information for other
    Then The user information for other should be deleted

  @delete @disabled
  Scenario: Delete other user's information, no delete role assigned
    Given I am an authenticated user
    And My username is test
    When I request to delete the user information for other
    Then A unauthorized request exception should be thrown
