package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AuthenticationPage;
//import utilities.ConstantUtils;

public class StepDefinitions extends WebConnector {
    private final AuthenticationPage AuthPage = new AuthenticationPage();
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String URL) {
        driver.get(URL);
    }

    @When("the user enter {string} in username field")
    public void the_user_enter_in_username_field(String userName) throws InterruptedException {
        AuthPage.setUserName(userName);
        Thread.sleep(2000);
    }
    @When("the user enter {string} in password field")
    public void the_user_enter_in_password_field(String passWord) {
        AuthPage.setPassWord(passWord);
    }
    @And("the user click on login button")
    public void the_user_click_on_login_button() throws InterruptedException {
        AuthPage.clickloginbutton();
        Thread.sleep(2000);
    }
    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }



















}

