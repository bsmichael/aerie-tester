@notification
Feature: notification
  Notification related tasks

  Background:
    Given A user with username test exists

  @verify @disabled
  Scenario Outline: Verify email user data
    Given I am an unauthenticated user
    And My username is <username>
    And I have received a confirmation email
    When I confirm receipt of the confirmation email
    Then The request should be successful
    And The <username> user should have their email address marked as verified

    Examples:
      | username |
      | test     |

  @verify @disabled
  Scenario: Verify email user data, no confirmation message received
    Given I am an unauthenticated user
    And I have not received a confirmation email
    When I confirm receipt of the confirmation email
    Then A invalid request exception should be thrown

