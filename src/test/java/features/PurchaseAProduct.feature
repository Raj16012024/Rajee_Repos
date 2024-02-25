@RegressionTestPurchase
Feature:  Login and then purchase a product

  Background: Proceed to purchase a product from the cart Feature
    Given the user navigates to "https://www.saucedemo.com"
    When the user login with "standard_user" username and "secret_sauce" password
    Then the user should see "Products" text on the page

  Scenario Outline: Add the product to the Cart and proceed
    When the user click on the Add to cart button
    And the user select "Shopping Cart link" on the page
    Then the user proceeds to the checkout

    When the user enters "<FirstName>" first name, "<LastName>" last name and "<Zip/Postal code>" postcode
    And the user click on the "Finish" button
    Then the user should see "<Expected Text>" text on the page

    Examples:
      | FirstName | LastName | Zip/Postal code | Expected Text             |
      | R         | Raj      | CF11            | Thank you for your order! |
