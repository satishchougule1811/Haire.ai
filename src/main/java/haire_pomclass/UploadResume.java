package haire_pomclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public void uploadresume() throws InterruptedException, AWTException {
    uploadresume.click();
    Thread.sleep(1000);

    Robot rb = new Robot();

    rb.delay(2000);

    StringSelection ss = new StringSelection(
      "C:\\Satish Resume\\Satish_Automation Tester.docx"
    );

    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    rb.keyPress(KeyEvent.VK_CONTROL);

    rb.keyPress(KeyEvent.VK_V);

    rb.keyRelease(KeyEvent.VK_CONTROL);

    rb.keyRelease(KeyEvent.VK_V);

    rb.keyPress(KeyEvent.VK_ENTER);

    rb.keyRelease(KeyEvent.VK_ENTER);
    
    Thread.sleep(1000);
  }

    @FindBy(xpath = "//input[@type='file' and @accept='image/jpeg, image/png']")
    private WebElement uploadjobseekerprofile;

    public void uploadjobseekerprofilem() throws InterruptedException {
   
    Thread.sleep(1000);
    String filepath = "C:\\DummyImage\\teacher1.jpg";
    Thread.sleep(3000);
    uploadjobseekerprofile.sendKeys(filepath);
    Thread.sleep(2000);
    
//    if (uploadjobseekerprofile.isDisplayed() && uploadjobseekerprofile.isEnabled()) {
//    	uploadjobseekerprofile.sendKeys(filepath);
//    } 
//    
//    else
//    	
//    {
//    	
//        System.out.println("File input element is not interactable.");
//    }
    
     
    Thread.sleep(2000);
    
    WebElement Continuebutton=driver.findElement(By.xpath("//button[text()='Continue']"));
    Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000);");
    Thread.sleep(1000);
    Continuebutton.click();
    
    WebElement AnuualCompansation=driver.findElement(By.xpath("//input[@id='profileDetailsForm_current_ctc']"));
    AnuualCompansation.sendKeys("60000");
    
    Thread.sleep(1000);
    
    WebElement Resignationnotice=driver.findElement(By.xpath("//span[text()='15 Days or less']"));
    Resignationnotice.click();
    
    Thread.sleep(1000);
    
    WebElement SaveandProceed=driver.findElement(By.xpath("//button[text()='Save & Proceed']"));
    SaveandProceed.click();
    
    Thread.sleep(1000);
    
   
    
  }
}
