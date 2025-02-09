package seleniumPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Users\\preej\\Downloads\\New folder");
		options.setExperimentalOption("prefs", prefs);
		
		ChromeDriver driver = new ChromeDriver(options);
	   	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   	 driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
//	   	 driver.manage().window().maximize();
	   	 
	   	driver.findElement(By.linkText("chromedriver_win32.zip")).click();
	}

}
