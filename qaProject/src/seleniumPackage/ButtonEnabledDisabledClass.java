package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEnabledDisabledClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");
		
	Boolean log=	driver.findElement(By.id("loginlabel")).isEnabled();
	if(log)
	{
		System.out.println("The button is enabled");
	}
	else
	{
		System.out.println("The button is disabled");
	}
	}

}
