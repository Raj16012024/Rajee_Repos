package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddProductToCartPage;
public class AddProductToCartStepDefinitions extends WebConnector {
    private AddProductToCartPage Products = new AddProductToCartPage();
    @When("the user select {string} product from the page")
    public void the_user_select_product_from_the_page(String prod) throws InterruptedException {
            Products.SelectandClick(prod);
            Thread.sleep(2000);}
    @Then("the user click on {string} button")
    public void theUserClickOnButton(String Cart) throws InterruptedException {
        Products.AddProduct(Cart);
        Thread.sleep(2000);}
    @When("the user select {string} on the page")
    public void the_user_select_on_the_page(String Basket) throws InterruptedException {
        Products.ShoppingCart(Basket);
        Thread.sleep(2000);}






}
