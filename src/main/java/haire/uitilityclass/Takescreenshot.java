package haire.uitilityclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import haire_testclass.BaseClass;

public class Takescreenshot
{
	
	public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
TakesScreenshot ts = (TakesScreenshot) driver;
File sourceFile = ts.getScreenshotAs(OutputType.FILE);

// Define the destination directory
String destinationDirectory = "C:\\Eclipse_Workspace\\HaireProject\\screenshot\\";

// Get current date and time
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
String currentDateAndTime = dateFormat.format(new Date());

// Construct the filename with current date and time
String fileName = screenshotName  + currentDateAndTime + ".jpg";

File destFile = new File(destinationDirectory + fileName);
FileHandler.copy(sourceFile, destFile);
System.out.println("Screenshot is taken and saved as: " + fileName);
	}

}
