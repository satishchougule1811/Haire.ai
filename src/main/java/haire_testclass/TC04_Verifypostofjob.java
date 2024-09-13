package haire_testclass;

import org.testng.annotations.Test;

import haire_pomclass.PostaJobHA;

public class TC04_Verifypostofjob extends BaseClass
{
	
	@Test
	public void verifypostjobfunctionality() throws InterruptedException
	{

		PostaJobHA postjob=new PostaJobHA(driver);
		postjob.PostJob();
	
	}
}
