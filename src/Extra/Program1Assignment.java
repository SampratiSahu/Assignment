package Extra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Program1Assignment 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notofications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		Thread.sleep(2000);
		for(int i=0; i<autosugg.size(); i++)
		{
			Thread.sleep(3000);
			if(autosugg.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				autosugg.get(i).click();
				break;
			}
		}
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Samprati");
		driver.findElement(By.name("lastname")).sendKeys("SaMa");
		driver.findElement(By.name("reg_email__")).sendKeys("9861145034");
		driver.findElement(By.id("password_step_input")).sendKeys("1qazXSW@");
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByVisibleText("16");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Dec");
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("//label[.='Female']")).click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<>(allwin);
		for(int i=0; i<arr.size(); i++)
		{
			driver.switchTo().window(arr.get(i));
		}
		
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Wikisource']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("selenium");
		Thread.sleep(1000);
		List<WebElement> autosugg2 = driver.findElements(By.xpath("//b[contains(text(),'selenium')]/.."));
		Thread.sleep(3000);
		for(int i=0; i<autosugg2.size();i++)
		{
			Thread.sleep(3000);
			if(autosugg2.get(i).getText().equalsIgnoreCase("selenium ide"))
			{
				autosugg2.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
		Set<String> win1 = driver.getWindowHandles();
		ArrayList<String> arr1 = new ArrayList<>(win1);
		for(int i=0; i<arr1.size();i++)
		{
			driver.switchTo().window(arr1.get(i));
		}
		Thread.sleep(2000);
		driver.close();
		Set<String> win2 = driver.getWindowHandles();
		ArrayList<String> arr2 = new ArrayList<>(win2);
		for(int i=0; i<arr2.size();i++)
		{
			driver.switchTo().window(arr2.get(i));
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
