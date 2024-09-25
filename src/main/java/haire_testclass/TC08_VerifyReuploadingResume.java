package haire_testclass;

import java.awt.AWTException;

import org.testng.annotations.Test;

import haire_pomclass.ReUploadingResume;

public class TC08_VerifyReuploadingResume extends BaseClass3
{
	@Test
	
	public void Verifyreuploadingresume() throws InterruptedException, AWTException
	{
		
		ReUploadingResume  reupload=new ReUploadingResume (driver);
		reupload.dropdownbuttonjobseekerside();
		
		
		
		
	}
	
}


