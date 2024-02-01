@RegressionTest
Feature: Test 1 feature


  Background: Navigate to saucedemo webpage
    Given the user navigates to "https://www.saucedemo.com"
#    Given the user navigates to "/search" - you can directly give the page you wish to go from base url

  @smoketest1
  Scenario: 1. Verify form authentication with valid credentials
    When the user enter "standard_user" in username field
    And the user enter "secret_sauce" in password field
    And the user click on login button
    Then the user should see "Products" text on the page

  @smoketest2
  Scenario: 2. Verify form authentication with locked out User credentials
    When the user enter "locked_out_user" in username field
    And the user enter "secret_sauce" in password field
    And the user click on login button
    Then the user should see "Epic sadface: Sorry, this user has been locked out." text on the page
