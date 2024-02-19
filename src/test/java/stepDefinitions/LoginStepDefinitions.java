package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;


public class LoginStepDefinitions extends WebConnector {
    private LoginPage AuthPage = new LoginPage();

    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String URL) {
        driver.get(URL);
    }


    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String userName, String passWord) throws InterruptedException {
        AuthPage.setUserName(userName);
        AuthPage.setPassWord(passWord);
        AuthPage.clickloginbutton();
        Thread.sleep(2000);
    }

    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }


}

