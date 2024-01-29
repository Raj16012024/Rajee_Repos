package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import utilities.ConstantUtils;

public class StepDefinitions extends WebConnector {
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String URL) {
        driver.get(URL);
    }

}

