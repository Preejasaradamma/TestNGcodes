package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocateByID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("name")).sendKeys("Preeja");
		driver.findElement(By.id("eml")).sendKeys("preejas2019@gmail.com");
		driver.findElement(By.name("website")).sendKeys("https://training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("comment")).sendKeys("No Comments");
		
		//radio button
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.name("bike")).click();
		Thread.sleep(4000);
		
		
		// dropdown 
		
		WebElement country= driver.findElement(By.name("country"));
		Select cn = new Select(country);
		cn.selectByVisibleText("India");
		
		WebElement skills= driver.findElement(By.name("skill"));
		Select sk = new Select(skills);
		sk.selectByVisibleText("Quality Assurance");
		sk.selectByVisibleText("Database");
		Thread.sleep(4000);
		
		driver.findElement(By.name("submit")).click();
		
	}

}
