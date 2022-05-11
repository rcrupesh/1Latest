package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class all {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		//checking Get OTP button is enabled or not
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		//1. Create an object of WebdriverWait class and pass two parameters 1st driver, 2nd duration
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(2000));
		
		
		//2.using object call Until method and give condition
		
		w.until(ExpectedConditions.visibilityOf(getOTPButton));

	}

}
