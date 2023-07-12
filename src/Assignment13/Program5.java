package Assignment13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program5 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Study/Selenium%20Practice%20Workspace/Assignment/HTML/Code.html");
		
		WebElement list = driver.findElement(By.xpath("//select[@name='students']"));
		
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		
		int count =0;
		for(int i=0; i<options.size(); i++)
		{
			if(options.get(i).getText().equals("Dev"))
			{
				count++;
			}
		}
		System.out.println("Occurance of Dev is: " + count);
	}

}
