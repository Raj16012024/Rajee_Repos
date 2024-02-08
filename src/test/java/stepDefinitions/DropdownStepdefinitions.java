package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.DropdownPage;
import utilities.ConstantUtils;

public class DropdownStepdefinitions extends WebConnector {
    private DropdownPage DDPage = new DropdownPage();

    @Given("the user navigates to the webpage")
    public void theUserNavigatesToTheWebpage() {
        driver.get(ConstantUtils.BASE_URL);
    }
    @When("the user types {string} in the username field")
    public void theUserTypesInTheUsernameField(String user) {
        DDPage.setUserName(user);
    }
    @When("the user types {string} in the password field")
    public void the_user_types_in_the_password_field(String pass) {
       DDPage.setPassWord(pass);

    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        DDPage.clickloginbutton();
    }
    @Then("the user should see the {string} text on the next page")
    public void theUserShouldSeeTheTextOnTheNextPage(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }

    @When("the user select {string} option from the dropdown list")
    public void theUserSelectOptionFromTheDropdownList(String DDoption) throws InterruptedException {
        DDPage.selectOptionFromDropdown(DDoption);
        Thread.sleep(5000);

    }
    @Then("the user should see {string} option is selected in the dropdown list")
    public void theUserShouldSeeOptionIsSelectedInTheDropdownList(String SelectDDOption) throws InterruptedException {
        DDPage.checkSelectedOptions(SelectDDOption);
        Thread.sleep(5000);
    }
}
