@weather
Feature: weather
  METAR, TAF, and Station information

  @metar
  Scenario Outline: Retrieve METAR information for a single station
    Given I am an unauthenticated user
    When I ask for the <icao> METAR
    Then The request should be successful

    Examples:
      | icao  |
      | KATL  |
      | KLZU  |
      | KFFC  |

  @metar
  Scenario Outline: Retrieve specific METAR information for a single station
    Given I am an unauthenticated user
    And I want <field> information
    When I ask for the <icao> METAR
    Then The request should be successful
    And I should receive the <field> data

    Examples:
      | icao  | field           |
      | KATL  | flight_category |
      | KLZU  | raw_text        |
      | KFFC  | observed        |

  @metar
  Scenario: Retrieve METAR information for a single station
    Given I am an unauthenticated user
    When I ask for the atlanta METAR
    Then The request should be successful
    And I should receive data for multiple stations

  @tafm @disabled
  Scenario Outline: Retrieve TAF information for a single station
    Given I am an unauthenticated user
    When I ask for the <icao> TAF
    Then The request should be successful

    Examples:
      | icao  |
      | KATL  |
      | KLZU  |
      | KFFC  |

  @station @disabled
  Scenario Outline: Retrieve Station information for a single station
    Given I am an unauthenticated user
    When I ask for the <icao> station
    Then The request should be successful

    Examples:
      | icao  |
      | KATL  |
      | KLZU  |
      | KFFC  |
