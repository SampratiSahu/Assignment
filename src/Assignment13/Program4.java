package Assignment13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Study/Selenium%20Practice%20Workspace/Assignment/HTML/Code.html");
		
		WebElement list = driver.findElement(By.xpath("//select[@name='students']"));
		
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			arr.add(text);
		}
		int arrsize = arr.size();
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			hs.add(text);
		}
		int hssize = hs.size();
		
		if(arrsize == hssize)
		{
			System.out.println("Duplicates not present");
		}
		else {
			System.out.println("Duplicates are present ");
		}

	}

}
