package Assignment_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_SeleniumWebdriverPage 
{
	public WebDriver driver;
	
	public POM_SeleniumWebdriverPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validate()
	{
		//System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle = "selenium webdriver - Google Search";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Navigated to proper page");
		}
		else
		{
			System.out.println("Wrong Page");
		}
	}

}
