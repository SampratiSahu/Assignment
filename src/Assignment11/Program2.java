package Assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		Thread.sleep(2000);
		WebElement searchbar =driver.findElement(By.name("q"));
		//searchbar.click();
		searchbar.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
		
		for(int i=0; i<sugg.size();i++)
		{
			Thread.sleep(2000);
			if(sugg.get(i).getText().equalsIgnoreCase("selenium python"))
			{
				sugg.get(i).click();
				break;
			}
		}

	}

}
