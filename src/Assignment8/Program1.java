package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("qspiders");
		
		for(int i=0; i<=1; i++)
		{
			username.sendKeys(Keys.ARROW_LEFT);
		}
		username.sendKeys(Keys.BACK_SPACE);
		
		for(int i=0; i<=1; i++)
		{
			username.sendKeys(Keys.ARROW_LEFT);
		}
		username.sendKeys(Keys.BACK_SPACE);

	}

}
