@role
Feature: role
  Role related tasks

  Background:
    Given A user with username test exists

  @assign @disabled
  Scenario Outline: Assign a role to a user, unauthenticated
    Given I am an unauthenticated user
    When I request to assign the role <role> to user <user>
    Then A unauthorized request exception should be thrown

    Examples:
    | role           | user |
    | PERSON_VIEWER  | test |
    | PERSON_UPDATER | test |
    | PERSON_DELETER | test |

  @assign @disabled
  Scenario Outline: Assign a role to a user
    Given I am an authenticated user
    And I have been assigned the ROLE_ASSIGNER role
    When I request to assign the role <role> to user <user>
    Then The request should be successful
    And The role <role> should be assigned to user <user>

    Examples:
      | role           | user |
      | PERSON_VIEWER  | test |
      | PERSON_UPDATER | test |
      | PERSON_DELETER | test |

  @assign @disabled
  Scenario Outline: Assign a role to a user, not assigned ROLE_ASSIGNER role
    Given I am an authenticated user
    When I request to assign the role <role> to user <user>
    Then A unauthorized request exception should be thrown

    Examples:
      | role           | user |
      | PERSON_VIEWER  | test |
      | PERSON_UPDATER | test |
      | PERSON_DELETER | test |

  @unassign @disabled
  Scenario Outline: Unassign a role from a user, unauthenticated
    Given I am an unauthenticated user
    When I request to unassign the role <role> from user <user>
    Then A unauthorized request exception should be thrown

    Examples:
      | role           | user |
      | PERSON_VIEWER  | test |
      | PERSON_UPDATER | test |
      | PERSON_DELETER | test |

  @unassign @disabled
  Scenario Outline: Unassign a role from a user
    Given I am an authenticated user
    And I have been assigned the ROLE_ASSIGNER role
    When I request to unassign the role <role> from user <user>
    Then The request should be successful
    And The role <role> should not be assigned to user <user>

    Examples:
      | role           | user |
      | PERSON_VIEWER  | test |
      | PERSON_UPDATER | test |
      | PERSON_DELETER | test |

  @unassign @disabled
  Scenario Outline: Unassign a role to a user, not assigned ROLE_ASSIGNER role
    Given I am an authenticated user
    When I request to unassign the role <role> from user <user>
    Then A unauthorized request exception should be thrown

    Examples:
      | role           | user |
      | PERSON_VIEWER  | test |
      | PERSON_UPDATER | test |
      | PERSON_DELETER | test |
