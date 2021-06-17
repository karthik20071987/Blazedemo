package stepdefinitions;

import io.cucumber.java.After;
import utils.Base;

public class Hooks extends Base{
	
	@After
	public void closeDriver() {
		
		
		Base.driver.close();
		
	}
	
	

}
