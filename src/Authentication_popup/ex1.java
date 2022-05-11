package Authentication_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//https://username:password@URL
		String Usename="admin";
		String pwd="admin";
		driver.get("https://"+Usename+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		System.out.println("Title of webpage is " +driver.getTitle());
		
		System.out.println(driver.findElement(By.cssSelector("p")).getText());

	}

}
