@locators
Feature: locators feature

  Scenario: TC01_locators
    Given User navigates to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    When User enters the username
    And User enters the password
    And User clicks the login button
    And User clicks the logout button