package logical_program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Senkeys_jse {

	public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");

		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");		
		JavascriptExecutor js = ((JavascriptExecutor)driver);        	
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='your email id';", email);
		
        
		
	}

}
