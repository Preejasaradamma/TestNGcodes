package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.manage().window().maximize();
		
		browserObject.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		browserObject.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));//page time out

        WebElement uploadFile=browserObject.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[1]"));
        
        uploadFile.sendKeys("C:\\2024 Sep\\Docs\\SDET\\SDET-Training-Program.docx-1");
        
        browserObject.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/table/tbody/tr/td[5]/button[1]")).click();

	}
	
	
}
