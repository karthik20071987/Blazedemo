package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Base;

public class HomePageObjects extends Base{
	
	By home = By.xpath("//a[text()='Home ']");
	By categories = By.xpath("//a[text()='CATEGORIES']");
	By phones = By.xpath("//a[text()='Phones']");
	By laptops = By.xpath("//a[text()='Laptops']");
	By monitors = By.xpath("//a[text()='Monitors']");
	By phoneModel = By.xpath("//a[text()='Samsung galaxy s6']");
	By laptopModel = By.xpath("//a[text()='Sony vaio i5']");
	By monitorModel = By.xpath("//a[text()='Apple monitor 24']");
	
	public WebElement home() {
		return driver.findElement(home);
	}
	
	public WebElement categories() {
		return driver.findElement(categories);
	}
	
	public WebElement phones() {
		return driver.findElement(phones);
	}
	
	public WebElement phoneModel() {
		return driver.findElement(phoneModel);
	}
	
	public WebElement laptops() {
		return driver.findElement(laptops);
	}
	
	public WebElement laptopModel() {
		return driver.findElement(laptopModel);
	}
	
	public WebElement monitors() {
		return driver.findElement(monitors);
	}
	
	public WebElement monitorModel() {
		return driver.findElement(monitorModel);
	}
	
	public void clickOnProduct(String product) {
		String xpath = "//a[text()='"+product+"']";
		driver.findElement(By.xpath(xpath)).click();
	}

}
