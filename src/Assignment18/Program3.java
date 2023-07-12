package Assignment18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/");
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[.=' Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.=' Sales']/..")).click();
		driver.findElement(By.xpath("//a[.='Orders']/..")).click();
		Thread.sleep(2000);
		
		List<WebElement> table = driver.findElements(By.xpath("//form[@id='form-order']//tbody//td[4]"));
		Thread.sleep(2000);
		for(int i=0; i<table.size();i++)
		{
			Thread.sleep(2000);
			if(table.get(i).getText().equalsIgnoreCase("Sam Sa"))
			{
				driver.findElement(By.xpath("//td[.='Sam Sa']/..//input[@name='selected[]']")).click();
				break;
			}
			else
			{
				WebElement page = driver.findElement(By.xpath("//a[.='>']/.."));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", page);
				Thread.sleep(3000);
			}
		}

	}

}
