package BrowserUtils;

	import java.util.concurrent.TimeUnit;

	
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;


	


	public class Browser 
	{
		public static WebDriver driver;
		public static ChromeOptions options; 
		public static JavascriptExecutor js;
		public void openBrowser()
		{
		options= new ChromeOptions();
		options.addArguments("--disable-notifications");		
		
		driver= new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}
		
		public void closeBrowser()
		{
			driver.close();

		}

}
