import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assertion {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https//www.facebook.com");
		String title = driver.getTitle();
		assertEquals("title", "Facebook – log in or sign up");
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
		
	}

}
