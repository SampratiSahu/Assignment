package Assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Tommy");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//li[contains(text(),'Tommy')]"));
		Thread.sleep(1000);
		for(int i=0; i<sugg.size();i++)
		{
			Thread.sleep(1000);
			if(sugg.get(i).getText().equalsIgnoreCase("Tommy Hilfiger Bags"))
			{
				sugg.get(i).click();
				break;
			}
		}

	}

}
