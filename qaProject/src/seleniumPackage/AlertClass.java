package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.id("alert")).click();
		Thread.sleep(4000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();		
		Thread.sleep(4000);
		 
		driver.findElement(By.id("confirm")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(4000);
		
		driver.findElement(By.id("prompt")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Preeja");
		alert2.accept();
		
	}

}
