package Pagefactoryy;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;




import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;


public class swiggySearchPageFactoryy {
	
	//Locating Search field in HomePage
		@FindBy(xpath="//span[contains(text(),'Search')]")
		WebElement searchField;
		//Locating search food and restaurants 
		@FindBy(xpath="//input[@class='_2FkHZ']")
		WebElement searchFoodAndRestaurants;
		//Locating suggestions
		@FindBy(xpath="//div[@class='_1VxLu']")
		WebElement suggestions;
		//Locating invalidSearch()
		@FindBy(xpath="//div[contains(text(),'See all results for ')]")
		WebElement invalidSearch;
		//Locating validRestaurantName
		@FindBy(xpath="//div[@class='_23LIV']")
		WebElement validRestaurantAndFood;
		//Locating click for validRestaurantName
		@FindBy(xpath="//div[@class='styles_restaurantListItem__1lOsF']//a[1]")
		WebElement clickValidRestaurant;
		
		//Locating Restaurant section
		@FindBy(xpath="//span[@class='styles_container__1ieVH styles_size-sm__1emwv styles_variant-default__2VzW8 styles_rounded__3IerS styles_canClick__16iph NavTab_tab__1JygM']//span")
		WebElement restaurantSection;

	
	


	
		
		public static WebDriver driver;	
		public swiggySearchPageFactoryy(WebDriver driver)
		{
			swiggySearchPageFactoryy.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public void search() throws InterruptedException
		{
			searchField.click();
	
			

		}
		public void restaurantName() throws InterruptedException
		{			
			searchFoodAndRestaurants.sendKeys("cake zone");
		
		
		}

		public void suggestion() throws InterruptedException
		{			
			System.out.println("Restaurant suggestions are: "+suggestions.getAttribute("innerText"));
	
			
		}

		public void takeScreenshot(String path) throws IOException, InterruptedException
		{	
			Thread.sleep(2000);
			TakesScreenshot scrshot =((TakesScreenshot)driver);
			File scr = scrshot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(path);
			FileHandler.copy(scr, DestFile);
			Thread.sleep(2000);
		

		}

		public void takeFullScreenshot(String path1) throws IOException
		{
			// capture screenshot and store the image
		
		}

		public void validateInvalidRestaurantName(DataTable restaurant) throws InterruptedException
		{
			List<Map<String, String>> r = restaurant.asMaps(String.class, String.class);        
			for (Map<String, String> data : r) {             
				String rest = data.get("Restaurant");             
				
				searchFoodAndRestaurants.sendKeys(rest);
				
				searchFoodAndRestaurants.clear();
				
			

			}}

		public void validateInvalidFoodName(DataTable food) throws InterruptedException
		{
			List<Map<String, String>> f = food.asMaps(String.class, String.class);        
			for (Map<String, String> data : f) {             
				String foodItem = data.get("Food");             
				
				searchFoodAndRestaurants.sendKeys(foodItem);
			
				searchFoodAndRestaurants.clear();
				
		
			

			}}

		public void validateInvalidSearch() throws InterruptedException
		{

			String actErrMsg=driver.findElement(By.xpath("//div[contains(text(),'See all results for ')]")).getText();
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertEquals(actErrMsg, "See all results for 'ejrjk32'");
			softAssert.assertAll();	
		

		}

		public void validRestaurantName() throws InterruptedException
		{
			searchFoodAndRestaurants.sendKeys("Hotel Green Park");
		
			validRestaurantAndFood.click();

			
		}
		public void openValidRestaurantName() throws InterruptedException, IOException
		{
			clickValidRestaurant.click();
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			System.out.println("Url is " +url);
		
			
		}

		public void validFoodName() throws InterruptedException
		{
			searchFoodAndRestaurants.sendKeys("Pav Bhaji");
		


		}
		public void openValidFoodName() throws InterruptedException, IOException
		{
			validRestaurantAndFood.click();
	
			
		}

		public void validatePopularCuisine(String path) throws InterruptedException
		{
			File scr=driver.findElement(By.xpath("//div[@class='NavTabs_wrapper__1me4c _3DdnR NavTabs_wrapperScrolled__10HRt']")).getScreenshotAs(OutputType.FILE);
			File des=new File(path);
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertEquals(des, scr);
			softAssert.assertAll();	
	
		

		}
		public void validateFoodAndDishes() throws InterruptedException
		{
			String Restaurant=driver.findElement(By.xpath("//span[contains(text(),'Restaurants')]")).getText();
			String dishes=driver.findElement(By.xpath("//span[contains(text(),'Dishes')]")).getText();
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertEquals(Restaurant,"Restaurants" );
			softAssert.assertEquals(dishes,"Dishes" );			
			softAssert.assertAll();	
			
			
		}

		public void restaurantSection() throws InterruptedException, IOException
		{
			restaurantSection.click();
	
			

		}
	

}
