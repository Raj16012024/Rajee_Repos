package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageObjects.PurchaseAProductPage;

import java.io.File;

public class PurchaseAProductStepDefinitions extends WebConnector {
    private PurchaseAProductPage Cart = new PurchaseAProductPage();

    @When("the user click on the Add to cart button")
    public void theUserClickOnTheAddToCartButton() {
        Cart.ClickCartButton();
    }
    @When("the user proceeds to the checkout")
    public void theUserProceedsToTheCheckout() {
        Cart.CheckoutButton();
    }
    @When("the user enters {string} first name, {string} last name and {string} postcode")
    public void theUserEntersFirstNameLastNameAndPostcode(String Firstname, String Lastname, String Postcode) throws InterruptedException {
        Cart.PersonalInfo(Firstname, Lastname, Postcode);
        Thread.sleep(1000);
    }
    @And("the user click on the {string} button")
    public void theUserClickOnTheButton(String f) throws InterruptedException {
        Cart.Finish();
        Thread.sleep(2000);
    }
    @After
    public void teardown(Scenario scenario) {

        if (scenario.isFailed()) {
            //Take a screenshot
            final byte[] Screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report
            scenario.attach(Screenshots, "image/png", scenario.getName().replace(" ", "_") + "_ErrorScreenshot");
        }
        closeBrowser();
    }
}
