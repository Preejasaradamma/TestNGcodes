package testCasesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginVerificationTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login part
		driver.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		driver.findElement(By.id("user_login")).sendKeys("Demo12");
		driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.id("wp-submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
		
	}

}
