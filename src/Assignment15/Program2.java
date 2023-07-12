package Assignment15;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/shop/men");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/shop/women");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/shop/kids");
		
		Set<String> allWin = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<>(allWin);
		for(int i=0;i<arr.size();i++)
		{
			driver.switchTo().window(arr.get(i));
		}
		
		System.out.println(driver.getTitle());
		
		for(int i=0;i<arr.size();i++)
		{
			driver.switchTo().window(arr.get(0));
		}
		System.out.println(driver.getTitle());
		
		for(int i=0; i<arr.size();i++)
		{
			driver.switchTo().window(arr.get(1));
		}
		System.out.println(driver.getTitle());

	}

}
