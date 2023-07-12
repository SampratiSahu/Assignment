package Assignment9;

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
		driver.get("https://www.myntra.com/");
		
		List<WebElement> tags =driver.findElements(By.tagName("a"));
		System.out.println("Number of tags are:" + tags.size());
		
		for(int i=0; i<tags.size();i++)
		{
			System.out.println("URL present on Myntra are:" + tags.get(i).getAttribute("href"));
			System.out.println("Text present on Myntra are:" + tags.get(i).getText());
		}
	}

}
