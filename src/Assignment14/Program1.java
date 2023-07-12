package Assignment14;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?");
		
		//Departure
		
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		
		List<WebElement> my = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<my.size(); i++)
		{
			
			String text = my.get(i).getText();
			arr.add(text);
			
		}
		System.out.println(arr);
		String my1 = arr.get(0);
		String my2 = arr.get(1);
		
		String m1 = my1.split(" ")[0];
		String y1 = my1.split(" ")[1];
		
		String m2 = my2.split(" ")[0];
		String y2 = my2.split(" ")[1];
		
		while(!((m1.equals("January") || m2.equals("January"))) && (y1.equals("2023") || y2.equals("2024"))) 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			Thread.sleep(2000);
			List<WebElement> myFinal = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']"));
			ArrayList<String> arr2 = new ArrayList<>();
			for(int i=0; i<myFinal.size();i++)
			{
				Thread.sleep(2000);
				String text = myFinal.get(i).getText();
				arr2.add(text);
			}
			String myFinal1 = arr2.get(0);
			String myFinal2 = arr2.get(1);
			
			m1 = myFinal1.split(" ")[0];
			y1 = myFinal1.split(" ")[1];
			
			m2 = myFinal2.split(" ")[0];
			y2 = myFinal2.split(" ")[1];
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='January']/../../..//a[.='20']")).click();

	}

}
