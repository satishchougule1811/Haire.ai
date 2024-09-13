package haire_testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import haire.uitilityclass.Takescreenshot;
import haire_pomclass.AddCompanyProfile;

public class TC03_Verifyaddcompanyprofile extends BaseClass1
 {
	
	@Test
	public void Verifyaddcompanyprofile() throws InterruptedException, IOException
	{
		
		
		 AddCompanyProfile addcompanyprofile=new AddCompanyProfile(driver);
		 addcompanyprofile.addcompanyprofilem();
	     addcompanyprofile.addcompanylogom();
		 addcompanyprofile.companyloactionm();
		 addcompanyprofile.productandservicesm();
		 
		    String expectedurl="https://haire.ai/dashboard";
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
