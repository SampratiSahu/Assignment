package Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMyntra {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("levis");
		Thread.sleep(2000);
		List<WebElement> dropdown = driver.findElements(By.xpath("//li[contains(text(),'Levis')]"));
		Thread.sleep(2000);
		for(int i=0; i<dropdown.size(); i++)
		{
			Thread.sleep(2000);
			if(dropdown.get(i).getText().equalsIgnoreCase("Levis Sneakers"))
			{
				dropdown.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Color']/..//span[@data-colorhex='black']/..")).click();
		driver.findElement(By.xpath("//span[.='Color']/..//span[@data-colorhex='white']/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='Levis Men White Sneakers'])[1]")).click();
		
		Set<String> allwin = driver.getWindowHandles(); 
		ArrayList<String> arr = new ArrayList<>(allwin); 
		for(int i=0; i<arr.size(); i++) 
		{
			driver.switchTo().window(arr.get(i)); 
		}
		
		String expectedTitle = "Buy Levis Men White Sneakers - Casual Shoes for Men 1813452 | Myntra";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Switched to new tab");
		}
		else 
		{
			System.out.println("wrong tab");
		}
		
		WebElement rating = driver.findElement(By.xpath("//div[@class='index-ratingsCount']"));
		System.out.println(rating.getText());
		
		WebElement price = driver.findElement(By.xpath("//span[@class='pdp-price']"));
		System.out.println(price.getText());
		
		WebElement discount = driver.findElement(By.xpath("//span[@class='pdp-discount']"));
		System.out.println(discount.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[@class='size-buttons-select-size']/../..//p[.='6']/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("pincode")).sendKeys("751024");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
		Thread.sleep(5000);
		WebElement bag = driver.findElement(By.xpath("//span[.='Bag']/.."));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", bag);
		
		Thread.sleep(2000);
		WebElement placeOrder = driver.findElement(By.xpath("(//div[.='PLACE ORDER'])[2]/.."));
		js.executeScript("arguments[0].click()", placeOrder);
		
		Thread.sleep(2000);
		driver.close();
		
		Set<String> allwin1 = driver.getWindowHandles(); 
		ArrayList<String> arr1 = new ArrayList<>(allwin1); 
		for(int i=0; i<arr1.size(); i++) 
		{
			driver.switchTo().window(arr1.get(i)); 
		}
		//System.out.println(driver.getTitle());
		String expectedTitle2 = "Levis Sneakers - Buy Levis Sneakers online in India";
		String actualTitle2 = driver.getTitle();
		if(expectedTitle2.equals(actualTitle2))
		{
			System.out.println("Welcome to parent window");
		}
		else
		{
			System.out.println("Not the parent window");
		}
		driver.close();
	}

}
