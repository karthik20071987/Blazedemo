Feature: This feature is to validate the purchase from demoblaze website

@Purchase @Regression
Scenario: User adds two products, deletes one from cart and completes the purchase

Given User is in demoblaze homepage
When User navigates through the category "Phones"
And User navigates through the category "Monitors"
And User navigates through the category "Laptops"
And User adds the product "Sony vaio i5" to cart
And User accepts the confirmation popup
And User navigates through the category "Laptops"
And User adds the product "Dell i7 8gb" to cart
And User accepts the confirmation popup
And User navigates to cart
And User deletes "Dell i7 8gb" from cart
And User clicks on Place order
And User fills in the form with following details
|Name_Test|Country_Test	|City_Test|Card_Test|Month_Test |Year_Test|

And User Clicks on purchase
Then Purchase confirmation popup is displayed with purchaseid and amount
And User Clicks on ok