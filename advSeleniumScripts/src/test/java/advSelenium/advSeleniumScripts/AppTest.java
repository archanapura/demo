package advSelenium.advSeleniumScripts;

import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void demmo() 
	{
		String browser1=System.getProperty("browser");
		System.out.println(browser1);
		System.out.println("hi");
	}
}
