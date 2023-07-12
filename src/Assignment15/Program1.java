package Assignment15;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("levis");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//li[contains(text(),'Levis')]"));
		Thread.sleep(2000);
		for(int i=0; i<sugg.size();i++)
		{
			if(sugg.get(i).getText().equalsIgnoreCase("levis sneakers"))
			{
				Thread.sleep(1000);
				sugg.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Color']/..//span[@data-colorhex='black']/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Color']/..//span[@data-colorhex='white']/..")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@title='Levis Men Black Sneakers']/../../../../../..")).click();
		Thread.sleep(1000);
		
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<>(allwin);
		for(int i=0;i<arr.size();i++)
		{
			driver.switchTo().window(arr.get(i));
		}
		
		System.out.println(driver.getTitle());
		String expectedTitle = "Buy Levis Men Black Sneakers - Casual Shoes for Men 1813474 | Myntra";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Switched to new tab");
		}
		else
		{
			System.out.println("Not switched to new tab");
		}
		
		WebElement rating = driver.findElement(By.xpath("//div[@class='index-ratingsCount']"));
		System.out.println(rating.getText());
		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-price']"));
		System.out.println(price.getText());
		WebElement discount = driver.findElement(By.xpath("//span[@class='pdp-discount']"));
		System.out.println(discount.getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[@class='size-buttons-select-size']/../..//p[.='6']/..")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("pincode")).sendKeys("751024");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
		Thread.sleep(2000);
		WebElement bag = driver.findElement(By.xpath("//span[.='Bag']/.."));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", bag);
		Thread.sleep(2000);
		WebElement placeOrder = driver.findElement(By.xpath("(//div[.='PLACE ORDER'])[2]/.."));
		js.executeScript("arguments[0].click()", placeOrder);
		Thread.sleep(1000);
		driver.close();
		
		Set<String> allwin1 = driver.getWindowHandles();
		ArrayList<String> arr1 = new ArrayList<>(allwin1);
		for(int i=0;i<arr1.size();i++)
		{
			driver.switchTo().window(arr1.get(i));
		}
		
		System.out.println(driver.getTitle());
		String expectedTitle1 = "Levis Sneakers - Buy Levis Sneakers online in India";
		String actualTitle1 = driver.getTitle();
		if(actualTitle1.equals(expectedTitle1))
		{
			System.out.println("Switched to parent tab");
		}
		else
		{
			System.out.println("Not switched to parent tab");
		}
		
		driver.close();
		
		
	}

}
