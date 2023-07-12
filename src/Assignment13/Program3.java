package Assignment13;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Study/Selenium%20Practice%20Workspace/Assignment/HTML/Code.html");
		
		WebElement list = driver.findElement(By.xpath("//select[@name='students']"));
		
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		
		Set<String> ts = new TreeSet<>();
		for(int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			ts.add(text);
		}
		System.out.println("Unique content in ascending order : " + ts);
	}
}
