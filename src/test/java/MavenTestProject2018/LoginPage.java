package MavenTestProject2018;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage   {
	
	WebDriver driver;
	 
	@Test
	public void chkLoginFunc() throws InterruptedException{
		System.out.println("base - base");
		String path = System.getProperty("user.dir")+"\\src\\test\\java\\MavenTestProject2018\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("admin@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.id("loginbutton")).click();
	}
}
