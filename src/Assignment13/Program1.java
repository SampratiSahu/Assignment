package Assignment13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

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
		
		Collections.sort(arr);
		
		System.out.println("Ascending Order:" + arr);
		
		Collections.sort(arr, Collections.reverseOrder());
		
		System.out.println("Descending Order:" + arr);

	}

}
