package haire_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadResume {
  WebDriver driver;

  public UploadResume(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//label[text()='Upload Resume']")
  private WebElement uploadresume;

  public void uploadresume() throws InterruptedException {
    String filepath = "C:\\Satish Resume.docx";
    Thread.sleep(3000);
    uploadresume.sendKeys(filepath);
    Thread.sleep(2000);
  }
}
