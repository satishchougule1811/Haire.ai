package haire_testclass;

import haire_pomclass.UploadResume;
import org.testng.annotations.Test;

public class TC07_VerifyUploadResume extends BaseClass2 {

  @Test
  public void verifyuploadfresume() throws InterruptedException {
    UploadResume uploadcv = new UploadResume(driver);
    uploadcv.uploadresume();
  }
}
