package pageObjects;

import browserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends WebConnector {

        /********** Locators ***********/

        private String UsernameXpath = "//input[@placeholder='Username']";
        private String PasswordXpath = "//input[@placeholder='Password']";
        private String LoginXpath = "//input[@type='submit']";
        private String DropdownXpath = "//select[@class='product_sort_container']";
        private String SelectionXpath = "//*[@id=\"header_container\"]/div[2]/div/span/span";


    /********* Getters and Setters *********/

    /**
     * Set username field
     * @param user1
     */
    public void setUserName(String user1) {
        CorePage.findElementByXpath(10, UsernameXpath).clear();
        CorePage.findElementByXpath(10, UsernameXpath).sendKeys(user1);
    }
    /**
     * Set password field
     * @param password
     */
    public void setPassWord(String password) {
        CorePage.findElementByXpath(10, PasswordXpath).clear();
        CorePage.findElementByXpath(10, PasswordXpath).sendKeys(password);
    }
    /**
     * Click Login Button
     */
    public void clickloginbutton() {
        CorePage.findElementByXpath(10, LoginXpath).click();
    }

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
