package Assignment17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.goindigo.in/?");
		
		driver.findElement(By.xpath("//a[@class='close-cookie']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ymDivBar")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("ymIframe");
		Thread.sleep(1000);
		driver.findElement(By.id("ymMsgInput")).sendKeys("Hiiii");
		driver.findElement(By.id("sendIcon")).click();

	}

}
