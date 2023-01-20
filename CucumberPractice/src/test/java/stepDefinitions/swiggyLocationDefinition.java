package stepDefinitions;

import BrowserUtils.Browser;
import Pagefactoryy.swiggyLocationnPageFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class swiggyLocationDefinition extends Browser
	{
	
	swiggyLocationnPageFactory location;

	@Before
	public void setUp() {
		openBrowser();
	}
	
	@After
	public void tearDown()
	{
		closeBrowser();
	}
	
	@Given("User is on Swiggy Page")
	public void user_is_on_swiggy_page() {
		driver.get("https://www.swiggy.com");
		location=new swiggyLocationnPageFactory(driver);
	}

	@When("User enters url of Swiggy")
	public void user_enters_url_of_swiggy() throws InterruptedException {
		location.swiggyPage();

	}

	@Then("User should be navigated to Swiggy page")
	public void user_should_be_navigated_to_swiggy_page() throws InterruptedException { 
		location.validateSwiggyPage();

	}

	@When("User enters Valid {string} and get the list of suggestions")
	public void user_enters_valid_and_get_the_list_of_suggestions(String string) throws InterruptedException {
		location.locationSearchFieldScenarioOutline(string);


	}

	@Then("User should be able to get suggestions for valid city names")
	public void user_should_be_able_to_get_suggestions_for_valid_city_names() throws InterruptedException {
		location.validateCityPage();
		

	}

	@When("User enters Valid city name and Click on Find Food button")
	public void user_enters_valid_city_name_and_click_on_find_food_button() throws InterruptedException {
		location.SearchField("Pune");
		location.SearchFieldd();

	}
	@Then("User should be able to view the Restaurants for the location")
	public void user_should_be_able_to_view_the_restaurants_for_the_location() throws InterruptedException {
		location.swiggyPage();
		
	}


}