package Assignment18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		List<WebElement> age = driver.findElements(By.xpath("//table[@id='table1']//tbody//td[2]"));
		
		System.out.println("The total no. of numeric values present in the webtable are: " +age.size());

	}

}
