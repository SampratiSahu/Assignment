package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement username =driver.findElement(By.id("email"));
		
		username.sendKeys("qspiders");
		username.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("pass")).sendKeys("abc");
		

	}

}
