package testNGPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class EnableDisableClass {

	@Test
	void test1() 
	{
		System.out.println("The test case will pass");
	}
	
	@Test
	void test2()
	{
		assertEquals(true,false);
	}
	
	@Test
	void test3()
	{
		System.out.println("The test case will skip");
		throw new SkipException("The test case will skip");
	}
	
	@Test(enabled=false)
	void test4()
	{
		System.out.println("The test case will enable");
	}
}
