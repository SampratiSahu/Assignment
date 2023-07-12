package Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentMyntra2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("levis");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		
		for(int i=0;i<autosugg.size();i++)
		{
			Thread.sleep(2000);
			if(autosugg.get(i).getText().equalsIgnoreCase("levis tshirts"))
			{
				autosugg.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Price']/..//label[@class='common-customCheckbox vertical-filters-label'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Color']/..//span[@data-colorhex='mustard']/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[.='Men Striped Polo Collar T-shirt']/../..")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<>(allwindows);
		for(int i=0; i<arr.size(); i++)
		{
			driver.switchTo().window(arr.get(i));
		}
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//span[@class='pdp-price']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='index-ratingsCount']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='pdp-discount']")).getText());
		
		driver.findElement(By.xpath("//h4[.='SELECT SIZE ']/../..//p[.='M']/..")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("pincode")).sendKeys("751024");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Bag']")).click();
		Thread.sleep(2000);
		
		String expectedProduct = "Men Mustard Yellow & Black Striped Polo Collar Pure Cotton T-shirt";
		String actualProduct = driver.findElement(By.xpath("//a[contains(text(),'Men Mustard Yellow & Black Striped Polo Collar Pure Cotton T-shirt')]"))
								.getText();
		if(actualProduct.equalsIgnoreCase(expectedProduct))
		{
			System.out.println("Correct Product");
		}
		else
		{
			System.out.println("Not Correct Product");
		}
		
		driver.close();
		Set<String> allwindows1 = driver.getWindowHandles();
		ArrayList<String> arr1 = new ArrayList<>(allwindows1);
		for(int i=0; i<arr1.size(); i++)
		{
			driver.switchTo().window(arr1.get(i));
		}
		
		String expectedTitle = "Levis Tshirts - Explore the Latest Range of Levis T-shirts Online at Myntra";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Switched to Parent Tab");
		}
		else {
			System.out.println("Not switched to Parent Tab");
		}
	}

}
