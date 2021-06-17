package stepdefinitions;

import actions.ProductPageActions;
import io.cucumber.java.en.When;
import pageobjects.HomePageObjects;
import utils.Base;

public class ProductPageSteps extends Base{
	
	ProductPageActions productPageActions = new ProductPageActions();
	
	@When("User adds the product {string} to cart")
	public void user_adds_the_product_to_cart(String product) {
		productPageActions.addProductToCart(product);
	}

	@When("User accepts the confirmation popup")
	public void user_accepts_the_confirmation_popup() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		productPageActions.navigateToHomePage();
	}
}
