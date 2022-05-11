package Fail_TakesScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public static void captureScreenMethod() throws Exception
	{
	System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	        try
	        {
	            driver.get("https://www.softwaretestingmaterial.com");
	    driver.navigate().refresh();
	    //driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
	    driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath
	                }
	        catch(Exception e)
	        {
	            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           FileHandler.copy(screenshotFile, new File("D:\\selenium\\Screenshot.png"));
	        }
	        driver.close();
	}	
}
