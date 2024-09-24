package haire_pomclass;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSeekerSignUp {
  WebDriver driver;

  public JobSeekerSignUp(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//button[text()='Sign up / Login']")
  private WebElement SignUpbutton;

  public void signupbutton() throws InterruptedException {
    SignUpbutton.click();
    Thread.sleep(2000);

    WebElement jobseekername = driver.findElement(
      By.xpath("//input[@name=\"fullName\"]")
    );
    jobseekername.sendKeys("Sandy");

    Thread.sleep(1000);

    WebElement Emailid = driver.findElement(By.xpath("//input[@name=\"email\"]"));
    SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
    String currentTime = dateFormat.format(new Date());
    String dynamicEmail = "satish+" + currentTime + "@arcitech.ai";
    Emailid.sendKeys(dynamicEmail);

    Thread.sleep(1000);

    WebElement contactnumber = driver.findElement(By.xpath("//input[@name=\"contact\"]"));
    contactnumber.sendKeys("8806872125");

    WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
    password.sendKeys("Sat@12345");

    Thread.sleep(1000);

    WebElement confirmpassword = driver.findElement(
      By.xpath("//input[@name='confirmPassword']")
    );
    confirmpassword.sendKeys("Sat@12345");

    Thread.sleep(1000);

    WebElement clickonRegister = driver.findElement(
      By.xpath("//button[@class=\"register-comon-btn\"]")
    );
    clickonRegister.click();
  }

  @FindBy(xpath = "//button[@class=\"blue_btn_links\"]")
  private WebElement VerifyButton;

  public void VerifybuttonM() throws InterruptedException {
    Thread.sleep(60000);
    VerifyButton.click();
  }
}
