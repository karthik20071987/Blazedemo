package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	private String globalProertiesPath;
	public static WebDriver driver;

	//This Method initializes the driver
	public WebDriver getDriver() {
		
		log.info("***********New Run started***********");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		log.info("Driver initialized");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	
	}
	
	//This method is to fetch the value from global.properties file
	public String getGlobalValue(String key) throws IOException {
		setPropFilePath();
		
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream(globalProertiesPath);
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	
	//This method is to set the property file path
	private void setPropFilePath() {
		
		if(System.getProperty("os.name").contains("Windows"))
			globalProertiesPath = System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties";
		else {
			globalProertiesPath = System.getProperty("user.dir")+"/src/test/resources/global.properties";
		}
		
	}
	
	public void waitForElement(WebDriver driver, WebElement element) {
	    WebDriverWait wait = new WebDriverWait(driver,5);
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
}
