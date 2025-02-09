package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login part
		driver.findElement(By.xpath("//*[@id=\"menu-item-42364\"]/a/span")).click();
		driver.findElement(By.id("user_login")).sendKeys("Preeja11");
		driver.findElement(By.id("user_pass")).sendKeys("Preeja456$");
		// driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div/button/span")).click();
		// driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();

		// driver.findElement(By.xpath("//*[@id=\"nav\"]/a[1]")).click(); //register
		// driver.findElement(By.xpath("//*[@id=\"nav\"]/a[2]")).click(); //reset pass
		// driver.findElement(By.xpath("//*[@id=\"backtoblog\"]/a")).click(); //link

		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div[2]/div/div/div[3]/div/a/span/span")).click();
		
		// to perform Scroll on application using Selenium
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1500)", "");

		//WebElement link = driver.findElement(By.linkText("Software Testing Academy"));
		//link.click();

		
	}

}
