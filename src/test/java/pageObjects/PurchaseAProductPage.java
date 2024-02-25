package pageObjects;

import browserControl.WebConnector;

public class PurchaseAProductPage extends WebConnector {
    private String ClickCartXpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
    private String CheckoutXpath = "//button[@id='checkout']";
    private String FirstNameXpath = "//*[@id=\"first-name\"]";
    private String LastNameXpath = "//*[@id=\"last-name\"]";
    private String PostCodeXpath = "//*[@id=\"postal-code\"]";
    private String ContinueXpath = "//*[@id=\"continue\"]";
    private String FinishXpath = "//*[@id=\"finish\"]";


    public void ClickCartButton() {
        CorePage.findElementByXpath(10, ClickCartXpath).click();}

    public void CheckoutButton() {
        CorePage.findElementByXpath(10, CheckoutXpath).click();}

    public void PersonalInfo(String FN, String LN, String PC) {
        CorePage.findElementByXpath(10, FirstNameXpath).sendKeys(FN);
        CorePage.findElementByXpath(10, LastNameXpath).sendKeys(LN);
        CorePage.findElementByXpath(10, PostCodeXpath).sendKeys(PC);
        CorePage.findElementByXpath(10, ContinueXpath).click();
    }
     public void Finish() {
        CorePage.findElementByXpath(10, FinishXpath).click();
    }
}
