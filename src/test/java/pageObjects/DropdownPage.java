package pageObjects;

import browserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends WebConnector {

        private String DropdownXpath = "//select[@class='product_sort_container']";
        private String SelectionXpath = "//*[@id=\"header_container\"]/div[2]/div/span/span";


    /********* Getters and Setters *********/

    /**
     * Method to select the given option from the dropdown
     * @param option
     */
    public void selectOptionFromDropdown(String option) {
        WebElement dropdown = CorePage.findElementByXpath(10, DropdownXpath);
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }
    /**
     * Method to check the selected option is same as expected option
     * @param expectedOption
     */
    public void checkSelectedOptions(String expectedOption) {
        String actualOption = CorePage.findElementByXpath(10, SelectionXpath).getText();
        Assert.assertEquals(expectedOption, actualOption);
    }
}
