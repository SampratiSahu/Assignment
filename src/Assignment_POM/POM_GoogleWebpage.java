package Assignment_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_GoogleWebpage 
{
	@FindBy(name="q")
	private WebElement searchBarTextfield;
	@FindBy(xpath="//span[contains(text(),'selenium')]")
	private List<WebElement> autoSugg;
	
	public POM_GoogleWebpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchMethod() throws InterruptedException
	{
		searchBarTextfield.sendKeys("selenium");
		Thread.sleep(2000);
	}
	
	public void autoSuggsMethod()
	{
		for(int i=0; i<autoSugg.size();i++)
		{
			if(autoSugg.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				autoSugg.get(i).click();
				break;
			}
		}
	}

}
