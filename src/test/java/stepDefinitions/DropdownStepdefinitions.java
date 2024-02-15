package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.DropdownPage;
import utilities.ConstantUtils;

public class DropdownStepdefinitions extends WebConnector {
    private DropdownPage DDPage = new DropdownPage();

    @When("the user should see {int} options in the sort dropdown")
    public void theUserShouldSeeOptionsInTheSortDropdown(int arg0) {
    }

    @And("the user select {string} option from the dropdown list")
    public void theUserSelectOptionFromTheDropdownList(String DDoption) throws InterruptedException {
        DDPage.selectOptionFromDropdown(DDoption);
        Thread.sleep(2000);
    }
    @Then("the user should see {string} option is selected in the dropdown list")
    public void theUserShouldSeeOptionIsSelectedInTheDropdownList(String SelectDDOption) throws InterruptedException {
        DDPage.checkSelectedOptions(SelectDDOption);
        Thread.sleep(2000);
    }
}
