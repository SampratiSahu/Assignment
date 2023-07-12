package Assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		WebElement text = driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[1]//input[1]/../../../../../../../../../../../../../.."));
		System.out.println(text.getTagName());

	}

}
