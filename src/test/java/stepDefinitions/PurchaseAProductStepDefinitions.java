package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PurchaseAProductPage;
public class PurchaseAProductStepDefinitions extends WebConnector {
    private PurchaseAProductPage Cart = new PurchaseAProductPage();

    @When("the user click on the Add to cart button")
    public void theUserClickOnTheAddToCartButton() throws InterruptedException {
        Cart.ClickCartButton();
        Thread.sleep(1000);
    }
    @When("the user proceeds to the checkout")
    public void theUserProceedsToTheCheckout() throws InterruptedException {
        Cart.CheckoutButton();
        Thread.sleep(1000);
    }
    @When("the user enters {string} first name, {string} last name and {string} postcode")
    public void theUserEntersFirstNameLastNameAndPostcode(String Firstname, String Lastname, String Postcode) throws InterruptedException {
        Cart.PersonalInfo(Firstname, Lastname, Postcode);
        Thread.sleep(3000);
    }
    @And("the user click on the {string} button")
    public void theUserClickOnTheButton(String f) throws InterruptedException {
        Cart.Finish();
        Thread.sleep(1000);
    }
}
