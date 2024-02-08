package pageObjects;

import browserControl.WebConnector;

public class LoginPage extends WebConnector {
    /********** Locators ***********/

    private String usernameXpath = "//input[@placeholder='Username']";
    private String passwordXpath = "//input[@placeholder='Password']";
    private String loginXpath = "//input[@type='submit']";

    /********* Getters and Setters *********/
    /**
     * Set username field
     * @param userName
     */
    public void setUserName(String userName) {
        CorePage.findElementByXpath(10, usernameXpath).clear();
        CorePage.findElementByXpath(10, usernameXpath).sendKeys(userName);
    }
    /**
     * Set password field
     * @param passWord
     */
    public void setPassWord(String passWord) {
        CorePage.findElementByXpath(10, passwordXpath).clear();
        CorePage.findElementByXpath(10, passwordXpath).sendKeys(passWord);
    }
    /**
    * Click Login Button
    */
    public void clickloginbutton() {
    CorePage.findElementByXpath(10, loginXpath).click();
    }
}


