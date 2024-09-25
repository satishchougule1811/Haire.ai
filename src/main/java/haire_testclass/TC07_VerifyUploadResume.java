package haire_testclass;

import haire_pomclass.UploadResume;
import java.awt.AWTException;
import org.testng.annotations.Test;

public class TC07_VerifyUploadResume extends BaseClass2 {

  @Test
    public void verifyuploadfresume() throws InterruptedException, AWTException {
    UploadResume uploadcv = new UploadResume(driver);
    uploadcv.uploadresume();
    uploadcv.uploadjobseekerprofilem();
  }
}
   