#@RegressionTest
Feature: Test 1 feature

  Background: Navigate to saucedemo webpage
    Given the user navigates to "https://www.saucedemo.com"
#    Given the user navigates to "/search" - you can directly give the page you wish to go from base url

#  @smoketest3
  Scenario Outline: 1. Verify login credentials with data driven

    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expectedText>" text on the page

    Examples:
      | username      | password      | expectedText                                                              |
      | standard_user | secret_sauce  | Products                                                                  |
      | standard_user | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
      | standarduser  | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
      | standarduser  | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |

#  @smoketest4
  Scenario Outline: 2. Verify login credentials with data driven

    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expectedText>" text on the page

    Examples:
      | username        | password      | expectedText                                                              |
      | locked_out_user | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                       |
      | locked_out_user | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
      | locked_outuser  | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
      | locked_outuser  | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |