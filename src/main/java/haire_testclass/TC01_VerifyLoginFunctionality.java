package haire_testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import haire.uitilityclass.Takescreenshot;

public class TC01_VerifyLoginFunctionality extends BaseClass
{
	
	@Test
	public void verifyloginfunctinality() throws IOException
	{
		    String expectedurl="https://haire.ai/login";
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
