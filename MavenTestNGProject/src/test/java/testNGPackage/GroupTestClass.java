package testNGPackage;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class GroupTestClass {
	
	@Test(groups="log")
	void test1() 
	{
		System.out.println("The test case will pass");
	}
	
	@Test(groups="log")
	void test2()
	{
		assertEquals(true,false);
	}
	
	@Test(groups="log")
	void test3()
	{
		System.out.println("The test case will skip");
		throw new SkipException("The test case will skip");
	}
	
	@Test(groups="enable")
	void test4()
	{
		System.out.println("The test case will enable");
	}

}
