Feature: Login Test
  @smoketest
  Scenario: Login Test
    Given user is on the buggycars page
    When enters login credentials as an existing user
          |userId| TestUser_AKL|
          |password| Pa$$word@123|
    Then user should be logged in successfully
    Then click logout