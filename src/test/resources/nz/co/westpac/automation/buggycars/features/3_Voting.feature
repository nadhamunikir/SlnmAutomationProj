Feature: Voting Test
  @smoketest
  Scenario: Voting Test
    Given user is on the buggycars page
    When signup and login wih credentials
    Then user should be logged in successfully
    When enters comment and clicks on vote
    Then the vote should be submitted successfully
    Then click logout