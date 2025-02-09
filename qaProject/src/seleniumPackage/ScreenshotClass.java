package seleniumPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login part
		driver.findElement(By.xpath("//*[@id=\"menu-item-42364\"]/a/span")).click();
		driver.findElement(By.id("user_login")).sendKeys("Preeja1");
		driver.findElement(By.id("user_pass")).sendKeys("Preeja456");
		
		File fc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(fc, new File("C:\\Users\\preej\\eclipse-workspace\\qaProject\\Screenshot\\username.jpg"));
		driver.findElement(By.id("wp-submit")).click();
		
		
		
	}

}
