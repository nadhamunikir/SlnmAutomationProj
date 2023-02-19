Feature: Edit Profile Test
  Background:
    Given user logged into the website
      |userId| TestUser_AKL|
      |password| Pa$$word@123|
  @smoketest
  Scenario: Edit Profile Test
    And clicks on edit profile link
    And enters new profile details
    When cliks the save profile button
    Then new details must be saved successfully
    Then click logout