Feature: Login Feature

  Scenario: User enters Username and Password
    Given the login page is opened
    When user enters mercury as username
    And user enters mercury as password
    Then user will Find a flight
