package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qspiders.com/contact");
		
		WebElement ele =driver.findElement(By.xpath("//p[contains(text(),'United States')]/../..//span[contains(text(),'+1')]"));
		System.out.println(ele.getText());
	}

}
