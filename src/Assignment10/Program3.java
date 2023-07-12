package Assignment10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//a[.='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h4[.='Biggest Deals On Top Brands']/../../..//img[contains(@src,'Puma')]")).click();
		driver.findElement(By.xpath("//span[.='Categories']/..//div[@class='categories-more']")).click();
		List<WebElement> checkbox = driver.findElements(By.xpath("//label[@class=' common-customCheckbox']/.."));
		System.out.println("size of the list is:"+ checkbox.size());
		
		//click on all the checkboxes
		/*
		 * for(int i=0; i<checkbox.size();i++) { Thread.sleep(1000);
		 * checkbox.get(i).click(); }
		 */
		
		//click on alternate checkboxes
		/*
		 * for(int i=0; i<checkbox.size();i+=2) { Thread.sleep(1000);
		 * checkbox.get(i).click(); }
		 */
		
		//click on alternate checkboxes in reverse order
		for(int i=checkbox.size()-1;i>=0;i-=2)
		{
			Thread.sleep(1000);
			checkbox.get(i).click();
		}
	}

}
