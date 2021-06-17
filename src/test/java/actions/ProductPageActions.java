package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.HomePageObjects;
import pageobjects.ProductPageObjects;
import utils.Base;

public class ProductPageActions extends Base {
	
	ProductPageObjects productPageObjects = new ProductPageObjects(); 
	HomePageObjects homePageObjects = new HomePageObjects();
	
	public void addProductToCart(String product) {
		homePageObjects.clickOnProduct(product);
		Assert.assertTrue(isProductSelected(product));
		productPageObjects.addToCart().click();
		log.info("Add "+product+"to cart");
	}
	
	public boolean isProductSelected(String product) {
		boolean isDisplayed = false;
		String actualProduct = productPageObjects.productTitle().getText();
		if(product.equalsIgnoreCase(actualProduct))
			isDisplayed = true;
		return isDisplayed;
	}
	
	public void navigateToHomePage() {
		homePageObjects.home().click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(homePageObjects.categories()));
	}
	

}
