Feature: Sorting Overall Ratings Test
  Background:
    Given user logged into the website
      |userId| TestUser_AKL|
      |password| Pa$$word@123|
  @smoketest
  Scenario: Sorting Overall Ratings Test
    And clicks on overall rating link
    And clicks on sort make link
    Then make must be sorted successfully
    And clicks on sort voting link
    Then votes must be sorted successfully
    Then quit browser