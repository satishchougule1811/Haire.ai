package haire_testclass;

import haire.uitilityclass.Takescreenshot;
import java.io.IOException;
import org.testng.annotations.Test;

public class TC05_verifyjobseekerSignuupfunctionality extends BaseClass2 {

  @Test
  public void verifypostjobfunctionality() throws IOException {
    String expectedurl = "https://haire.ai/sign-up";
    String actualurl = driver.getCurrentUrl();
    System.out.println("actual url:" + actualurl);

    if (expectedurl.equals(actualurl)) {
      System.out.println("test case is passed");
      Takescreenshot.takeScreenshot(driver, "loginsucessful");
    } else {
      System.out.println("test case is fail");
      Takescreenshot.takeScreenshot(driver, "login.failed");
    }
  }
}
