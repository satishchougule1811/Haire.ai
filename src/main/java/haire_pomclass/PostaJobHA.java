package haire_pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostaJobHA 
{
	 WebDriver driver;
		
	  public PostaJobHA (WebDriver driver)
 	{
 		this.driver=driver;
 		PageFactory.initElements(driver,this);
 	}
	  
	 @FindBy(xpath="(//button[@class='post_blue_btn'])[1]")
	 private WebElement postajob;
	 
		public void PostJob() throws InterruptedException 
		{
		
			
		 Thread.sleep(2000);	
		 postajob.click();
		 
		 
	     WebElement jobtitle=driver.findElement(By.xpath("//input[@id=\"title\"]"));
		 jobtitle.sendKeys("Automation Tester");
		 
		 Thread.sleep(1000);
		 
		 WebElement skillrequired=driver.findElement(By.xpath("//li[text()='Selenium']"));
		 skillrequired.click();
		 
		 Thread.sleep(1000);
		 
		 WebElement emptype=driver.findElement(By.xpath("//input[@id='employment_type']"));
		 emptype.click();
		 Thread.sleep(1000);
		 emptype.sendKeys(Keys.ARROW_DOWN);
		 emptype.sendKeys(Keys.ENTER);
		 
		 
		 WebElement Senororitylevel=driver.findElement(By.xpath("//input[@id='seniority']"));
		 Senororitylevel.click();
		 Thread.sleep(1000);
		 Senororitylevel.sendKeys(Keys.ARROW_DOWN);
		 Senororitylevel.sendKeys(Keys.ENTER);
		 
		 WebElement Yearsofexp=driver.findElement(By.xpath("//input[@id='experience']"));
		 Yearsofexp.click();
		 Thread.sleep(1000);
		 Yearsofexp.sendKeys(Keys.ARROW_DOWN);
		 Yearsofexp.sendKeys(Keys.ENTER);
		 
		 
		 WebElement Vacancies=driver.findElement(By.xpath("//input[@id='vacancies']"));
		 Vacancies.sendKeys("2");
		 
		 JavascriptExecutor js8 = (JavascriptExecutor) driver;
         js8.executeScript("window.scrollBy(0, 500);");
		 
		 WebElement keyduties=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/ul[1]/li[1]"));
		 Thread.sleep(1000);
		 keyduties.click();
		 
		 WebElement Nextbutton1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]"));
		 Thread.sleep(2000);
		 Nextbutton1.click();
		 
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(500, 0);");
		 
		// WebElement Qualification=driver.findElement(By.xpath("//input[@id='qualification']"));
		 WebElement Qualification=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]"));
		 Qualification.click();
		 Thread.sleep(1000);
		 Qualification.sendKeys(Keys.ARROW_DOWN);
	     Qualification.sendKeys(Keys.ENTER);
	     
	     WebElement modeofwrok=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]"));
	     modeofwrok.click();
	     
	      WebElement Location=driver.findElement(By.xpath("//input[@id='location']"));
	      Thread.sleep(2000);
	      Location.click();
	      Location.sendKeys("Mumbai");
		  Thread.sleep(2000);
		  Location.sendKeys(Keys.ARROW_DOWN);
		  Location.sendKeys(Keys.ENTER);
		  
		  Thread.sleep(1000);
		  
		  WebElement annualcompansationto=driver.findElement(By.xpath("//input[@id='salary_min']"));
		  annualcompansationto.sendKeys("60");
		  
		  Thread.sleep(1000);
		  
		  WebElement annualcompansationfrom=driver.findElement(By.xpath("//input[@id='salary_max']"));
		  annualcompansationfrom.sendKeys("90");
		  
		  WebElement currancy=driver.findElement(By.xpath("//input[@id='currency']"));
		  currancy.click();
		  Thread.sleep(1000);
		  currancy.sendKeys(Keys.ARROW_DOWN);
		  currancy.sendKeys(Keys.ENTER);
		  
		  
		  WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		  checkbox.click();
		  
		  WebElement radiobutton=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"));
		  radiobutton.click();
		  
		  Thread.sleep(1000);
		  
		  WebElement Generatewithai=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"));
		  Generatewithai.click();
		  
		  Thread.sleep(4000);
		  
		  WebElement clickonnextbutton=driver.findElement(By.xpath("//button[@class='ant-btn css-17sses9 ant-btn-primary']"));
		  clickonnextbutton.click();
		  
		  WebElement allcredits=driver.findElement(By.xpath("//input[@id='credits_alloted']"));
		  allcredits.sendKeys("2");
		  
		  
		  
		  
				
		  
		  
		  
		  
		  
		  
		  
		  
		 
	 
		}}
	 



