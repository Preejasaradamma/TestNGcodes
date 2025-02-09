package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("selenium webdriver");
		driver.findElement(By.name("btnK")).click();
	}

}
