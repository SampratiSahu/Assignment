package Assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/?");
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//b[.='selenium']/.."));
		
		for(int i=0; i<sugg.size();i++)
		{
			if(sugg.get(i).getText().equalsIgnoreCase("selenium download"))
			{
				sugg.get(i).click();
				break;
			}
		}
	}

}
