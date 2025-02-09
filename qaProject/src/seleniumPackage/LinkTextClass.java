package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement link= driver.findElement(By.linkText("Gmail"));
		if(link.isDisplayed())
		{
			System.out.println("The link is dislayed as link");
		}
		else
		{
			System.out.println("the link is not displayed");
		}
		
		driver.findElement(By.className("gb_X")).click();
	}

}
