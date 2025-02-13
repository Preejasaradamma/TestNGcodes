package testCasesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		driver.findElement(By.id("user_login")).sendKeys("Demo12");
		driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.name("wp-submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[1]"));
		
		driver.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.id("learn-press-checkout-place-order")).click();
		
		//driver.switchTo().frame((WebElement) By.xpath("//*[@id=\"smform\"]/fieldset"));
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys("1234345656787890");
		//driver.findElement(By.name("exp-date")).sendKeys("08/27");
		//driver.findElement(By.name("cvc")).sendKeys("123");
		
	}

}
