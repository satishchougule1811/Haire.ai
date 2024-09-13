package haire_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHA 
{
	
	  WebDriver driver;
		
	  public LoginPageHA(WebDriver driver)
  	{
  		this.driver=driver;
  		PageFactory.initElements(driver,this);
  	}
	      
	      @FindBy(xpath="//button[text()='Sign up / Login']")
	      private WebElement loginbutton;
	      
	      public void loginbuttonm() throws InterruptedException
	      {
	    	  
	    	  loginbutton.click();
	    	  Thread.sleep(1000);
	      }
	  
	      @FindBy(xpath="//a[text()='Log in']")
	      private WebElement logINButton;
	      
	      public void LogIN() throws InterruptedException
	      
	      {
	    	  
	    	  logINButton.click();
	    	  Thread.sleep(1000);
	      }
	      
	      @FindBy(xpath="//input[@name=\"email\"]")
	      private WebElement emailtextbox;
	      
	        public void email() throws InterruptedException
	      {
	    	  emailtextbox.sendKeys("satish@arcitech.ai");
	    	  Thread.sleep(1000);
	      }
	        
	      @FindBy(xpath="//input[@name=\"password\"]")  
	      private WebElement passwordtextbox;
	      
	      public void password() throws InterruptedException
	      {
	    	  passwordtextbox.sendKeys("Sat@12345");
	    	  Thread.sleep(1000);
	    	  
	      }
	      
	      @FindBy(xpath="//button[text()='Log In']")
	      private WebElement Finalbutton;
	      
	      public void Finalbuttonm() throws InterruptedException
	      {
	    	  Finalbutton.click();
	    	  Thread.sleep(1000);
	      }


}
