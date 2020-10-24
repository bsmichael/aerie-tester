@comment
Feature: comment
  Comment related tasks

  Background:
    Given A user with username test exists
    And A user with username other exists

  @create @disabled
  Scenario: Create a new comment
    Given I am an authenticated user
    And My username is test
    And I have been assigned the COMMENT_CREATOR role
    When I request to create a comment
    Then The request should be successful
    And A comment is created

  @create @disabled
  Scenario: Create a new comment, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request to create a comment
    Then A unauthorized request exception should be thrown

  @create @disabled
  Scenario: Create a new comment, unauthenticated
    Given I am an unauthenticated user
    When I request to create a comment
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a comment, unauthenticated
    Given I am an unauthenticated user
    When I request a comment
    Then A unauthorized request exception should be thrown

  @get @disabled
  Scenario: Get a comment
    Given I am an authenticated user
    And My username is test
    And A comment exists
    And I have been assigned the COMMENT_VIEWER role
    When I request a comment
    Then The request should be successful
    And I should receive the comment details

  @get @disabled
  Scenario: Get a comment I've created, no role assigned
    Given I am an authenticated user
    And My username is test
    And A comment I created exists
    When I request a comment
    Then The request should be successful
    And I should receive the comment details

  @getAll @disabled
  Scenario: Get all comments, unauthenticated
    Given I am an unauthenticated user
    When I request all comments
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all comments, no role assigned
    Given I am an authenticated user
    And My username is test
    And More than 1 comments exist
    When I request all comments
    Then A unauthorized request exception should be thrown

  @getAll @disabled
  Scenario: Get all comments
    Given I am an authenticated user
    And My username is test
    And I have been assigned the COMMENT_VIEWER role
    And More than 1 comments exist
    When I request all comments
    Then The request should be successful
    And I should receive a list of comments

  @getAllUser @disabled
  Scenario: Get all comments for a user, unauthenticated
    Given I am an unauthenticated user
    When I request all comments for user test
    Then A unauthorized request exception should be thrown

  @getAllUser @disabled
  Scenario: Get all comments for my user
    Given I am an authenticated user
    And My username is test
    And More than 1 comments exist
    When I request all comments for user test
    Then The request should be successful
    And I should receive a list of comments

  @getAllUser @disabled
  Scenario: Get all comments for another user
    Given I am an authenticated user
    And My username is test
    And I have been assigned the COMMENT_VIEWER role
    And More than 1 comments exist
    When I request all comments for user other
    Then The request should be successful
    And I should receive a list of comments

  @getAllUser @disabled
  Scenario: Get all comments for another user, no role assigned
    Given I am an authenticated user
    And My username is test
    When I request all comments for user other
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update a comment, unauthenticated
    Given I am an unauthenticated user
    When I request to update a comment
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update a comment
    Given I am an authenticated user
    And My username is test
    And I have been assigned the COMMENT_UPDATER role
    When I request to update a comment
    Then The request should be successful
    And The comment should be updated

  @update @disabled
  Scenario: Update a comment, no update role assigned
    Given I am an authenticated user
    And My username is test
    When I request to update a comment
    Then A unauthorized request exception should be thrown

  @update @disabled
  Scenario: Update my comment, no update role assigned
    Given I am an authenticated user
    And My username is test
    And A comment I created exists
    When I request to update a comment
    Then The request should be successful
    And The comment should be updated

  @update @disabled
  Scenario: Delete a comment, unauthenticated
    Given I am an unauthenticated user
    When I request to delete a comment
    Then A unauthorized request exception should be thrown

  @delete @disabled
  Scenario: Delete a comment
    Given I am an authenticated user
    And My username is test
    And I have been assigned the COMMENT_DELETER role
    When I request to delete a comment
    Then The comment should be deleted

  @delete @disabled
  Scenario: Delete my comment, no delete role assigned
    Given I am an authenticated user
    And My username is test
    And A comment I created exists
    When I request to delete a comment
    Then The comment should be deleted

  @delete @disabled
  Scenario: Delete other user's comment, no delete role assigned
    Given I am an authenticated user
    And My username is test
    When I request to delete a comment
    Then A unauthorized request exception should be thrown
