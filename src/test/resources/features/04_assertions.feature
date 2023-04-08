@assertions_2
Feature: assertion feature 2

  Scenario: TC01_assertion_2
    Given User navigates to "https://www.google.com"
    When User searches for "Tesla"
    Then User verifies that the page source contains "Tesla"
    Then User verifies that the result contains the "About" keyword

