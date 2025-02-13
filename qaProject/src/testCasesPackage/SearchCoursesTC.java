package testCasesPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCoursesTC {

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
		
		driver.findElement(By.name("search_course")).sendKeys("Courses");
		driver.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
		
		driver.findElement(By.id("form1")).clear();
		driver.findElement(By.id("form1")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"search-container\"]/form/div/div/button")).click();
		
	}

}
