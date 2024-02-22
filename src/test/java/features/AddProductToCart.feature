@RegressionTest2
Feature: Adding a Product to the basket to purchase feature

  Scenario: : Add a Product to the cart Feature
    Given the user navigates to "https://www.saucedemo.com"
    When the user login with "standard_user" username and "secret_sauce" password
    Then the user should see "Products" text on the page

    When the user select "Sauce Labs Backpack" product from the page
    And the user should see "Back to products" text on the page
    Then the user click on "Add to cart" button
    And the user should see "Remove" text on the page

    When the user select "Shopping Cart link" on the page
    And the user should see "Your Cart" text on the page

    
