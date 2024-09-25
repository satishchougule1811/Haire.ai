package haire_pomclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReUploadingResume 
{
	WebDriver driver;

    public ReUploadingResume(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/p[1]")
    private WebElement dropdownbuttonjobseekerside;
    
    
    public void dropdownbuttonjobseekerside() throws InterruptedException, AWTException
    {
    	     Thread.sleep(1000);
    	     dropdownbuttonjobseekerside.click();
    	
    	
    	    WebElement JobSeekerProfile=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]"));
    	    Thread.sleep(1000);
    	    JobSeekerProfile.click();
    	
    	
    	    WebElement Reuploading=driver.findElement(By.xpath("//span[text()='Re-Upload Resume']"));
    	    Thread.sleep(1000);
    	    Reuploading.click();
    	    Thread.sleep(1000);

    	    Robot rb = new Robot();

    	    rb.delay(2000);

    	    StringSelection ss = new StringSelection("C:\\Satish Resume\\Satish_Automation Tester.docx");

    	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    	    rb.keyPress(KeyEvent.VK_CONTROL);

    	    rb.keyPress(KeyEvent.VK_V);

    	    rb.keyRelease(KeyEvent.VK_CONTROL);

    	    rb.keyRelease(KeyEvent.VK_V);

    	    rb.keyPress(KeyEvent.VK_ENTER);

    	    rb.keyRelease(KeyEvent.VK_ENTER);
    	    
    	    Thread.sleep(1000);
    	
    	
    	
    	
    }

	
}

