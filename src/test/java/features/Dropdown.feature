@RegressionTest1
Feature: Dropdown feature

  Background: Navigate to saucedemo webpage
    Given the user navigates to the webpage
    When the user types "standard_user" in the username field
    And the user types "secret_sauce" in the password field
    And the user clicks on the login button
    Then the user should see the "Products" text on the next page

  Scenario Outline: 1. Verify login and follow Dropdown option
    When the user select "<option>" option from the dropdown list
    Then the user should see "<option>" option is selected in the dropdown list
#
    Examples:
      | option              |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |
