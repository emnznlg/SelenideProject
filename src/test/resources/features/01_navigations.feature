@navigations
Feature: navigations

  Scenario: navigations test
    Given User navigates to "https://www.google.com"
    When User navigates to "https://www.amazon.com"
    And User waits for 5 seconds
    And User navigates back
    And User navigates forward
    And User refreshes the page
    And User holds the browser open