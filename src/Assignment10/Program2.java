package Assignment10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement> tag = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		
		for(int i=0; i< tag.size();i++)
		{
			if(tag.get(i).getText().equalsIgnoreCase("MEN"))
			{
				tag.get(i).click();
				break;
			}
		}

	}

}
