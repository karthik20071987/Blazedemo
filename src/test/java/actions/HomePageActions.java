package actions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import pageobjects.HomePageObjects;
import utils.Base;

public class HomePageActions extends Base{
	
	HomePageObjects homePageObjects = new HomePageObjects();

	public void openHomePage() throws IOException {
		getDriver();
		driver.get(getGlobalValue("baseurl"));	
	}
	
	public boolean isHomePageDisplayed() {
		String currentURL = driver.getCurrentUrl();
		boolean isHomePageDisplayed = currentURL.contains("demoblaze.com/index.html");
		if(isHomePageDisplayed) {
			log.info("Homepage is displayed");
		}
		else {
			log.info("Homepage not displayed");
		}
			
		return isHomePageDisplayed;
	}
	
	public void clickPhones() {
		
		try {
			homePageObjects.phones().click();
			Assert.assertTrue(homePageObjects.phoneModel().isDisplayed());
		}
		catch(org.openqa.selenium.StaleElementReferenceException e)
		{
			waitForElement(driver, homePageObjects.phones());
			homePageObjects.phones().click();
			Assert.assertTrue(homePageObjects.phoneModel().isDisplayed());
		}
		log.info("Clicked on phones");
		
	}
	
	public void clickLaptops() {
		try {
			homePageObjects.laptops().click();
			Assert.assertTrue(homePageObjects.laptopModel().isDisplayed());
		}
		catch(org.openqa.selenium.StaleElementReferenceException e) {
			waitForElement(driver, homePageObjects.laptops());
			homePageObjects.laptops().click();
			Assert.assertTrue(homePageObjects.laptopModel().isDisplayed());
		}
		log.info("Clicked on laptops");
		
	}
	
	public void clickMonitors() {
		try {
			homePageObjects.monitors().click();
			Assert.assertTrue(homePageObjects.monitorModel().isDisplayed());			
		}
		catch(org.openqa.selenium.StaleElementReferenceException e) {
			waitForElement(driver, homePageObjects.monitors());
			homePageObjects.monitors().click();
			Assert.assertTrue(homePageObjects.monitorModel().isDisplayed());
		}
		log.info("Clicked on monitors");
	}

	public void clickOnCategory(String category) {
		
		switch(category)
		{
		case "Phones" -> clickPhones();
		case "Laptops" -> clickLaptops();
		case "Monitors" -> clickMonitors();
		}
	}	
	
}
