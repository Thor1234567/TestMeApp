Feature: Book a fight Feature

  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters  as username
    And user enters mercury as password
    Then user will Find a flight

  Scenario: User books a flight
    Given the flight finder page is opened
    When user selects the trip type
    And user selects number of passengers
    And user departing from place
    And user arriving from place
    Then user will Find a flight
