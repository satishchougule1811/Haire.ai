package haire_pomclass;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCompanyProfile 
{
	
	  WebDriver driver;
		
	  public AddCompanyProfile(WebDriver driver)
  	{
  		this.driver=driver;
  		PageFactory.initElements(driver,this);
  	}
	  
	  @FindBy(xpath="//a[@class=\"btn_comp_sec_btn\"]")
	  private WebElement addcompanyprofile;
	  
	  public void addcompanyprofilem() throws InterruptedException
	  {
		  addcompanyprofile.click();
		  Thread.sleep(1000);		  
	  }
	  
	  @FindBy(xpath="//input[@type='file' and @accept='image/jpeg, image/png']")
	  private WebElement addcompanylogo;
	  
	  
      public void addcompanylogom() throws InterruptedException
  {
	     

	     String filepath="C:\\Users\\Admin\\OneDrive\\New folder\\Companyname.jpg";
	     Thread.sleep(3000);
    	 addcompanylogo.sendKeys(filepath);
    	 Thread.sleep(2000);
    	 

  }
      @FindBy(xpath="//input[@id=\"address\"]")
      private WebElement companyloaction;
	      
      
      public void companyloactionm() throws InterruptedException 
      {
    	  Thread.sleep(2000);
   	  companyloaction.click();
    	  companyloaction.sendKeys("Mumbai");
		  Thread.sleep(2000);
		  companyloaction.sendKeys(Keys.ARROW_DOWN);
		  companyloaction.sendKeys(Keys.ENTER);
		  
          WebElement industrytype=driver.findElement(By.xpath("//li[text()='Tech']"));
          Thread.sleep(2000);
          JavascriptExecutor js = (JavascriptExecutor) driver;
    	  js.executeScript("window.scrollBy(0,500);");
          Thread.sleep(1000);
          industrytype.click();
        
      }
       
      @FindBy(xpath="//li[text()='Software Solutions']")
      private WebElement productandservices;
	      
      public void productandservicesm() throws InterruptedException
   {
       Thread.sleep(2000);
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
	   js1.executeScript("window.scrollBy(0,500);");
       Thread.sleep(1000);
       productandservices.click();
       System.out.println("print productandservices");
	 
       WebElement perksandbefits=driver.findElement(By.xpath("//li[text()='Remote Work']"));
       Thread.sleep(2000);
//             JavascriptExecutor js2 = (JavascriptExecutor) driver;
//             js2.executeScript("window.scrollBy(0, 500);");
//             Thread.sleep(1000);
       perksandbefits.click();
       
      
   
      WebElement cultureandwrokenviroment=driver.findElement(By.xpath("//li[text()='Collaborative']"));
      Thread.sleep(2000);
      JavascriptExecutor js3 = (JavascriptExecutor) driver;
      js3.executeScript("window.scrollBy(0, 500);");
      Thread.sleep(1000);
      cultureandwrokenviroment.click();
   

    
      WebElement aigenetaor=driver.findElement(By.xpath("//button[@class=\"data_generator\"]"));
      JavascriptExecutor js5 = (JavascriptExecutor) driver;
      js5.executeScript("window.scrollBy(0, 500);");
      Thread.sleep(1000);
      aigenetaor.click();
      
      Thread.sleep(7000);
    
   
      WebElement save=driver.findElement(By.xpath("//button[@class='saveContinue margin_bottom_1']"));
      JavascriptExecutor js6 = (JavascriptExecutor) driver;
      js6.executeScript("window.scrollBy(0, 500);");
      save.click();
      
      WebElement Companywebsit=driver.findElement(By.xpath("//input[@id=\"website\"]"));
      Thread.sleep(1000);
      Companywebsit.sendKeys("https://www.arcitech.ai");
      
      Thread.sleep(1000);
      
      
      WebElement Location=driver.findElement(By.xpath("(//input[@class=\"ant-radio-input\"])[1]"));
          Thread.sleep(1000);
          Location.click();
          
          Thread.sleep(1000);
 
        //  WebElement numberofemp=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[2]"));
      WebElement numberofemp=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[2]"));
      Thread.sleep(2000);
      JavascriptExecutor js7 = (JavascriptExecutor) driver;
      js7.executeScript("window.scrollBy(0, 500);");
      numberofemp.click();
      
      Thread.sleep(1000);
      
      
      WebElement addGallery=driver.findElement(By.xpath("//input[@type='file' and  @accept='.jpg,.jpeg,.png']"));
      Thread.sleep(1000);
      String filepath="C:\\Users\\Admin\\OneDrive\\New folder\\Companyname.jpg";
      Thread.sleep(3000);
      addGallery.sendKeys(filepath);
	  Thread.sleep(2000);
	  
	 JavascriptExecutor js8 = (JavascriptExecutor) driver;
     js8.executeScript("window.scrollBy(0, 500);");
     
     
      
      WebElement clickoncheckbox=driver.findElement(By.xpath("//input[@id='terms']"));
      Thread.sleep(2000);
      clickoncheckbox.click();
  
          
          
      WebElement SaveandContinue=driver.findElement(By.xpath("//button[text()='Save & Continue']"));
      Thread.sleep(1000);
      SaveandContinue.click();
      
  
          
  }
	      
}
	     
	  
	  


