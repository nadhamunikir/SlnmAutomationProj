Feature: Registration Test
  @smoketest
  Scenario: Registration Test
    Given user is on the buggycars page
    And click on Register button
    When enters registration details and clicks register
    Then user should be registered successfully
