package stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import actions.HomePageActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

public class HomePageSteps extends Base{
	
	HomePageActions homePageActions = new HomePageActions();
	
	@Given("User is in demoblaze homepage")
	public void user_is_in_demoblaze_homepage() throws IOException {

		homePageActions.openHomePage();
		Assert.assertTrue(homePageActions.isHomePageDisplayed());		
		
	}

	@When("User navigates through the category {string}")
	public void user_navigates_through_the_category(String category) {
		homePageActions.clickOnCategory(category);
	}

}
