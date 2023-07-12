package Assignment11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[.='iphone 14']/.."));
		Thread.sleep(2000);
		for(int i=0; i<sugg.size(); i++)
		{
			if(sugg.get(i).getText().equalsIgnoreCase("iphone 14 cover"))
			{
				Thread.sleep(2000);
				sugg.get(i).click();
				break;
			}
		}
		
	}

}
