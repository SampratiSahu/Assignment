package Assignment12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?");
		Thread.sleep(1000);
		
		driver.findElement(By.name("origin")).sendKeys("San");
		Thread.sleep(3000);
		List<WebElement> fromCity = driver.findElements(By.xpath("//a[contains(text(),'San')]"));
		Thread.sleep(5000);
		for(int i=0; i<fromCity.size(); i++)
		{
			Thread.sleep(5000);
			if(fromCity.get(i).getText().equalsIgnoreCase("San Antonio (SAT), Texas, USA"))
			{
				fromCity.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.name("destination")).sendKeys("Las");
		Thread.sleep(1000);
		List<WebElement> toCity = driver.findElements(By.xpath("//a[contains(text(),'Las')]"));
		Thread.sleep(3000);
		for(int i=0; i<toCity.size(); i++)
		{
			Thread.sleep(3000);
			if(toCity.get(i).getText().equalsIgnoreCase("Las Vegas (LAS), Nevada, USA"))
			{
				toCity.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		WebElement adult = driver.findElement(By.name("adults"));
		Select s = new Select(adult);
		s.selectByVisibleText("4");
		
		Thread.sleep(1000);
		WebElement child = driver.findElement(By.name("children"));
		Select s1 = new Select(child);
		s1.selectByVisibleText("3");
	}

}
