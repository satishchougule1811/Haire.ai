package haire_pomclass;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageHA {
  WebDriver driver;

  public SignUpPageHA(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//button[text()='Sign up / Login']")
  private WebElement SignUpbutton;

  public void signupbutton() throws InterruptedException {
    SignUpbutton.click();
    Thread.sleep(2000);
  }

  @FindBy(xpath = "/html/body/div[1]/section/div[2]/div[2]/div[1]")
  private WebElement Recruiterbutton;

  public void RecruiterButton() throws InterruptedException {
    Thread.sleep(4000);
    Recruiterbutton.click();
    Thread.sleep(1000);
  }

  @FindBy(xpath = "//input[@name=\"fullName\"]")
  private WebElement FullNameTextbox;

  public void FullNameTextBox() throws InterruptedException {
    FullNameTextbox.sendKeys("Satish Recruiter");
    Thread.sleep(1000);
  }

  @FindBy(xpath = "//input[@name=\"email\"]")
  private WebElement EmailTextbox;

  public void EmailTextBox() throws InterruptedException {
    SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
    String currentTime = dateFormat.format(new Date());
    String dynamicEmail = "satish+" + currentTime + "@arcitech.ai";
    EmailTextbox.sendKeys(dynamicEmail);
    //		  EmailTextbox.sendKeys("satishchougule107@gmail.com");
    //		  Thread.sleep(1000);
  }

  @FindBy(xpath = "//input[@name=\"password\"]")
  private WebElement PasswordTextBox;

  public void PasswordTextBoxM() throws InterruptedException {
    PasswordTextBox.sendKeys("Sat@12345");
    Thread.sleep(1000);
  }

  @FindBy(xpath = "//input[@name=\"companyName\"]")
  private WebElement CompanyNameTexBox;

  public void companyNameTexBox() throws InterruptedException {
    CompanyNameTexBox.sendKeys("Arcitech");
    Thread.sleep(1000);
  }

  @FindBy(xpath = "//input[@name=\"contact\"]")
  private WebElement contactNumber;

  public void ContactNumberTextBox() throws InterruptedException {
    contactNumber.sendKeys("8806872125");
    Thread.sleep(1000);
  }

  @FindBy(xpath = "//input[@name=\"confirmPassword\"]")
  private WebElement ConfirmPassword;

  public void confirmPassword() throws InterruptedException {
    ConfirmPassword.sendKeys("Sat@12345");
    Thread.sleep(1000);
  }

  @FindBy(xpath = "/html/body/div[1]/section/div[2]/form/div[4]/div/button")
  private WebElement Register;

  public void ClickOnRegister() throws InterruptedException {
    Register.click();
    Thread.sleep(3000);
  }

  @FindBy(xpath = "//button[@class=\"blue_btn_links\"]")
  private WebElement VerifyButton;

  public void VerifybuttonM() throws InterruptedException {
    Thread.sleep(25000);
    VerifyButton.click();
  }
}
