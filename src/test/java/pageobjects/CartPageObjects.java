package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Base;

public class CartPageObjects extends Base{
	
	By placeOrder = By.xpath("//button[text()='Place Order']");
	By cart = By.xpath("//a[text()='Cart']");
	By name = By.xpath("//input[@id='name']");
	By country = By.xpath("//input[@id='country']");
	By city = By.xpath("//input[@id='city']");
	By card = By.xpath("//input[@id='card']");
	By month = By.xpath("//input[@id='month']");
	By year = By.xpath("//input[@id='year']");
	By purchase = By.xpath("//button[text()='Purchase']");
	By finalPurchaseTitle = By.xpath("//h2[text()='Thank you for your purchase!']");
	By finalPurchaseContent = By.xpath("//h2[text()='Thank you for your purchase!']/following-sibling::p");
	By okButton = By.xpath("//button[text()='OK']");
	
	public WebElement cart() {
		return driver.findElement(cart);
	}
	
	public WebElement placeOrder() {
		return driver.findElement(placeOrder);
	}
	
	public WebElement name() {
		return driver.findElement(name);
	}
	
	public WebElement country() {
		return driver.findElement(country);
	}
	
	public WebElement city() {
		return driver.findElement(city);
	}
	
	public WebElement card() {
		return driver.findElement(card);
	}
	
	public WebElement month() {
		return driver.findElement(month);
	}
	
	public WebElement year() {
		return driver.findElement(year);
	}

	public WebElement purchase() {
		return driver.findElement(purchase);
	}
	
	public WebElement finalPurchaseTitle() {
		return driver.findElement(finalPurchaseTitle);
	}
	
	public String finalPurchaseContent() {
		return driver.findElement(finalPurchaseContent).getText();
	}
	
	public WebElement okButton() {
		return driver.findElement(okButton);
	}
	
}
