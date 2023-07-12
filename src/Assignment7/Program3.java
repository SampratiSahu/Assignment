package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Directory']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//p[.='Peter Mac Anderson ']/../..//p[.='Chief Financial Officer  (Deleted)']"));
		System.out.println(ele.getText());
	}

}
