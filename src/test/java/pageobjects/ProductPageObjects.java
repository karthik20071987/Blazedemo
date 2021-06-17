package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Base;

public class ProductPageObjects extends Base {
	By productTitle = By.xpath("//h2");
	By addToCart = By.xpath("//a[text()='Add to cart']");
	
	public WebElement productTitle() {
		return driver.findElement(productTitle);
	}
	
	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}
	
}
