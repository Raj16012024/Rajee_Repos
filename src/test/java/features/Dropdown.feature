@RegressionTest1
Feature: Dropdown feature

  Background: Navigate to saucedemo webpage
    Given the user navigates to "https://www.saucedemo.com"
    When the user login with "standard_user" username and "secret_sauce" password

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
