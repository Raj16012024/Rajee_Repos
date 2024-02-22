package pageObjects;

import browserControl.WebConnector;
public class AddProductToCartPage extends WebConnector {

    private String ProductXpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div";
    private String AddToCartXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String ShoppingCartXpath = "//div[@id='shopping_cart_container']";

    /********* Getters and Setters *********/
    /**
     * Selecting the Product to add to cart
     */
    public void SelectandClick (String prod) {
        CorePage.findElementByXpath(10, ProductXpath).click();}
    /**
     * Add the Product to the cart
     */
    public void AddProduct (String Cart) {
        CorePage.findElementByXpath(10, AddToCartXpath).click();}
    /**
     * Select basket to see the cart
     */
    public void ShoppingCart (String basket) {
        CorePage.findElementByXpath(10, ShoppingCartXpath).click();}
}
