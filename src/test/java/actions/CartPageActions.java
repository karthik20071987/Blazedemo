package actions;

import org.apache.logging.log4j.message.Message;
import org.openqa.selenium.By;

import pageobjects.CartPageObjects;
import utils.Base;

public class CartPageActions extends Base{

	CartPageObjects cartPageObjects = new CartPageObjects();
	
	public void clickOnCart() {
		cartPageObjects.cart().click();
	}
	
	public boolean isCartPageDisplayed() {
		String currentURL = driver.getCurrentUrl();
		boolean isCartPageDisplayed = currentURL.contains("demoblaze.com/cart.html");
		if(isCartPageDisplayed) {
			log.info("Cart page is displayed");
		}
		else {
			log.info("Cart page is not displayed");
		}
		return isCartPageDisplayed;
	}

	public void clickOnPlaceOrder() {
		
		cartPageObjects.placeOrder().click();
		log.info("Clicked on place order");
	}
	
	public void enterName(String name) {
		cartPageObjects.name().sendKeys(name);
	}
	
	public void enterCountry(String country) {
		cartPageObjects.country().sendKeys(country);
	}
	
	public void enterCity(String city) {
		cartPageObjects.city().sendKeys(city);
	}
	
	public void enterCard(String card) {
		cartPageObjects.card().sendKeys(card);
	}

	public void enterMonth(String month) {
		cartPageObjects.month().sendKeys(month);
	}
	
	public void enterYear(String year) {
		cartPageObjects.year().sendKeys(year);
	}

	public void clickOnPurchase() {
		cartPageObjects.purchase().click();
	}
	
	public boolean isPurchaseConfirmationDisplayed() {
		boolean isDisplayed = cartPageObjects.finalPurchaseTitle().isDisplayed();
		return isDisplayed;
	}
	
	public void deleteFromCart(String product) throws InterruptedException {
		String xpath = "//td[text()='"+product+"']/following-sibling::td[2]/a";
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(2000);
	}
	
	public boolean isProductDeleted(String product) {
		String xpath = "//td[text()='"+product+"']/following-sibling::td[2]/a";
		try {
			driver.findElement(By.xpath(xpath));
			return false;
		}
		catch ( org.openqa.selenium.NoSuchElementException e)
		{
			return true;
		}
		
	}

	public String purchaseID() {
		String finalPurchase = cartPageObjects.finalPurchaseContent();
		String purchaseid = finalPurchase.substring(0,finalPurchase.indexOf("A"));
		log.info("Purchase ID is :"+purchaseid);
		return purchaseid;
	}

	public String purchaseAmount() {
		
		String finalPurchase = cartPageObjects.finalPurchaseContent();
		String amount = finalPurchase.substring(finalPurchase.indexOf("A"),finalPurchase.indexOf("C"));
		log.info("Purchase Amount is :"+amount);
		return amount;
	}

	public void clickOnOkButton() {
		cartPageObjects.okButton().click();
	}
}