package haire_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateJobSeekerprofile {
  WebDriver driver;

  public CreateJobSeekerprofile(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
}
