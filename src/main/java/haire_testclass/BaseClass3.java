package haire_testclass;

import haire_pomclass.JobSeekerLoginPage;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass3 {
  WebDriver driver;
  Logger log;

  @BeforeMethod
  public void setup() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    log = Logger.getLogger("application.log");
    PropertyConfigurator.configure("log4j.properties");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    log.info("apply wait");
    driver.manage().window().maximize();
    log.info("maximize the window");
    driver.get("https://haire.ai/");
    log.info("URL opened");
    String currenturl = driver.getCurrentUrl();
    System.out.println("actual currenturl:" + currenturl);

    JobSeekerLoginPage loginpage = new JobSeekerLoginPage(driver);
    loginpage.loginbuttonm();
    loginpage.LogIN();
    loginpage.email();
    loginpage.password();
    loginpage.Finalbuttonm();
  }
}
