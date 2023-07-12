package Assignment10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		List<WebElement> tag = driver.findElements(By.xpath("//div[@class='_1mkliO']/.."));
		Thread.sleep(2000);
		System.out.println(tag.size());
		for(int i=0; i<tag.size(); i++)
		{
			Thread.sleep(2000);
			if(tag.get(i).getText().equalsIgnoreCase("Travel"))
			{
				tag.get(i).click();
				break;
			}
		}
	}

}
