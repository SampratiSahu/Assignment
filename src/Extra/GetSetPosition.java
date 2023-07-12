package Extra;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetPosition {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.manage().window().getPosition());
		
		Point p = new Point(300, 300);
		
		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getPosition());

	}

}
