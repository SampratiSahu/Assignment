package Assignment16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.freshersworld.com/");
		//Thread.sleep(4000);
		WebElement upload = driver.findElement(By.xpath("//span[contains(text(),' Upload Resume')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", upload);
		//Thread.sleep(3000);
		/*
		 * WebElement choose =
		 * driver.findElement(By.xpath("//input[@id='file-upload']"));
		 * js.executeScript("arguments[0].click()", choose);
		 */
	}

}
