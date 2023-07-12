package Extra;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSetBrowser {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.firefox.driver", "./driver/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension(300, 300);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());

	}

}
