@RegressionTest3
Feature: Login using Problem User and add product to the cart

  Background: Navigate to saucedemo webpage
    Given the user navigates to "https://www.saucedemo.com"

  Scenario Outline: 1. Verify Problem user login credentials with data driven

    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expectedText>" text on the page

    Examples:
      | username     | password      | expectedText                                                              |
      | problem_user | secret_sauce  | Products                                                                  |
      | problem_user | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
      | problemuser  | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
      | problemuser  | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |


