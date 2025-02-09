package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationClass {

	// globally 
	WebDriver driver;
	@Test(priority=1)
	void login()
	{
		
		driver.findElement(By.id("loginlabel")).click();
		driver.findElement(By.id("user_login")).sendKeys("Demo12");
		driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.id("wp-submit")).click();
	}
	
	@Test(priority=2)
	void clickdashboard()
	{
		driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
	}
	
	
	@BeforeMethod
	void beforeLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	void teardown()
	{
		driver.close();
	}
}
