package Assignment17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airasia.co.in/home");
		
		driver.findElement(By.xpath("//div[@class='avaamo__icon']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("avaamoIframe");
		Thread.sleep(2000);
		driver.findElement(By.id("queryTextbox")).sendKeys("Hiii Tia");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Send']")).click();

	}

}
