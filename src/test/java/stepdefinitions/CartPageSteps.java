package stepdefinitions;

import java.util.List;
import java.util.function.Function;

import org.junit.Assert;



import actions.CartPageActions;
import actions.HomePageActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Base;

public class CartPageSteps extends Base{
	HomePageActions homePageActions = new HomePageActions();
	CartPageActions cartPageActions = new CartPageActions();
	
	@When("User navigates to cart")
	public void user_navigates_to_cart() {
		cartPageActions.clickOnCart();
		Assert.assertTrue(cartPageActions.isCartPageDisplayed());
	}

	@When("User deletes {string} from cart")
	public void user_deletes_from_cart(String product) throws InterruptedException {
		cartPageActions.deleteFromCart(product);
		Assert.assertTrue(cartPageActions.isProductDeleted(product));
	}
	
	@When("User clicks on Place order")
	public void user_clicks_on_place_order() {
		cartPageActions.clickOnPlaceOrder();
	}
	
	@When("User fills in the form with following details")
	public void user_fills_in_the_form_with_following_details(DataTable data) {
		
		List<List<String>> input = data.asLists();
		
		cartPageActions.enterName(input.get(0).get(0));
		cartPageActions.enterCountry(input.get(0).get(1));
		cartPageActions.enterCity(input.get(0).get(2));
		cartPageActions.enterCard(input.get(0).get(3));
		cartPageActions.enterMonth(input.get(0).get(4));
		cartPageActions.enterYear(input.get(0).get(5));		
	}
	
	@When("User Clicks on purchase")
	public void user_clicks_on_purchase() {
		cartPageActions.clickOnPurchase();
	}
	
	@Then("Purchase confirmation popup is displayed with purchaseid and amount")
	public void purchase_confirmation_popup_is_displayed_with_purchaseid_and_amount() {
		Assert.assertTrue(cartPageActions.isPurchaseConfirmationDisplayed());
		log.info(cartPageActions.purchaseID());
		log.info(cartPageActions.purchaseAmount());
		System.out.println(cartPageActions.purchaseID());
		System.out.println(cartPageActions.purchaseAmount());
	}

	@Then("User Clicks on ok")
	public void user_clicks_on_ok() {
		cartPageActions.clickOnOkButton();
	}
}
