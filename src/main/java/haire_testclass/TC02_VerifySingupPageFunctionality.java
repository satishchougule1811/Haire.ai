package haire_testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import haire.uitilityclass.Takescreenshot;

public class TC02_VerifySingupPageFunctionality extends BaseClass1
{
	@Test
	public void VerifySingupPageFunctionality() throws IOException
	{
		
		String expectedurl="https://haire.ai/sign-up";
		String actualurl=driver.getCurrentUrl();
		System.out.println("actual url:"+ actualurl );
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("test case is passed");
			Takescreenshot.takeScreenshot(driver, "loginsucessful");
		}
		else
		{
			System.out.println("test case is fail");
			Takescreenshot.takeScreenshot(driver, "login.failed");
		}
		
		
	}
	
	

}
