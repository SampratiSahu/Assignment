package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Dev");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Dev']/../..//a[contains(text(),'delete')]")).click();
		driver.switchTo().alert().accept();
	}

}
