package Assignment_TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Assignment_POM.POM_GoogleWebpage;
import Assignment_POM.POM_SeleniumWebdriverPage;

public class Google_HandleAutosugg_Validate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		POM_GoogleWebpage page = new POM_GoogleWebpage(driver);
		page.searchMethod();
		page.autoSuggsMethod();
		
		POM_SeleniumWebdriverPage sel = new POM_SeleniumWebdriverPage(driver);
		sel.validate();
		
	}
	

}
